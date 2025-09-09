/*
 * 版权声明 (c) 1996, 2020, Oracle 及/或其关联公司。保留所有权利。
 * ORACLE 专有/机密。使用须遵守许可条款。
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.io;

/**
 * 一个类若实现了 {@link java.io.Serializable} 接口，即可使该类具备可序列化能力。
 *
 * <p><strong>警告：反序列化不受信任的数据具有内在危险性，应尽量避免。
 * 应根据 {@extLink secure_coding_guidelines_javase Java SE 安全编码指南} 的
 * “序列化与反序列化”章节对不受信任数据进行严格校验。
 * {@extLink serialization_filter_guide 序列化过滤} 描述了防御性使用序列化过滤器的最佳实践。
 * </strong></p>
 *
 * 未实现此接口的类，其状态不会被序列化或反序列化。可序列化类的所有子类型也都是
 * 可序列化的。该接口不包含任何方法或字段，仅用于标识“可序列化”这一语义。<p>
 *
 * 非可序列化类的子类型也可能被序列化与反序列化。序列化期间，不会为不可序列化的
 * 超类的字段写出任何数据。反序列化期间，将使用第一个（最底层的）不可序列化超类的
 * 无参构造器来初始化其字段。该构造器必须对正在被反序列化的子类可访问。若不满足，
 * 却将类声明为 Serializable，即为错误；此错误会在运行时被检测到。可序列化的子类型
 * 可以负责保存和恢复其不可序列化超类型的 public、protected 以及（若可访问）包访问
 * 字段。关于反序列化流程（包含可序列化与不可序列化类的处理）的详细规范，参见
 * <a href="{@docRoot}/../specs/serialization/input.html#the-objectinputstream-class">
 * <cite>Java 对象序列化规范</cite></a> 第 3.1 节。<p>
 *
 * 当遍历对象图时，可能会遇到不支持 Serializable 接口的对象。在这种情况下将抛出
 * NotSerializableException，并指出该不可序列化对象的类。<p>
 *
 * 在序列化与反序列化过程中需要特殊处理的类，必须实现以下精确签名的特殊方法：
 *
 * <PRE>
 * private void writeObject(java.io.ObjectOutputStream out)
 *     throws IOException
 * private void readObject(java.io.ObjectInputStream in)
 *     throws IOException, ClassNotFoundException;
 * private void readObjectNoData()
 *     throws ObjectStreamException;
 * </PRE>
 *
 * <p>writeObject 方法负责将该类的对象状态写出，以便对应的 readObject 方法能够恢复。
 * 通过调用 out.defaultWriteObject 可启用保存对象字段的默认机制。该方法无需关心其
 * 超类或子类所属的状态。可通过对每个字段调用 ObjectOutputStream 的 writeObject 方法
 * 或使用 DataOutput 支持的原始类型写出方法来保存状态。
 *
 * <p>readObject 方法负责从流中读取并恢复类的字段。它可以调用 in.defaultReadObject
 * 来启用恢复对象非静态、非 transient 字段的默认机制。defaultReadObject 方法使用流中
 * 的信息，将保存于流中的对象字段赋值到当前对象中对应名称的字段。当类演进新增字段时，
 * 可由此机制处理。该方法无需关心其超类或子类所属的状态。通过从 ObjectInputStream 读取
 * 各个字段的数据并赋值到对象相应字段来恢复状态。DataInput 支持读取原始数据类型。
 *
 * <p>readObjectNoData 方法用于在序列化流未将给定类列为被反序列化对象的超类时，初始化
 * 该类对象的状态。这可能发生在接收方使用的类版本与发送方不同，且接收方的版本扩展了
 * 发送方未扩展的类；也可能发生在序列化流被篡改的情况下。因此，即使来源“恶意”或不完整，
 * readObjectNoData 也有助于正确初始化反序列化对象。
 *
 * <p>在对象写入流时需要指定替代对象的可序列化类，应实现以下精确签名的方法：
 *
 * <PRE>
 * ANY-ACCESS-MODIFIER Object writeReplace() throws ObjectStreamException;
 * </PRE><p>
 *
 * 若该方法存在且对正在序列化的对象所属类中定义的方法可访问，则序列化过程会调用
 * writeReplace。因而该方法可以是 private、protected 或包可见。子类对该方法的访问
 * 遵循 Java 可访问性规则。<p>
 *
 * 在从流中读取其实例时需要指定替代对象的类，应实现以下精确签名的方法：
 *
 * <PRE>
 * ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
 * </PRE><p>
 *
 * readResolve 的调用与可访问性规则与 writeReplace 相同。<p>
 *
 * 枚举类型均可序列化，并在序列化与反序列化期间遵循
 * <a href="{@docRoot}/../specs/serialization/index.html"><cite>Java 对象序列化规范</cite></a>
 * 的处理。上述特殊处理方法在枚举类型上将被忽略。<p>
 *
 * 记录类（Record）可以实现 {@code Serializable}，并遵循
 * <a href="{@docRoot}/../specs/serialization/serial-arch.html#serialization-of-records">
 * <cite>Java 对象序列化规范</cite> 第 1.13 节“记录的序列化”</a> 的处理。上述特殊处理方法
 * 在记录类型上将被忽略。<p>
 *
 * 序列化运行时会为每个可序列化类关联一个版本号 serialVersionUID，用于在反序列化时
 * 校验序列化对象的发送方与接收方所加载的类在序列化方面的兼容性。若接收方为该对象加载的
 * 类的 serialVersionUID 与发送方对应类不同，则反序列化将抛出 {@link InvalidClassException}。
 * 可序列化类可以通过声明名为 {@code "serialVersionUID"} 的字段来显式指定其 serialVersionUID，
 * 该字段必须是 static、final，且类型为 {@code long}：
 *
 * <PRE>
 * ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L;
 * </PRE>
 *
 * 若未显式声明 serialVersionUID，序列化运行时将基于该类的多种特征计算一个默认值，
 * 详见 <a href="{@docRoot}/../specs/serialization/index.html"><cite>Java 对象序列化规范</cite></a>。
 * 该规范定义枚举类型的 serialVersionUID 为 0L。然而，<em>强烈建议</em>除枚举类型以外的所有可序列化类
 * 显式声明 serialVersionUID，因为默认计算对编译器实现细节高度敏感，可能导致反序列化期间出现
 * 意料之外的 {@code InvalidClassException}。因此，为了在不同 Java 编译器实现之间保证一致的
 * serialVersionUID，必须显式声明该值。同时，强烈建议尽可能使用 {@code private} 修饰符来声明，
 * 因为该字段仅对直接声明的类有意义——serialVersionUID 作为继承成员并无用途。数组类不能显式声明
 * serialVersionUID，因此始终使用默认计算值，但数组类不要求匹配 serialVersionUID。
 *
 * @spec serialization/index.html Java 对象序列化规范
 * @see java.io.ObjectOutputStream
 * @see java.io.ObjectInputStream
 * @see java.io.ObjectOutput
 * @see java.io.ObjectInput
 * @see java.io.Externalizable
 * @since   1.1
 */
public interface Serializable {
}

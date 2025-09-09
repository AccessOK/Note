# jdk21模块

## java.base: 定义 Java SE 平台的基础 API。

    java.io: 通过数据流、序列化和文件系统提供系统输入输出。
    java.lang: 提供 Java 语言设计所必需的基础类。
    java.lang.annotation: 提供 Java 语言注解设施的库支持。
    java.lang.constant: 提供用于表示运行时实体（如类、方法句柄）及类文件实体（如常量池项、invokedynamic 调用点）的名义描述符的类与接口。
    java.lang.foreign: 提供对 Java 运行时之外的内存与函数的低层访问。
    java.lang.invoke: 提供与 JVM 交互的低层原语。
    java.lang.module: 提供用于支持模块描述符，并通过解析与服务绑定创建模块配置的类。
    java.lang.ref: 提供引用对象类，以有限方式与垃圾回收器交互。
    java.lang.reflect: 提供获取类与对象反射信息的类与接口。
    java.lang.runtime: 为 Java 语言提供低层运行时支持。
    java.math: 提供任意精度整数（BigInteger）与任意精度小数（BigDecimal）运算的类。
    java.net: 提供实现网络应用的类。
    java.net.spi: `java.net` 包的服务提供者类。
    java.nio: 定义作为数据容器的缓冲区，并概览其他 NIO 包。
    java.nio.channels: 定义通道（连接可执行 I/O 的实体，如文件与套接字）与选择器（用于多路复用的非阻塞 I/O）。
    java.nio.channels.spi: `java.nio.channels` 包的服务提供者类。
    java.nio.charset: 定义用于在字节与 Unicode 字符间转换的字符集、解码器与编码器。
    java.nio.charset.spi: `java.nio.charset` 包的服务提供者类。
    java.nio.file: 定义 JVM 访问文件、文件属性与文件系统的接口与类。
    java.nio.file.attribute: 提供访问文件及文件系统属性的接口与类。
    java.nio.file.spi: `java.nio.file` 包的服务提供者类。
    java.security: 提供安全框架的类与接口。
    java.security.cert: 提供解析与管理证书、证书吊销列表（CRL）与认证路径的类与接口。
    java.security.interfaces: 提供生成 RSA（PKCS#1）与 DSA（FIPS-186）密钥的接口。
    java.security.spec: 提供密钥规范与算法参数规范的类与接口。
    java.text: 以与自然语言无关的方式处理文本、日期、数字与消息的类与接口。
    java.text.spi: `java.text` 包的服务提供者类。
    java.time: 处理日期、时间、瞬时与时长的主 API。
    java.time.chrono: 面向非默认 ISO 历法系统的通用 API。
    java.time.format: 提供日期与时间的打印与解析类。
    java.time.temporal: 通过字段与单位访问日期时间，并提供日期时间调整器。
    java.time.zone: 提供对时区及其规则的支持。
    java.util: 包含集合框架、部分国际化支持类、服务加载器、属性、随机数生成、字符串解析与扫描、Base64 编解码、位数组及其他实用工具类。
    java.util.concurrent: 并发编程常用的工具类。
    java.util.concurrent.atomic: 支持单变量无锁线程安全编程的小型工具集。
    java.util.concurrent.locks: 提供区别于内置同步与监视器的锁与条件等待框架的接口与类。
    java.util.function: 函数式接口为 lambda 表达式与方法引用提供目标类型。
    java.util.jar: 提供读取与写入基于标准 ZIP 且可含清单的 JAR 格式的类。
    java.util.random: 提供支持通用随机数生成 API 的类与接口。
    java.util.regex: 提供按正则表达式匹配字符序列的类。
    java.util.spi: `java.util` 包的服务提供者类。
    java.util.stream: 提供对元素流进行函数式操作（如集合的 map-reduce）的类。
    java.util.zip: 提供读取与写入标准 ZIP 与 GZIP 文件格式的类。
    javax.crypto: 提供密码学操作的类与接口。
    javax.crypto.interfaces: 提供 Diffie-Hellman 密钥的接口（PKCS #3）。
    javax.crypto.spec: 提供密钥规范与算法参数规范的类与接口。
    javax.net: 提供网络应用的类。
    javax.net.ssl: 提供安全套接字包的类。
    javax.security.auth: 提供认证与授权框架。
    javax.security.auth.callback: 提供服务与应用交互以获取（如用户名、密码）或显示（如错误、警告）信息所需的类。
    javax.security.auth.login: 提供可插拔认证框架。
    javax.security.auth.spi: 提供用于实现可插拔认证模块的接口。
    javax.security.auth.x500: 提供在 Subject 中存储 X500 主体与 X500 私密凭据的类。
    javax.security.cert: 提供公钥证书的类。

## java.compiler: 定义语言模型、注解处理以及 Java 编译器相关的 API。

## java.datatransfer: 定义在应用之间及应用内部进行数据传输的 API。

java.desktop: 定义 AWT 与 Swing 用户界面工具包，以及无障碍、音频、图像、打印与 JavaBeans 等 API。
java.instrument: 定义允许代理对运行于 JVM 上的程序进行插桩的服务。
java.logging: 定义 Java 日志 API。
java.management: 定义 Java 管理扩展（JMX）API。
java.management.rmi: 定义 Java 管理扩展（JMX）远程 API 的 RMI 连接器。
java.naming: 定义 Java 命名与目录接口（JNDI）API。
java.net.http: 定义 HTTP 客户端与 WebSocket API。
java.prefs: 定义首选项（Preferences）API。
java.rmi: 定义远程方法调用（RMI）API。
java.scripting: 定义脚本 API。
java.se: 定义 Java SE 平台的 API。
java.security.jgss: 定义 IETF 通用安全服务 API（GSS-API）的 Java 绑定。
java.security.sasl: 定义对 IETF 简单认证与安全层（SASL）的 Java 支持。
java.smartcardio: 定义 Java 智能卡 I/O API。
java.sql: 定义 JDBC API。
java.sql.rowset: 定义 JDBC RowSet API。
java.transaction.xa: 定义用于在 JDBC 中支持分布式事务的 API。
java.xml: 定义用于 XML 处理（JAXP）的 Java API。
java.xml.crypto: 定义 XML 加密相关 API。
jdk.accessibility: 定义供辅助技术实现者使用的 JDK 工具类。
jdk.attach: 定义附加（attach）API。
jdk.charsets: 提供不包含于 `java.base` 的字符集（主要为双字节及 IBM 字符集）。
jdk.compiler: 定义系统 Java 编译器的实现及其命令行工具 `javac`。
jdk.crypto.cryptoki: 提供 SunPKCS11 安全提供者的实现。
jdk.crypto.ec: 提供 SunEC 安全提供者的实现。
jdk.dynalink: 定义对对象的高级操作进行动态链接的 API。
jdk.editpad: 提供被 `jdk.jshell` 使用的编辑面板服务实现。
jdk.hotspot.agent: 定义 HotSpot 可服务性代理（Serviceability Agent）的实现。
jdk.httpserver: 定义 JDK 特定的 HTTP 服务器 API，并提供用于运行最简 HTTP 服务器的 `jwebserver` 工具。
jdk.incubator.vector: 定义一种 API，用于表达可在运行时可靠编译为 SIMD 指令的计算，例如 x64 上的 AVX、AArch64 上的 NEON。
jdk.jartool: 定义用于操作 Java 存档（JAR）文件的工具，包括 `jar` 与 `jarsigner`。
jdk.javadoc: 定义系统文档工具及其命令行工具 `javadoc` 的实现。
jdk.jcmd: 定义用于 JVM 诊断与故障排查的工具，如 `jcmd`、`jps`、`jstat` 等。
jdk.jconsole: 定义 JMX 图形化工具 `jconsole`，用于监控与管理运行中的应用。
jdk.jdeps: 定义用于分析 Java 库与程序依赖的工具，包括 `jdeps`、`javap` 与 `jdeprscan`。
jdk.jdi: 定义 Java 调试接口（JDI）。
jdk.jdwp.agent: 提供 Java 调试线协议（JDWP）代理的实现。
jdk.jfr: 定义 JDK Flight Recorder（JFR）API。
jdk.jlink: 定义 `jlink`（创建运行时镜像）、`jmod`（创建与操作 JMOD 文件）与 `jimage`（检查 JDK 实现特定的类与资源容器文件）等工具。
jdk.jpackage: 定义 Java 打包工具 `jpackage`。
jdk.jshell: 提供用于评估 Java 代码片段的 `jshell` 工具，并定义用于建模与执行代码片段的 JDK 特定 API。
jdk.jsobject: 定义 JavaScript 对象的 API。
jdk.jstatd: 定义 `jstatd` 工具，用于启动守护进程以便 `jstat` 远程监控 JVM 统计信息。
jdk.localedata: 提供除美国地区外的地区化数据。
jdk.management: 定义 JVM 的 JDK 特定管理接口。
jdk.management.agent: 定义 JMX 管理代理。
jdk.management.jfr: 定义 JDK Flight Recorder 的管理接口。
jdk.naming.dns: 提供 DNS Java 命名提供者的实现。
jdk.naming.rmi: 提供 RMI Java 命名提供者的实现。
jdk.net: 定义 JDK 特定的网络 API。
jdk.nio.mapmode: 定义 JDK 特定的文件映射模式。
jdk.sctp: 定义 JDK 特定的 SCTP API。
jdk.security.auth: 提供 `javax.security.auth.*` 接口及多种认证模块的实现。
jdk.security.jgss: 定义对 GSS-API 的 JDK 扩展以及 SASL GSSAPI 机制的实现。
jdk.xml.dom: 定义不属于 Java SE API 的 W3C 文档对象模型（DOM）API 的子集。
jdk.zipfs: 提供 Zip 文件系统提供者的实现。

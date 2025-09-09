# Java-basic

## 2. jdk-24 api
java.base: 定义Java SE平台的基础API。
java.compiler：定义语言模型、注解处理和Java编译器API。
java.datatransfer：定义在应用程序之间和内部传输数据的API。
java.desktop：定义AWT和Swing用户界面工具包，以及可访问性、音频、图像、打印和JavaBeans的API。
java.instrument：定义允许代理对在JVM上运行的程序进行插桩的服务。
java.logging：定义Java日志记录API。
java.management：定义Java管理扩展(JMX) API。
java.management.rmi：定义Java管理扩展(JMX)远程API的RMI连接器。
java.naming：定义Java命名和目录接口(JNDI) API。
java.net.http：定义HTTP客户端和WebSocket API。
java.prefs：定义首选项API。
java.rmi：定义远程方法调用(RMI) API。
java.scripting：定义脚本API。
java.se：定义Java SE平台的API。
java.security.jgss：定义IETF通用安全服务API(GSS-API)的Java绑定。
java.security.sasl：定义对IETF简单认证和安全层(SASL)的Java支持。
java.smartcardio：定义Java智能卡I/O API。
java.sql：定义JDBC API。
java.sql.rowset：定义JDBC RowSet API。
java.transaction.xa：定义支持JDBC中分布式事务的API。
java.xml：定义Java XML处理API(JAXP)。
java.xml.crypto：定义XML加密API。
jdk.accessibility：定义辅助技术实现者使用的JDK工具类。
jdk.attach：定义附加API。
jdk.charsets：提供不在java.base中的字符集（主要是双字节和IBM字符集）。
jdk.compiler：定义系统Java编译器的实现及其命令行等效工具javac。
jdk.crypto.cryptoki：提供SunPKCS11安全提供者的实现。
jdk.dynalink：定义对象高级操作动态链接的API。
jdk.editpad：提供jdk.jshell使用的编辑板服务的实现。
jdk.hotspot.agent：定义HotSpot可服务性代理的实现。
jdk.httpserver：定义JDK特定的HTTP服务器API，并提供用于运行最小HTTP服务器的jwebserver工具。
jdk.incubator.vector：定义用于表达计算的API，这些计算可以在运行时可靠地编译为SIMD指令，如x64上的AVX指令和AArch64上的NEON指令。
jdk.jartool：定义用于操作Java归档(JAR)文件的工具，包括jar和jarsigner工具。
jdk.javadoc：定义系统文档工具的实现及其命令行等效工具javadoc。
jdk.jcmd：定义用于诊断和故障排除JVM的工具，如jcmd、jps、jstat工具。
jdk.jconsole：定义JMX图形工具jconsole，用于监控和管理运行中的应用程序。
jdk.jdeps：定义用于分析Java库和程序中依赖关系的工具，包括jdeps、javap、jdeprscan和jnativescan工具。
jdk.jdi：定义Java调试接口。
jdk.jdwp.agent：提供Java调试线协议(JDWP)代理的实现。
jdk.jfr：定义JDK Flight Recorder的API。
jdk.jlink：定义用于创建运行时镜像的jlink工具、用于创建和操作JMOD文件的jmod工具，以及用于检查JDK实现特定的类和资源容器文件的jimage工具。
jdk.jpackage：定义Java打包工具jpackage。
jdk.jshell：提供用于评估Java代码片段的jshell工具，并定义用于建模和执行片段的JDK特定API。
jdk.jsobject：定义JavaScript对象的API。
jdk.jstatd：定义jstatd工具，用于启动守护进程，使jstat工具能够远程监控JVM统计信息。
jdk.localedata：提供除美国地区设置以外的地区数据。
jdk.management：定义JVM的JDK特定管理接口。
jdk.management.agent：定义JMX管理代理。
jdk.management.jfr：定义JDK Flight Recorder的管理接口。
jdk.naming.dns：提供DNS Java命名提供者的实现。
jdk.naming.rmi：提供RMI Java命名提供者的实现。
jdk.net：定义JDK特定的网络API。
jdk.nio.mapmode：定义JDK特定的文件映射模式。
jdk.sctp：定义JDK特定的SCTP API。
jdk.security.auth：提供javax.security.auth.*接口和各种认证模块的实现。
jdk.security.jgss：定义GSS-API的JDK扩展和SASL GSSAPI机制的实现。
jdk.xml.dom: 定义不属于Java SE API的W3C文档对象模型(DOM) API子集。
jdk.zipfs: 提供ZIP文件系统提供者的实现。

## 2. jdk-8 包描述

### java.* 核心包
java.applet：提供创建applet所需的类以及applet用于与其applet上下文通信的类。
java.awt：包含创建用户界面以及绘制图形和图像的所有类。
java.awt.color：提供颜色空间的类。
java.awt.datatransfer：提供在应用程序之间和内部传输数据的接口和类。
java.awt.dnd：拖放是许多图形用户界面系统中发现的直接操作手势，它提供了一种在逻辑上与GUI中的表示元素相关联的两个实体之间传输信息的机制。
java.awt.event：提供处理AWT组件触发的不同类型事件的接口和类。
java.awt.font：提供与字体相关的类和接口。
java.awt.geom：提供Java 2D类，用于定义和执行与二维几何相关的对象操作。
java.awt.im：提供输入法框架的类和接口。
java.awt.im.spi：提供使开发输入法成为可能的接口，这些输入法可以与任何Java运行时环境一起使用。
java.awt.image：提供创建和修改图像的类。
java.awt.image.renderable：提供用于生成与渲染无关的图像的类和接口。
java.awt.print：提供通用打印API的类和接口。
java.beans：包含与开发bean相关的类——基于JavaBeans™架构的组件。
java.beans.beancontext：提供与bean上下文相关的类和接口。
java.io：通过数据流、序列化和文件系统提供系统输入和输出。
java.lang：提供对Java编程语言设计基础的类。
java.lang.annotation：为Java编程语言注解设施提供库支持。
java.lang.instrument：提供服务，允许Java编程语言代理对在JVM上运行的程序进行插桩。
java.lang.invoke：java.lang.invoke包包含由Java核心类库和虚拟机直接提供的动态语言支持。
java.lang.management：提供用于监控和管理Java虚拟机以及Java运行时中其他组件的管理接口。
java.lang.ref：提供引用对象类，支持与垃圾收集器的有限程度交互。
java.lang.reflect：提供用于获取关于类和对象的反射信息的类和接口。
java.math：提供执行任意精度整数算术(BigInteger)和任意精度十进制算术(BigDecimal)的类。
java.net：提供实现网络应用程序的类。
java.nio：定义缓冲区（数据的容器），并提供其他NIO包的概述。
java.nio.channels：定义通道，表示与能够执行I/O操作的实体的连接，如文件和套接字；定义选择器，用于多路复用、非阻塞I/O操作。
java.nio.channels.spi：java.nio.channels包的服务提供者类。
java.nio.charset：定义字符集、解码器和编码器，用于在字节和Unicode字符之间转换。
java.nio.charset.spi：java.nio.charset包的服务提供者类。
java.nio.file：定义Java虚拟机访问文件、文件属性和文件系统的接口和类。
java.nio.file.attribute：提供访问文件和文件系统属性的接口和类。
java.nio.file.spi：java.nio.file包的服务提供者类。
java.rmi：提供RMI包。
java.rmi.activation：为RMI对象激活提供支持。
java.rmi.dgc：为RMI分布式垃圾收集(DGC)提供类和接口。
java.rmi.registry：为RMI注册表提供一个类和两个接口。
java.rmi.server：为支持RMI的服务器端提供类和接口。
java.security：提供安全框架的类和接口。
java.security.acl：此包中的类和接口已被java.security包中的类取代。
java.security.cert：提供用于解析和管理证书、证书撤销列表(CRL)和认证路径的类和接口。
java.security.interfaces：提供生成RSA（Rivest、Shamir和Adleman非对称密码算法）密钥的接口，如RSA实验室技术说明PKCS#1中定义的，以及NIST的FIPS-186中定义的DSA（数字签名算法）密钥。
java.security.spec：提供密钥规范和算法参数规范的类和接口。
java.sql：提供使用Java™编程语言访问和处理存储在数据源（通常是关系数据库）中的数据的API。
java.text：提供以独立于自然语言的方式处理文本、日期、数字和消息的类和接口。
java.text.spi：java.text包中类的服务提供者类。
java.time：日期、时间、时刻和持续时间的主要API。
java.time.chrono：除默认ISO之外的其他日历系统的通用API。
java.time.format：提供用于打印和解析日期和时间的类。
java.time.temporal：使用字段和单位访问日期和时间，以及日期时间调整器。
java.time.zone：对时区及其规则的支持。
java.util：包含集合框架、遗留集合类、事件模型、日期和时间设施、国际化和各种实用工具类（字符串标记器、随机数生成器和位数组）。
java.util.concurrent：在并发编程中通常有用的实用工具类。
java.util.concurrent.atomic：支持在单个变量上进行无锁线程安全编程的小型工具包类。
java.util.concurrent.locks：提供锁定和等待条件的框架的接口和类，这与内置同步和监视器不同。
java.util.function：函数式接口为lambda表达式和方法引用提供目标类型。
java.util.jar：提供用于读取和写入JAR（Java归档）文件格式的类，该格式基于标准ZIP文件格式，具有可选的清单文件。
java.util.logging：提供Java™ 2平台核心日志记录设施的类和接口。
java.util.prefs：此包允许应用程序存储和检索用户和系统首选项以及配置数据。
java.util.regex：用于根据正则表达式指定的模式匹配字符序列的类。
java.util.spi：java.util包中类的服务提供者类。
java.util.stream：支持对元素流进行函数式风格操作的类，如集合上的map-reduce转换。
java.util.zip：提供用于读取和写入标准ZIP和GZIP文件格式的类。

# spring-mvc-freemarker-demo
maven, spring 4.3.9


报错：java.lang.ClassNotFoundException: org.springframework.web.filter.CharacterEncodingFilter

	六月 26, 2017 11:06:22 下午 org.apache.tomcat.util.digester.SetPropertiesRule begin
	警告: [SetPropertiesRule]{Server/Service/Engine/Host/Context} Setting property 'source' to 'org.eclipse.jst.j2ee.server:spring-mvc-freemarker-demo' did not find a matching property.
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Server version:        Apache Tomcat/8.5.12
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Server built:          Mar 8 2017 17:41:47 UTC
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Server number:         8.5.12.0
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: OS Name:               Windows 10
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: OS Version:            10.0
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Architecture:          amd64
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Java Home:             C:\Java\jdk1.8.0_121\jre
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: JVM Version:           1.8.0_121-b13
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: JVM Vendor:            Oracle Corporation
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: CATALINA_BASE:         C:\Users\CoderDream\workspaceN3\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: CATALINA_HOME:         C:\Dev\apache-tomcat-8.5.12-windows-x64\apache-tomcat-8.5.12
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Command line argument: -Dcatalina.base=C:\Users\CoderDream\workspaceN3\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Command line argument: -Dcatalina.home=C:\Dev\apache-tomcat-8.5.12-windows-x64\apache-tomcat-8.5.12
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Command line argument: -Dwtp.deploy=C:\Users\CoderDream\workspaceN3\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Command line argument: -Djava.endorsed.dirs=C:\Dev\apache-tomcat-8.5.12-windows-x64\apache-tomcat-8.5.12\endorsed
	六月 26, 2017 11:06:22 下午 org.apache.catalina.startup.VersionLoggerListener log
	信息: Command line argument: -Dfile.encoding=UTF-8
	六月 26, 2017 11:06:22 下午 org.apache.catalina.core.AprLifecycleListener lifecycleEvent
	信息: The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: C:\Java\jdk1.8.0_121\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:/Java/jdk1.8.0_121/bin/../jre/bin/server;C:/Java/jdk1.8.0_121/bin/../jre/bin;C:/Java/jdk1.8.0_121/bin/../jre/lib/amd64;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\app\CoderDream\product\11.2.0\dbhome_2\bin;C:\app\CoderDream\product\11.2.0\dbhome_1\bin;C:\Program Files (x86)\SepanderSoft;C:\Java\jdk1.8.0_121\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Java\apache-maven-3.5.0\bin;C:\Program Files (x86)\Calibre2\;C:\Program Files\nodejs\node.exe;C:\Program Files\Microsoft\Web Platform Installer\;C:\Program Files (x86)\Microsoft ASP.NET\ASP.NET Web Pages\v1.0\;C:\Program Files (x86)\Windows Kits\8.0\Windows Performance Toolkit\;C:\Program Files\Microsoft SQL Server\110\Tools\Binn\;C:\Program Files\TortoiseSVN\bin;C:\Program Files (x86)\Microsoft SQL Server\100\Tools\Binn\;C:\Program Files\Microsoft SQL Server\100\Tools\Binn\;C:\Program Files\Microsoft SQL Server\100\DTS\Binn\;C:\Program Files (x86)\Microsoft SQL Server\100\Tools\Binn\VSShell\Common7\IDE\;C:\Program Files (x86)\Microsoft SQL Server\100\DTS\Binn\;C:\Program Files (x86)\Microsoft Visual Studio 9.0\Common7\IDE\PrivateAssemblies\;C:\nodejs\;C:\Users\CoderDream\AppData\Local\Microsoft\WindowsApps;C:\Users\CoderDream\AppData\Roaming\npm;C:\Dev\eclipse-jee-neon-3-win32-x86_64\eclipse;;.
	六月 26, 2017 11:06:22 下午 org.apache.coyote.AbstractProtocol init
	信息: Initializing ProtocolHandler ["http-nio-8080"]
	六月 26, 2017 11:06:23 下午 org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
	信息: Using a shared selector for servlet write/read
	六月 26, 2017 11:06:23 下午 org.apache.coyote.AbstractProtocol init
	信息: Initializing ProtocolHandler ["ajp-nio-8009"]
	六月 26, 2017 11:06:23 下午 org.apache.tomcat.util.net.NioSelectorPool getSharedSelector
	信息: Using a shared selector for servlet write/read
	六月 26, 2017 11:06:23 下午 org.apache.catalina.startup.Catalina load
	信息: Initialization processed in 1718 ms
	六月 26, 2017 11:06:23 下午 org.apache.catalina.core.StandardService startInternal
	信息: Starting service Catalina
	六月 26, 2017 11:06:23 下午 org.apache.catalina.core.StandardEngine startInternal
	信息: Starting Servlet Engine: Apache Tomcat/8.5.12
	六月 26, 2017 11:06:24 下午 org.apache.catalina.core.StandardContext filterStart
	严重: Exception starting filter encodingFilter
	java.lang.ClassNotFoundException: org.springframework.web.filter.CharacterEncodingFilter
		at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1285)
		at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1119)
		at org.apache.catalina.core.DefaultInstanceManager.loadClass(DefaultInstanceManager.java:511)
		at org.apache.catalina.core.DefaultInstanceManager.loadClassMaybePrivileged(DefaultInstanceManager.java:492)
		at org.apache.catalina.core.DefaultInstanceManager.newInstance(DefaultInstanceManager.java:118)
		at org.apache.catalina.core.ApplicationFilterConfig.getFilter(ApplicationFilterConfig.java:258)
		at org.apache.catalina.core.ApplicationFilterConfig.<init>(ApplicationFilterConfig.java:105)
		at org.apache.catalina.core.StandardContext.filterStart(StandardContext.java:4599)
		at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5242)
		at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:150)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1419)
		at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1409)
		at java.util.concurrent.FutureTask.run(FutureTask.java:266)
		at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
		at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
		at java.lang.Thread.run(Thread.java:745)
	
	六月 26, 2017 11:06:24 下午 org.apache.catalina.core.StandardContext startInternal
	严重: One or more Filters failed to start. Full details will be found in the appropriate container log file
	六月 26, 2017 11:06:24 下午 org.apache.catalina.core.StandardContext startInternal
	严重: Context [/spring-mvc-freemarker-demo] startup failed due to previous errors
	六月 26, 2017 11:06:24 下午 org.apache.coyote.AbstractProtocol start
	信息: Starting ProtocolHandler [http-nio-8080]
	六月 26, 2017 11:06:24 下午 org.apache.coyote.AbstractProtocol start
	信息: Starting ProtocolHandler [ajp-nio-8009]
	六月 26, 2017 11:06:24 下午 org.apache.catalina.startup.Catalina start
	信息: Server startup in 979 ms


删除Servers面板中的Tomcat和Server文件夹。
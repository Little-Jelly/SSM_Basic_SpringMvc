# SSM_Basic_SpringMvc(Project_T6)

springmvc前端与控制器的交互1：

无法出现com.yyf.Controller.FirstController的应该有的效果，出现404
分析原因：路径问题+后端没有报出任何错误，所以只能采取路径映射排查的步骤

测试步骤：

1. 测试web.xml的配置问题：
新建一个servlet：com.yyf.core.test.Servlet.ServletTestWebxml
在web.xml中添加入该servlet对应的映射关系
部署到tomcat上，能够成功访问该servlet
结论：在web.xml中映射到servlet没有问题，所以映射到前端控制器（dispatcherServlet）也是可以的因为
它也是一个servlet。
2. 报了一个错误
“java.lang.ClassNotFoundException: org.springframework.web.servlet.DispatcherServlet”
把lib目录从src目录下面移动到web/WEB-INF/下面
从Project Structure中将这些包引入（坑死个人）
结果：成功访问
结论：路劲问题，除了配置问题，还有引入文件的配置问题（耶耶耶）


springmvc数据绑定：
简单数据绑定
简单数据绑定1：简单基本类型（8大类型）
简单数据绑定2：简单基本类型对应的对象类型
简单数据绑定3：指定输入参数名


复杂数据绑定
复杂数据绑定1：数组
复杂数据邦迪2：集合

自定义数据转换器

springmvc视图解析器

springmvc拦截器：使用到的接口
org.springframework.web.servlet.HandlerInterceptor

文件下载：
org.springframework.web.multipart.commons.CommonMultipartResolver



问题：
1. 加入jar包：
jackson-annotations-2.8.8.jar
jackson-core-2.8.8.jar
jackson-databind-2.8.8.jar
加入这三个jar包之后，出现错误：
org.springframework.beans.factory.BeanCreationException: 
Error creating bean with name 'org.springframework.web.servlet.function.support.RouterFunctionMapping': 
Invocation of init method failed; 
nested exception is java.lang.NoClassDefFoundError: 
com/fasterxml/jackson/databind/exc/InvalidDefinitionException
这个问题需要弄一弄

问题：
在web/WEB-INF/lib/中没有加入jar包：
commons-fileupload-1.3.2.jar
commons-io-2.5.jar
并且要加入到project的结构中，才能够正常使用，否则不能使用


重新测试
jackson-annotations-2.8.8.jar
jackson-core-2.8.8.jar
jackson-databind-2.8.8.jar
这三个jar包
搞定了：
结论：成功
做法：将spring的版本退回到4.3.6,（原来的版本5.3.2）
分析：是spring的版本与jackson的版本不匹配导致的
记录一下错误信息：
“26-Feb-2020 08:34:47.078 WARNING [http-nio-8080-exec-1] org.springframework.web.context.support.XmlWebApplicationContext.refresh Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter': Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/exc/InvalidDefinitionException
 26-Feb-2020 08:34:47.079 SEVERE [http-nio-8080-exec-1] org.springframework.web.servlet.DispatcherServlet.initServletBean Context initialization failed
 	org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter': Instantiation of bean failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter]: Constructor threw exception; nested exception is java.lang.NoClassDefFoundError: com/fasterxml/jackson/databind/exc/InvalidDefinitionException
 		at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateBean(AbstractAutowireCapableBeanFactory.java:1320)
”


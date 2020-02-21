# SSM_Basic_SpringMvc


无法出现com.yyf.Controller.FirstController的应该有的效果，出现404
分析原因：路径问题+后端没有报出任何错误，所以只能采取路径映射排查的步骤

测试步骤：

1. 测试web.xml的配置问题：
新建一个servlet：com.yyf.test.Servlet.ServletTestWebxml
在web.xml中添加入该servlet对应的映射关系
部署到tomcat上，能够成功访问该servlet
结论：在web.xml中映射到servlet没有问题，所以映射到前端控制器（dispatcherServlet）也是可以的因为
它也是一个servlet。


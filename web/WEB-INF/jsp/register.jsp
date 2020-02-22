<%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/22
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registerUser " method="post">
    用户名：<input type="text" name="username" /><br/>
    密码： <input type="text" name="password"/><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>

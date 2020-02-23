<%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/23
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>系统页面</title>
</head>
<body>
    当前用户： ${USER_SESSION.username}
    <a href="${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>

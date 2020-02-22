<%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/22
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单查询</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
        订单编号：<input type="text" name="ordersId" /> <br />
        所属用户：<input type="text" name="user.username"/>
        <input type="submit" value="查询"/>
    </form>
</body>
</html>

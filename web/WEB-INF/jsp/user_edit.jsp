<%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/22
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/editUsers" method="post" id='formid'>
        <table>
            <tr>
                <td>选择</td>
                <td>用户名</td>
            </tr>
            <tr>
                <td><input name="users[0].id" value="1" type="checkbox" /></td>
                <td><input name="users[0].username" value="tome" type="text" /></td>
            </tr>
            <tr>
                <td><input name="users[1].id" value="2" type="checkbox"/></td>
                <td><input name="users[1].username" value="jack" type="text"/></td>
            </tr>
        </table>
        <input type="submit" value="修改" />
    </form>
</body>
</html>

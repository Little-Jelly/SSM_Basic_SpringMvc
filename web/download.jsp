<%@ page import="java.net.URL" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/23
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载页面</title>
</head>
<body>
    <a href="${pageContext.request.contextPath} /download?filename=<%=URLEncoder.encode("1.jpg", "UTF-8")%>">
        中文名称文件下载
    </a>
</body>
</html>

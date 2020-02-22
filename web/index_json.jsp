<%--
  Created by IntelliJ IDEA.
  User: ZhangYoufa
  Date: 2020/2/22
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试JSON交互</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"
        src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
    </script>
    <script type="text/javascript">
        function testJson(){
            var username = $("#username").val();
            var password = $("#password").val();
            alert("你点击了按钮");
            $.ajax({
                url : "${pageContext.request.contextPath} /testJson",
                type: "post",
                data: JSON.stringify({username:username, password:password}),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success : function(data){
                    if(data != null){
                        alert("您输入的用户名为：" + data.username+
                                        "密码为："+data.password);
                    }
                }
            });
        }
    </script>
</head>
<body>
    <form>
        用户名：<input type="text" name="username" id="username" /><br />
        密码：  <input type="password" name="password" id="password" /><br/>
                <input type="button" value="测试JOSN交互" onclick="testJson()" />
    </form>
</body>
</html>

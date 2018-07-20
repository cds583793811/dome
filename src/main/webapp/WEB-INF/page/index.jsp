<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%> 
<!DOCTYPE htm >
<html>
<head>
<title>首页</title>
<style type="text/css">
a {
    text-decoration: none;
    color: #fff;
    font-size: 14px;
}

h3 {
    width: 180px;
    height: 38px;
    margin: 100px auto;
    text-align: center;
    line-height: 38px;
    background: #5BC0DE;
    border-radius: 4px;
}
</style>
</head>
<body>
<form action="" name="userForm">
        用户名：<input type="text" name="loginName"><br>
         密码：<input type="text" name="password"><br>
        <input type="button" value="登录"
            onclick="login()">
    </form>
    <h3>
        <a href="${path }/user/userInfo">进入用户管1111111理页</a>
    </h3>
    
    <script type="text/javascript">
        function login() {
            var form = document.forms[0];
            form.action = "<%=basePath %>user/login";
            form.method = "post";
            form.submit();
        }
    </script>
</body>
</html>
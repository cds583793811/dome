<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>编辑用户</title>

<script type="text/javascript">
    function updateUser() {
        var form = document.forms[0];
        form.action = "<%=basePath %>user/updateUser";
        form.method = "post";
        form.submit();
    }
</script>

</head>
<body>
    <h1>添加用户</h1>
    <form action="" name="userForm">
        <input type="hidden" name="id" value="${user.id }" /> 姓名：<input
            type="text" name="username" value="${user.username }" /> 年龄：<input
            type="text" name="age" value="${user.age }" /> <input type="button"
            value="编辑" onclick="updateUser()" />
    </form>
</body>

</html>
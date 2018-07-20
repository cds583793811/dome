<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE htm >
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>

<!-- 引入样式 -->
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

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
	
	<div id="app" style="margin-left: 30%">
		<el-form ref="form" :model="form" label-width="80px"> <el-form-item label="用户名"> 
				<el-input v-model="form.loginName" style="width: 30%"></el-input>
			</el-form-item> 
			<el-form-item label="密码"> 
				<el-input v-model="form.password" style="width: 30%"></el-input> 
			</el-form-item>
			 <el-form-item> 
				 <el-button type="primary" @click="onSubmit">登录</el-button> 
				 <el-button>取消</el-button>
			</el-form-item>
		 </el-form>
	</div>
	<h3>
		<a href="${path }/user/userInfo">进入用户管理页</a>
	</h3>
	
</body>
  <script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>

<script type="text/javascript">
    	new Vue({
    		el: '#app',
    		data:function() {
    			return {
    				form: {
    					loginName: "",
    					password: ""
    				}
    			}
    		},
    		methods: {
    			onSubmit() {
    				axios.get('/user/login',{
      				  params:{
      				    loginName: this.form.loginName,
      				    password: this.form.password
      				  }
      				}).then(function(response){
      				  console.log("response------>", response);
      					console.log("response.data------>", response.data);
      				}).catch(function(err){
      				  console.log("err------>", err);
      				});	
    			}
    		}
    	})
    </script>


</html>
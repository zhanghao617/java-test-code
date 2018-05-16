<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>国家水电系统</title>
<link rel="stylesheet" type="text/css" href="../../static/css/bootstrap.min.css" />
<style type="text/css">
	body{
		background-image:url("../../static/images/bg.png");
		background-size:100% 100%;
	}
</style>
</head>
<body>
	<div class="container-fluid">
	<form class="form-horizontal" action="Login_register" method="post">
		<table class="table">
			<caption><b>国家水电用户注册：</b></caption>
			<tr>
				<td><label class="control-label">用户账号:</label></td>
				<td><input type="text" placeholder="请输入用户账号"  class="form-control" required name="username"  pattern="^[0-9]*$" /></td>
				<td style="vertical-align: middle;color:red;">*</td>
			</tr>
			<tr>
				<td><label class="control-label">用户密码:</label></td>
				<td><input type="password" placeholder="请输入用户密码"  class="form-control" required name="password" /></td>
				<td style="vertical-align: middle;color:red;">*</td>
			</tr>
			<tr>
				<td><label class="control-label">用户姓名:</label></td>
				<td><input type="text" placeholder="请输入用户姓名"  class="form-control" required name="name" /></td>
				<td style="vertical-align: middle;color:red;">*</td>
			</tr>
			<tr>
				<td><label class="control-label">用户电话:</label></td>
				<td><input type="text" placeholder="请输入用户电话"  class="form-control" required name="phone" pattern="^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}" /></td>
				<td style="vertical-align: middle;color:red;">*</td>
			</tr>
			<tr>
				<td><label class="control-label" >用户地址:</label></td>
				<td>
					<input type="text" placeholder="请输入用户地址"  class="form-control" required name="address" />
					<input type="hidden" required name="addDate" id="addDate"/>
				</td>
				<td style="vertical-align: middle;color:red;">*</td>
			</tr>
			<tr style="text-align:center">
				<td colspan="3">
					<button type="submit" class="btn btn-primary" >提交</button>&#12288;&#12288;
					<button type="reset" class="btn btn-primary" >重置</button>
				</td>
			</tr>
		</table>
	</form>
	</div>
<script type="text/javascript">
	var s = new Date();
	var a = document.getElementById("addDate");
	var c= s.getFullYear()+"-"+(s.getMonth()+1)+"-"+s.getDate();
	a.value=c;
</script>
</body>
</html>


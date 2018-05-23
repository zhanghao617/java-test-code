<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>水电资费管理系统 </title>
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.7 -->
	<link rel="stylesheet" href="/static/bower_components/bootstrap/dist/css/bootstrap.min.css">
	<!-- Font Awesome -->
	<link rel="stylesheet" href="/static/bower_components/font-awesome/css/font-awesome.min.css">
	<!-- Ionicons -->
	<link rel="stylesheet" href="/static/bower_components/Ionicons/css/ionicons.min.css">
	<!-- Theme style -->
	<link rel="stylesheet" href="/static/dist/css/AdminLTE.min.css">
	<!-- iCheck -->
	<link rel="stylesheet" href="/static/plugins/iCheck/square/blue.css">

	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<style>
		.dd{
			padding: 25px;
			background-color:#000000;
			background-color:rgba(0,0,0,0.2);
		}
		.ddd{
			padding: 10px;
			background-color: #FFFFFF;
			background-color:rgba(0,0,0,0.1);
		}
		.dd label{
			color: #8a6343;
		}
		#zz {
			color: #8a6343;
		}
	</style>
</head>
<body class="hold-transition login-page"  style="background: url(/static/images/login_2.jpg)"><%--style="background: url(/static/dist/img/smh.gif)">--%>
<div class="div1"><img class="img1" src="../../static/images/login_4.jpg" /></div>
<div class="login-box">
	<div class="login-logo ddd">
		<h2 id="zz">注册账号</h2>
	</div>
	<!-- /.login-logo -->
	<div class="login-box-body dd">
		<c:if test="${not empty message}">
			<p class="login-box-msg text-success">${message}</p>
		</c:if>
		<form method="post" class="saveForm">
			<div class="form-group">
				<label>姓名</label>
				<input type="text" class="form-control" name="name" required>
			</div>
			<div class="form-group has-feedback">
				<label>手机号码(用于登录)</label>
				<input type="text" class="form-control" name="phone" placeholder="手机号码" required>
			</div>
			<div class="form-group has-feedback">
				<label>密码</label>
				<input type="password" class="form-control" name="password" placeholder="密码">
			</div>
			<div class="form-group">
				<label>地址</label>
				<input type="text" class="form-control" name="address" required>
			</div>
		</form>
		<div class="row">
			<div class="col-xs-6">
				<a href="/" class="btn btn-primary btn-block btn-flat">取消</a>
			</div>
			<div class="col-xs-6">
				<button id="saveBtn" class="btn btn-primary btn-block btn-flat">保存</button>
			</div>
		</div>
	</div>
	<!-- /.login-box-body -->

</div>
<!-- /.login-box -->


<!-- jQuery 3 -->
<script src="/static/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="/static/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="/static/plugins/iCheck/icheck.min.js"></script>
<script>
    $(function () {
        $('input').iCheck({
            checkboxClass: 'icheckbox_square-blue',
            radioClass: 'iradio_square-blue',
            increaseArea: '20%' /* optional */
        });
        $("#saveBtn").click(function () {
            $(".saveForm").submit();
        });
    });
</script>
</body>
</html>v>
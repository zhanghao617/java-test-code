<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>国家水电</title>
<link href="<%=basePath%>file/css/bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
	#main{
		border:1px solid #fff;
		background-image:url("../file/images/bg.png");
		border-radius:10px;
		margin-top:25px;
	}
	table{
		margin-top:10px;
		width:100%;
	}
	td{
		text-align:center;
	}
	.leftMenu{
		text-align:right;
		color:#fff;
		}
	.tip{
		text-align:center;
	}
</style>
</head>

<body>
	<div class="container-fluid" id="main">
	<form action="" method="post">
	<table class="table table-striped" >
		<caption style="background-color: skyblue;">
      			<font color="#FFF"><b>&#12288;个人密码管理</b> &nbsp; &nbsp; &nbsp; &nbsp;</font>
		</caption>
		<tbody>
			<tr >
				<th style="text-align:right">原始密码：</th>
				<th style="text-align:left" ><input type="text" class="form-control" style="width:230px;"></th>
			</tr>
			<tr >
				<th style="text-align:right">新设密码：</th>
				<th style="text-align:left" ><input type="text" class="form-control" style="width:230px;"></th>
			</tr>
			<tr >
				<th style="text-align:right">重复密码：</th>
				<th style="text-align:left" ><input type="text" class="form-control" style="width:230px;"></th>
			</tr>
			<tr >
				<th style="text-align:right;width:40%;" >
					<button type="submit" class="btn btn-primary">修改</button>
				</th>
				<th style="text-align:left;width:60%;" >
					<button type="reset" class="btn btn-primary" >重置</button>
				</th>
			</tr>
		</tbody>
	</table>
	</form>
	</div>
</body>
</html>

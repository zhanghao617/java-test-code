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
	th,td{
		text-align:center;
	}
	.leftMenu{
		color:#fff;
		padding-left:80%;
	}
</style>
</head>

<body>
	<div class="container-fluid" id="main">
	<table class="table table-striped" >
		<caption style="background-color: skyblue;">
			<font color="#FFF"><b>&#12288;水电费价格信息公示 </b></font>&nbsp;&nbsp;
		</caption>
		<thead>
			<tr>
				<th>序号</th>
				<th>电费（元/度）</th>
				<th>水费（元/吨）</th>
				<th>添加时间</th>
				<th>终止日期</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>1</td>
				<td>0.5</td>
				<td>0.8</td>
				<td>2017-9-10</td>
				<td>2018-9-10</td>
			</tr>
		</tbody>
	</table>
	</div>
	
</body>
</html>

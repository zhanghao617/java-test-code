<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统提示</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<style type="text/css">
		body,#content{
			background-image:url("file/images/bg.png");
			background-size:100% 100%;
		}
	</style>
  </head>
  
  <body>
  	<br/>
	<div id="leftText" style="width:340px;height:80px;">
			<a class="list-group-item active"><br /></a> 
			<p align="center" class="list-group-item">
				<br/><br/> <font size="6px;">国家水电提示：</font><br/><br/> 
				<font size="4px;">${Message}</font> <br/><br/>
				<br />
			</p>
		</div>
  </body>
</html>

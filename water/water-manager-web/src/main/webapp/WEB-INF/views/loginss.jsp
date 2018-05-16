<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W#C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <link href="../../static/css/bootstrap.min.css" rel="stylesheet">
   <link href="../../static/css/login.css" rel="stylesheet">
   <link href="../../static/css/chrome.css" rel="stylesheet">
  </head>
  
  <body>  
  <div class="container-fluid">
	  <nav class="navbar navbar-default navbar-static-top" style="margin-top:-20px;">
	  		<div class="container">
	  			<a href="javascript:void(0)" onclick="javascript:art.dialog('简&#12288;&#12288;介：你好，我是国电精灵，国电系统于2017年4月开发. <br/>版&#12288;&#12288;本：1.0.0.1  <br/>作&#12288;&#12288;者：@Mr.Z  <br/>版权所有：@作心',{id:'memdiv'});">关于国电</a>
	  			<a href="http://weibo.com/sgcc">官方微博</a>
	  			<a href="javascript:void(0)" onclick="javascript:art.dialog.open('<%=basePath%>register.jsp',{id:'memdiv',width :350,height:417,title:'用户注册'});">注册</a>
	  			<a href="javascript:void(0)" onclick="window.location.reload()">登录</a>
	  			
	  		</div>
	  </nav>
	  <div class="div1"><img class="img1" src="<%=basePath%>../../static/images/login_4.jpg" /></div>
	  <div class="div2">
	  		<div class="formDiv" id="login">
	  			<div class="formDiv2">
	  			<h3>登录</h3><br/>
	  			<form action="Login_login" method="post" class="form-horizontal" name="myform">
		  			<div class="input-group col-sm-12"><span class="input-group-addon">用户账号</span>
			             		<input type="text" class="form-control" placeholder="用户账号/手机号码" required id="username" name="username"/><br/>
			             </div>
			        <br/>
	          		<div class="input-group col-sm-12"><span class="input-group-addon">用户密码</span>
				  				<input type="password" class="form-control" placeholder="用户密码" required id="password" name="password" /><br/>
				  		 </div> 
	          		<br/>
	          		<div class="input-group col-sm-12">
	          				<span style="color:red;">${Message}</span>
				  		 </div> 
	          		<br/>
	            	<div class="input-group col-sm-12" style="text-align: center;">
	            			<button type="submit" class="btn btn-primary" onclick="login();">用户登录</button>
	            			&#12288;&#12288;&#12288;&#12288;
	            			<button type="submit" class="btn btn-primary" onclick="Alogin();">管理登录</button>
			       		 <p><br/>我还没有账户？<a href="javascript:void(0)" onclick="javascript:art.dialog.open('<%=basePath%>register.jsp',{id:'memdiv',width :355,height:417,title:'用户注册'});"><b>免费注册</b></a></p>
			        </div>
			        <div class="tip">
			        	Tip：
		       		 	<br/>&#12288;&#12288;如您确认登录信息正确仍提示错误，请尝试刷新网页，
		       		 	给您带来的不便敬请谅解！<br/><br/>
		       		 </div>
	  			</form>
	  			</div>
	  		</div>
  	  </div>
  	  <p>&nbsp;</p>
  	  <h5>豫ICP备20170502 | 版权所有：@作心</h5>
  </div>
  
    <script type="text/javascript" src="<%=basePath%>../../static/js/artDialog.js"></script>
    <script type="text/javascript" src="<%=basePath%>../../static/js/iframeTools.js"></script>
    <script type="text/javascript">
    	function Alogin(){
    		document.myform.action="Login_Alogin";
    	}
    	function login(){
    		document.myform.action="Login_login";
    	}
    </script>
  </body>
</html>

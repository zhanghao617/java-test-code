<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>国家水电系统</title>
<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.3.3/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="../jquery-easyui-1.3.3/themes/icon.css">
<script type="text/javascript" src="../jquery-easyui-1.3.3/jquery.min.js"></script>
<script type="text/javascript" src="../jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function(){
		var treeData=[{
			text:"基本数据维护",
			iconCls:"icon-menu",
			children:[{
				text:"水电价格",
				iconCls:"icon-chart",
				attributes:{
					url:"waterInfo.jsp"
				}
			},{
				text:"水电费缴纳",
				iconCls:"icon-manage",
				attributes:{
					url:"水电费缴纳.jsp"
				}
			},{
				text:"修改密码",
				iconCls:"icon-tip",
				attributes:{
					url:"changePwd.jsp"
				}
			}]
		}];
		
		// 实例化树菜单
		$("#tree").tree({
			data:treeData,
			lines:true,
			onClick:function(node){
				if(node.attributes){
					openTab(node.text,node.attributes.url,node.iconCls);
				}
			}
		});
		
		// 新增Tab
		function openTab(text,url,iconCls){
			if($("#tabs").tabs('exists',text)){
				$("#tabs").tabs('select',text);
			}else{
				var content="<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src="+url+"></iframe>";
				$("#tabs").tabs('add',{
					title:text,
					closable:true,
					content:content,
					iconCls:iconCls,
				});
			}
		}
	});
</script>
</head>
<body class="easyui-layout">
	<div region="north" style="height: 85px;background-color: #E0EDFF">
		<div align="left" style="float: left; height:80px"><img src="<%=basePath%>file/images/logo.png"></div>
		<div style="padding-top: 50px;padding-right: 20px; float:right">当前用户：&nbsp;<font color="red" >${currentUser.userName}</font><a href="login!logout" style="margin-left:20px;text-decoration:none">注销登录</a></div>
		
	</div>
	<div region="center">
		<div class="easyui-tabs" fit="true" border="false" id="tabs">
			<div title="首页"  data-options="iconCls:'icon-welcome'">
				<div align="center" style="padding-top: 100px;"><font color="red" size="10">欢迎使用国家水电管理系统</font></div>
			</div>
		</div>
	</div>
	<div region="west" style="width: 150px;" title="导航菜单" split="true">
		<ul id="tree"></ul>
	</div>
	<div region="south" style="height: 25px;" align="center">版权所有：<a href="#">芳宝宝</a></div>
</body>
</html>
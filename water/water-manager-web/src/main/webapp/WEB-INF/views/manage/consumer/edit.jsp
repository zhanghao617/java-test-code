<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>水电资费管理系统</title>
    <%@include file="../../include/css.jsp"%>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="../../include/header.jsp"%>

    <!-- =============================================== -->

    <jsp:include page="../../include/sidebar.jsp">
        <jsp:param name="menu" value="manage_select"/>
    </jsp:include>

    <!-- =============================================== -->

    <div class="content-wrapper"  style="background: url(/static/images/login_2.jpg);">

        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                欢迎访问国家水电缴费系统
                <small>it all starts here</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="/home"><i class="fa fa-dashboard"></i>首页</a></li>
                <li><a href="#">所在位置</a></li>
                <li class="">价格变更</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Default box -->
            <div class="box dd">
                <div class="box-header with-border">
                    <h3 class="box-title d">国家水电价格变更</h3>
                    <div class="box-tools pull-right">
                        <a href="/manage/consumer/home" class="btn btn-success btn-sm" style="text-align: right">
                            <i class="fa fa-sign-out"></i> 返回列表
                        </a>
                    </div>
                </div>
                <div class="box-body">
                    <form method="post" id="saveForm">
                        <input type="hidden" name="id" value="${tminfo.id}">
                        <div class="form-group">
                            <label>用户账号</label>
                            <input type="text" name="aId" class="form-control" disabled value="${account.name}">
                        </div>
                        <div class="form-group">
                            <label>本月已用水(吨)</label>
                            <input type="text" name="waterNumber" class="form-control" value="${tminfo.waternumber}">
                        </div>
                        <div class="form-group">
                            <label>本月已用电(度)</label>
                            <input type="text" name="eletricNumber" class="form-control" value="${tminfo.eletricnumber}">
                        </div>
                        <div class="form-group">
                            <label>用水费用(元)</label>
                            <input type="text" name="waterMoney" class="form-control" value="${tminfo.watermoney}">
                        </div>
                        <div class="form-group">
                            <label>用电费用(元)</label>
                            <input type="text" name="eletricMoney" class="form-control" value="${tminfo.eletricmoney}">
                        </div>
                        <div class="form-group">
                            <label>截至日期</label>
                            <input type="text" name="endDate" class="form-control" value="${tminfo.enddate}">
                        </div>
                    </form>
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    <button class="btn pull-right btn-primary" id="saveBtn">保存</button>
                    <small>官方网站：<a href="#">www.ChinaLife.com</a></small>
                </div>
                <!-- /.box-footer-->
            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->


    <%@include file="../../include/footer.jsp"%>

    <!-- Control Sidebar控制边栏 -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Tab panes -->
        <div class="tab-content">
            <!--右侧下拉框-->
            <div class="tab-pane" id="control-sidebar-home-tab"></div>
        </div>
    </aside>
</div>
<!-- ./wrapper -->
<%@include file="../../include/js.jsp"%>
<script>
    $(function () {
        $("#saveBtn").click(function () {
            $("#saveForm").submit();
        });
    })
</script>
</body>
</html>

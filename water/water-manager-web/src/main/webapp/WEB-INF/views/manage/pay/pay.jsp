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
        <jsp:param name="menu" value="manage_pay"/>
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
                <li class="">缴费公栏</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Default box -->
            <div class="box dd">
                <div class="box-header with-border">
                    <h3 class="box-title d">国家水电缴费</h3>
                    <div class="box-tools pull-right">
                        <a href="/manage/select" class="btn btn-success btn-sm" style="text-align: right">
                            <i class="fa fa-sign-out"></i> 返回列表
                        </a>
                    </div>
                </div>
                <div class="box-body">
                    <form method="post" id="saveForm">

                        <div class="form-group">
                            <label>电费缴纳金额（元）：</label>
                            <input type="text" class="form-control" name="eletricMoney" placeholder="电费缴纳金额" width="900px"/>
                        </div>
                        <div class="form-group">
                            <label>电费缴纳金额（元）：</label>
                            <input type="text" class="form-control" name="eletricMoney" placeholder="电费缴纳金额" width="900px"/>
                        </div>

                        <div class="form-group" style="text-align:center">
                            <button type="submit" class="btn btn-primary" id="saveBtn">  缴 纳  </button>
                            &#12288;&#12288;&#12288;&#12288;&#12288;&#12288;
                            <a href="/manage/pay" type="reset" class="btn btn-primary">  重 置  </a>
                        </div>
                        <c:forEach items="${eletricInfo}" var="e" varStatus="a">
                            <input type="hidden" value="${e.mid }" name="mid">
                        </c:forEach>
                    </form>
                </div>
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

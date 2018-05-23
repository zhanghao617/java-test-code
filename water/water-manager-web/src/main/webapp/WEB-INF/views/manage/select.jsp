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
    <%@include file="../include/css.jsp"%>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="../include/header.jsp"%>

    <!-- =============================================== -->

    <jsp:include page="../include/sidebar.jsp">
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
                <li class="">价格公示</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Default box -->
            <div class="box dd">
                <div class="box-header with-border">
                    <h3 class="box-title d">国家水电价格公示</h3>
                    <div class="box-tools pull-right">
                        <a href="/manage/newPrice" class="btn btn-success btn-sm" style="text-align: right">
                            <i class="fa fa-plus"></i> 新增价格
                        </a>
                    </div>
                </div>
                <div class="box-body">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <td>序号</td>
                                <td>水费（元/吨）</td>
                                <td>电费（元/度）</td>
                                <td>实施时间</td>
                                <td>终止日期</td>
                                <td>#</td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${waterInfo}" var="water">
                                <tr>
                                    <td>${water.wid}</td>
                                    <td>${water.wprice}</td>
                                    <td>${water.eprice}</td>
                                    <td><fmt:formatDate value="${water.startdate}"/></td>
                                    <td><fmt:formatDate value="${water.enddate}"/></td>
                                    <td>
                                            <%--<shiro:hasPermission name="account:edit">--%>
                                        <a style="color: #4ebde9;" href="/manage/${water.wid}/edit"><i class="fa fa-edit"></i></a>
                                        <a style="color: #e92ba6;" class="delLink" rel="${water.wid}" href="javascript:;"><i class="fa fa-trash"></i></a>
                                            <%--</shiro:hasPermission>--%>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
                <div class="box-footer dd">
                    <small>官方网站：<a href="#">www.ChinaLife.com</a></small>
                </div>
                <!-- /.box-footer-->
            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->


    <%@include file="../include/footer.jsp"%>

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
<%@include file="../include/js.jsp"%>
<script src="/static/plugins/layer/layer.js"></script>
<script></script>
<script>
    $(function () {
        $(".delLink").click(function(){
            var id = $(this).attr("rel");
            layer.confirm("确定要删除吗",function (index) {
                parent.layer.close(index);
                // window.parent.location.reload();
                $.get("/manage/"+id+"/del").done(function (result) {
                    if(result.status == 'success') {
                        window.history.go(0);
                    } else {
                        layer.msg(result.message);
                    }
                }).error(function () {
                    layer.msg("服务器忙");
                });
            })
        });
    });
</script>
</body>
</html>

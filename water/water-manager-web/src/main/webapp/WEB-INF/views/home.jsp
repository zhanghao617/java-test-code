<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>水电资费管理系统</title>
    <%@include file="include/css.jsp"%>
    <style>
        .d{
            color: #ffffff;
        }
        .dd{
            padding: 25px;
            background-color:#000000;
            background-color:rgba(0,0,0,0.2);
        }
        p{
            font-family: "Arial Black", arial-black ;
            color: #000000;
        }
    </style>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <%@include file="include/header.jsp"%>

    <!-- =============================================== -->

    <jsp:include page="include/sidebar.jsp">
        <jsp:param name="menu" value="home"/>
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
               <%-- <li><a href="#">所在位置</a></li>
                <li class="active">Blank page</li>--%>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <!-- Default box -->
            <div class="box dd">
                <div class="box-header with-border">
                    <h3 class="box-title d">关于我们</h3>

                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fa fa-minus"></i></button>
                        <button type="button" class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove">
                            <i class="fa fa-times"></i></button>
                    </div>
                </div>
                <div class="box-body">
                    <p>随着人们生活水平的提高，能否提供一个健全合理的管理环境成为能否吸引用户的一个重要部分。其中水电费的收取也相应的成为其不可缺少的一个重要组成部分。本系统的设计就是为了能够方便水电管理部门对用户水电费能方便简洁的收取而开发设计的。为了能使用户方便缴纳水电费，同时也可以清楚的了解自己水电费使用情况。</p>
                    <p>对有关企业的有关国有资产行使出资人权利，对有关企业中由国家投资形成并由国家电网公司拥有的国有资产依法经营、管理和监督，并相应承担保值增值责任。
                        　　根据国民经济中长期发展规划、国家产业政策、电力工业发展规划和市场需求，制定并组织实施国家电网公司的发展战略、中长期发展规划、年度计划和重大生产经营决策。受国家有关部门委托，协助制定全国电网发展规划，提出全国电力工业发展规划的建议。参与投资、建设和经营相关的跨区域输变电和联网工程，近期负责三峡输变电网络工程的建设管理。
                        　　负责所辖各区域电网之间的电力交易和调度，处理区域电网公司日常生产中的网间协调问题，实现安全、优质、高效运行。
                        　　根据国家法律、法规和有关政策，优化配置生产要素，组织实施重大投资活动，对投入产出效果负责。加快技术创新和科技进步，增强企业竞争力，促进电力工业持续、快速、健康发展。
                        　　深化企业改革，加快结构调整，转换企业经营机制，强化内部管理，妥善做好企业重组、精简机构和富余人员分流与再就业工作，维护企业和社会稳定。
                        　　指导和加强国家电网公司有关企业思想政治工作和精神文明建设，统一管理国家电网公司的名称、商标、商誉等无形资产，搞好国家电网公司企业文化建设。
                        　　承担国务院及有关部门委托的其他工作。 主要经营业务 　　依法经营国家电网公司及有关企业中由国家投资形成并由国家电网公司拥有的全部国有资产。
                        　　从事电力购销业务，负责所辖各区域电网之间的电力交易和调度。
                        　　参与投资、建设和经营相关的跨区域输变电和联网工程。
                        　　根据国家有关规定，经有关部门批准，从事国内外投融资业务。
                        　　经国家批准，自主开展外贸流通经营、国际合作、对外工程承包和对外劳务合作等业务。
                        　　从事与电力供应有关的科学研究、技术开发、电力生产调度信息通信、咨询服务等业务。
                        　　经营国家批准或允许的其他业务。</p>
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


    <%@include file="include/footer.jsp"%>

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
<%@include file="include/js.jsp"%>
</body>
</html>

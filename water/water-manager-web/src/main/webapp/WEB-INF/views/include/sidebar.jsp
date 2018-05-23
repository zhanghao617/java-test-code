<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!-- Left side column. contains the sidebar -->
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar" >

        <ul class="sidebar-menu" data-widget="tree">
            <li class="${param.menu == 'home' ? 'active' : ''}"><a href="/home"><i class="fa fa-home"></i> <span>首页</span></a></li>

        </ul>
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">系统管理</li>
            <li class="${param.menu == 'manage_select' ? 'active' : ''}">
                <a href="/manage/select">
                    <i class="fa fa-circle-o"></i> <span>价格公示</span>
                    <span class="pull-right-container">
                      <small class="label pull-right bg-yellow">⚡</small>
                 </span>
                </a>
            </li>

            <li class="${param.menu == 'manage_consumer_home' ? 'active' : ''}">
                <a href="/manage/consumer/home">
                    <i class="fa fa-circle-o"></i> <span>消费信息</span>
                    <span class="pull-right-container">
                  <small class="label pull-right bg-green">⚡</small>
                </span>
                </a>
            </li>
            <li class="${param.menu == 'manage_pay' ? 'active' : ''}">
                <a href="/manage/pay">
                    <i class="fa fa-circle-o"></i> <span>缴费专栏</span>
                    <span class="pull-right-container">
                  <small class="label pull-right bg-red">⚡</small>
                </span>
                </a>
            </li>
            <li class="${param.menu == 'manager_advisory_home' ? 'active' : ''}">
                <a href="/manage/advisory/home">
                    <i class="fa fa-circle-o"></i> <span>咨询专线</span>
                    <span class="pull-right-container">
                  <small class="label pull-right bg-red">⚡</small>
                </span>
                </a>
            </li>
            <li class="${param.menu == 'manage_user_show' ? 'active' : ''}">
                <a href="/manage/user">
                    <i class="fa fa-circle-o"></i> <span>个人中心</span>
                    <span class="pull-right-container">
                  <small class="label pull-right bg-red">⚡</small>
                </span>
                </a>
            </li>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
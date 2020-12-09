<%--
  Created by IntelliJ IDEA.
  User: 泡泡
  Date: 2020/12/8
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>用户管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body class="layui-layout-body">
<br>
<div align="center">
</div>
<%--<div class="demoTable" align="center">--%>
<%--    <div class="layui-inline">--%>
<%--        <label class="layui-form-label">注册日期：</label>--%>
<%--        <div class="layui-input-inline" style="width: 200px;">--%>
<%--            <input type="text" class="layui-input" id="beginTime" placeholder="yyyy-MM-dd">--%>
<%--        </div>--%>
<%--        至--%>
<%--        <div class="layui-input-inline" style="width: 200px;">--%>
<%--            <input type="text" class="layui-input" id="endTime" placeholder="yyyy-MM-dd">--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--</br>--%>
<div class="demoTable" align="center">
        注册日期：
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" class="layui-input" id="beginTime" placeholder="yyyy-MM-dd">
        </div>
        至
        <div class="layui-input-inline" style="width: 200px;">
            <input type="text" class="layui-input" id="endTime" placeholder="yyyy-MM-dd">
        </div>
    用户名：
    <div class="layui-inline">
        <input class="layui-input" name="id" id="demoReload" autocomplete="off">
    </div>
    <button class="layui-btn" data-type="reload">查询</button>
</div>

<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>
</div>
<div class="layui-footer">
</div>
</div>
<script src="../layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });
</script>
<script src="../JS/jquery-3.5.1.js" charset="utf-8"></script>
<script src="../layui/layui.js" charset="utf-8"></script>
<script src="../JS/AdminUserControl.js" charset="utf-8"></script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="edit">禁用</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">启用</a>
</script>
</body>
</html>

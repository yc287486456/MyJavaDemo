<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/3
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
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
    <div class="demoTable" align="center">
        <div class="layui-inline">
            <label class="layui-form-label">注册日期：</label>
            <div class="layui-input-inline" style="width: 200px;">
                <input type="text" class="layui-input" id="beginTime" placeholder="yyyy-MM-dd">
            </div>
            至
            <div class="layui-input-inline" style="width: 200px;">
                <input type="text" class="layui-input" id="endTime" placeholder="yyyy-MM-dd">
            </div>
        </div>
    </div>
    </br>
    <div class="demoTable" align="center">
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
<script src="../layui/layui.js" charset="utf-8"></script>
<script src="../JS/AdminPeopleSelect.js" charset="utf-8"></script>
</body>
</html>
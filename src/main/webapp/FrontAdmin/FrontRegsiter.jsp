<%--
  Created by IntelliJ IDEA.
  User: 泡泡
  Date: 2020/12/4
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>注册页</title>
    <script src="../layui/layui.js"></script>
    <script type="text/javascript" src="../JS/jquery-3.5.1.js" charset="UTF-8"></script>
    <script type="text/javascript" src="../JS/FrontRegsiter.js" charset="UTF-8"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../CSS/FrontRegsiter.css">
</head>
<body>
<div class="login-main">
    <header class="layui-elip" style="width: 82%">注册页</header>
    <!-- 表单选项 -->
    <form class="layui-form" >
        <div class="layui-form-item">
            <label class="layui-inline">账号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <div class="layui-inline">
                <input type="text" id="user"  name="account" required lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="ri" style="color: green;font-weight: bolder;" hidden></i>
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="wr" style="color: red; font-weight: bolder;" hidden>ဆ</i>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-inline">密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <div class="layui-inline">
                <input type="password" id="pwd" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="pri" style="color: green;font-weight: bolder;" hidden></i>
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="pwr" style="color: red; font-weight: bolder;" hidden>ဆ</i>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-inline">确认密码：</label>
            <div class="layui-inline">
                <input type="password" id="rpwd" name="repassword" required lay-verify="required" placeholder="请确认密码" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="rpri" style="color: green;font-weight: bolder;" hidden></i>
            </div>
            <div class="layui-inline">
                <i class="layui-icon" id="rpwr" style="color: red; font-weight: bolder;" hidden>ဆ</i>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-inline">性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <div class="layui-inline">
                <input type="radio" name="sex" value="男" title="男">
                <input type="radio" name="sex" value="女" title="女">
            </div>
        </div>
        <div class="layui-form-item">
           <label class="layui-inline">学历：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
           <div class="layui-inline">
                <select name="interest" lay-verify="required" lay-search="">
                    <option value=""></option>
                    <option value="高中及以下">高中及以下</option>
                    <option value="大专">大专</option>
                    <option value="本科">本科</option>
                    <option value="研究生">研究生</option>
                    <option value="博士">博士</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-inline">职业：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <div class="layui-inline">
                <select  name="job" lay-verify="required" lay-search="">
                    <option value=""></option>
                    <option value="学生">学生</option>
                    <option value="教师">教师</option>
                    <option value="工人">工人</option>
                    <option value="军人">军人</option>
                    <option value="医生">医生</option>
                    <option value="警察">警察</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-inline">手机号：&nbsp;&nbsp;&nbsp;</label>
                <div class="layui-inline">
                    <input  id="phoneNumber" type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
            <div class="layui-form-item">
            <div class="layui-inline">
                <label class="layui-inline">邮箱号：&nbsp;&nbsp;&nbsp;</label>
                <div class="layui-inline">
                    <input id="Email" type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
                </div>
            </div>
        </div>
        <div class="layui-input-inline login-btn" style="width: 85%">
            <button type="submit" lay-submit lay-filter="sub" class="layui-btn">注册</button>
        </div>
        <hr style="width: 85%" />
        <p style="width: 85%"><a href="Login.jsp" class="fl">已有账号？立即登录</a><a href="javascript:" class="fr">忘记密码？</a></p>
    </form>
</div>
</body>
</html>
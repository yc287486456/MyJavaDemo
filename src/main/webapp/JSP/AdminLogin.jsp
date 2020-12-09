<%--
  Created by IntelliJ IDEA.
  User: 泡泡
  Date: 2020/12/7
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <script src="../JS/jquery-3.5.1.js"></script>
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../CSS/AdminLogin.css">
    <script src="../layui/layui.js" type="text/javascript"></script>
    <script src="../JS/AdminLogin.js" type="text/javascript"></script>
</head>
<body>
<div class="wrap">
    <img src="../IMGES/back.jpg" class="imgStyle">
    <div class="loginForm">
        <form id="loginForm">
            <div class="logoHead">
                <h2 style="margin-top: 15px">欢迎来到网盘系统</h2>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>用户名:</label>
                </div>
                <div class="usernameDiv">
                    <i class="layui-icon layui-icon-username adminIcon"></i>
                    <input id="loginUsername" class="layui-input adminInput" type="text" name="username"
                           placeholder="输入用户名">
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>密码:</label>
                </div>
                <div class="passwordDiv">
                    <i class="layui-icon layui-icon-password adminIcon"></i>
                    <input id="loginPassword" class="layui-input adminInput" type="password" name="password"
                           placeholder="输入密码">
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="usernameLabel">
                    <label>验证码:</label>
                </div>
                <div class="cardDiv">
                    <input id="loginCard" class="layui-input cardInput" type="text" name="card" placeholder="输入验证码">
                </div>
                <div class="codeDiv">
                    <input id="loginCode" class="layui-input codeInput" type="button">
                </div>
            </div>
            <div class="usernameWrapDiv">
                <div class="submitLabel">
                    <label>没有账号？<a href="../FrontAdmin/FrontRegsiter.jsp" id="loginRegister">点击注册</a></label>
                </div>
                <div class="submitDiv">
                    <input id="loginBtn" type="button" class="submit layui-btn layui-btn-primary" value="登录">
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>同城</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/css/style.css">
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/login.js"></script>
</head>
<body>
<!--背景-->
<div class="wel" id="background-3"></div>
<!--左右两边云-->
<div class="wel" id="box">
    <div class="box-1 lefp"></div>
    <div class="box-1">
        <div class="righp"></div>
    </div>
</div>
<!--荧光点点-->
<div class="wel" id="git"></div>

<div style="text-align:center;">
    <h1>同城配送</h1>
</div>
<!--登录注册表-->
<div class="wel" id="from">
    <div class="box-2 le-1">
        <form action="" method="post">
            <div class="flrg">
                <h3>登录</h3>
                <div class="a">
                    <!--<label>账号：</label>-->
                    <input name="username" type="text"  id="username" class="in-1" placeholder="请输入账号">
                </div>
                <div class="a">
                    <!--<label>密码：</label>-->
                    <input name="password" type="password" id="password" class="in-1" placeholder="请输入密码">
                </div>
                <div class="a">
                    <button type="button" onclick="requestJson()">登录</button>
                </div>
                <div class="a">
                    <div class="hr"></div>
                </div>
                <div class="a">
                    <a href="#">忘记密码？</a>
                </div>
            </div>
        </form>
    </div>
    <div class="box-2 le-2">
        <form action="" method="post">
            <div class="flrg-1">
                <h3>注册</h3>
                <div class="a">
                    <input name="user_name" id="user_name" type="text" class="in-1" placeholder="您的用户名">
                </div>
                <div class="a">
                    <input name="user_password" id="user_password" type="password" class="in-1" placeholder="输入密码">
                </div>
                <div class="a">
                    <input name="user_password_one" id="user_password_one" type="password" class="in-1" placeholder="再次确认密码">
                </div>
                <div class="a">
                    <input name="user_phone" id="user_phone" type="text" class="in-1" placeholder="输入手机号码">
                </div>
                <div class="a">
                    <input  name="user_email" id="user_email" type="email" class="in-1" placeholder="输入邮箱地址">
                </div>
                <div class="a">
                    <button type="button" onclick="registeredJson()">注册</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
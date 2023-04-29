<%--
  Created by IntelliJ IDEA.
  User: 马越
  Date: 2023/4/24
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      * {
        margin: 0;
        padding: 0;
      }
      html {
        height: 100%;
      }
      body {
        height: 100%;
      }
      .container {
        height: 100%;
        background-image: linear-gradient(to right, #fbc2eb, #a6c1ee);
      }
      .login-wrapper {
        background-color: #fff;
        width: 358px;
        height: 588px;
        border-radius: 15px;
        padding: 0 50px;
        position: relative;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%);
      }
      .header {
        font-size: 38px;
        font-weight: bold;
        text-align: center;
        line-height: 200px;
      }
      .input-item {
        display: block;
        width: 100%;
        margin-bottom: 20px;
        border: 0;
        padding: 10px;
        border-bottom: 1px solid rgb(128, 125, 125);
        font-size: 15px;
        outline: none;
      }

      .btn {
        text-align: center;
        padding: 10px;
        width: 100%;
        margin-top: 40px;
        background-image: linear-gradient(to right, #a6c1ee, #fbc2eb);
        color: #fff;
      }
      .msg {
        text-align: center;
        line-height: 88px;
      }
      a {
        text-decoration-line: none;
        color: #abc1ee;
      }
    </style>
  </head>
  <body>
  <div class="container">
    <div class="login-wrapper">
      <div class="header">简约图书管理系统</div>
      <div class="form-wrapper">
        <form action="${pageContext.request.contextPath}/user/login" method="post">
          <p>
            <input type="text" name="username" placeholder="用户名" class="input-item">
          </p>
          <input type="text" name="password" placeholder="密码" class="input-item">
          <input type="submit" value="提交" class = "btn">
        </form>
      </div>
      <div class="msg">
        没有注册？
        <a href="#">注册</a>
      </div>
    </div>
  </div>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>

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
      a {
        text-decoration: none;
        color: black;
        font-size: 18px;
        margin: 300px auto;
        text-align: center;
        line-height: 38px;
        background: deepskyblue;
        border-radius: 5px;
      }
      h3 {
         width: 180px;
         height: 38px;
       }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>

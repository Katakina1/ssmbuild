<%--
  Created by IntelliJ IDEA.
  User: 马越
  Date: 2023/4/26
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍 ---------------------------------------------------------------------------新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
<%--        出现的问题，我们提交了修改的SQL请求，但是修改失败，初次考虑是事务问题，配置完毕事务
依旧失败，看一下sql语句能否执行成功：SQL执行失败--%>
<%--        前端传递隐藏域--%>
        <div class="form-group">
            <input type="hidden" name="bookID" value="${QBooks.bookID}">
            <label>书籍名称:</label>
            <input type="text" name="bookName" class="form-control" value="${QBooks.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" name="bookCounts" class="form-control" value="${QBooks.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text" name="detail" class="form-control" value="${QBooks.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">修改</button>
    </form>

</div>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: yuyufeng
  Date: 2017/9/28
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<h2>首页 ${time}</h2>
<p><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss"  value="${time}"/></p>
</body>
</html>

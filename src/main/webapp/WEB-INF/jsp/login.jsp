<%--
  Created by IntelliJ IDEA.
  User: yuyufeng
  Date: 2017/9/28
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>login</title>
    <%@ include file="include/head.jsp" %>
</head>
<body>
<h2>首页</h2>
<table class="table">
    <form action="/doLogin" method="post">
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="userName"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" name="userPassword"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="登录"></td>
        </tr>
    </form>

</table>

<table class="table">
    <tr>
        <td>用户名:</td>
        <td>${userVO.userName}</td>
    </tr>
    <tr>
        <td>密码:</td>
        <td>${userVO.userPassword}</td>
    </tr>
</table>
<hr/>
<div style="color: red">
    <c:forEach items="${errors}" var="e">
        <i>${e.code} ${e.defaultMessage}</i><br/>
    </c:forEach>
</div>

<hr/>


</body>
</html>

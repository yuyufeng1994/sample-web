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
    <style>
        .error-area {
            color: red;
        }
    </style>
</head>
<body>
<hr/>
<%--Spring form 表单--%>
<form:form id="my-form" method="post" modelAttribute="userValidVO" action="/doValidLogin">
    用户登录
    <table>
        <tr>
            <td><form:label path="userName">用户名:</form:label></td>
            <td><form:input path="userName"/></td>
            <td><form:errors path="userName" cssClass="error-area"/></td>
        </tr>
        <tr>
            <td><form:label path="userPassword">密码:</form:label></td>
            <td><form:input path="userPassword"/></td>
            <td><form:errors path="userPassword" cssClass="error-area"/></td>
        </tr>
        <tr>
            <td>
                <button type="submit">立即登录</button>
            </td>
            <td>
                <button type="reset">重置</button>
            </td>
        </tr>
        <tr>
            <td><c:out value="${loginValid}"></c:out></td>
        </tr>
    </table>
</form:form>

</body>
</html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: akuzikov
  Date: 9/19/18
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <iframe>src="banner.html" width="468" height="60" align="left"</iframe>
</head>
<body>

<spring:form modelAttribute="userFromServer" method="post" action="/user-system/users/check">
    <spring:input path="name"/>
    <spring:input path="password"/>
    <spring:button>Check user</spring:button>
</spring:form>

</body>
</html>

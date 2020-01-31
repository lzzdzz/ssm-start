<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2020/1/30
  Time: 0:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>

      <h3>查询所有</h3>
      <c:forEach items="${list}" var="account">
            ${account.name}
            ${account.money}
      </c:forEach>
</body>
</html>

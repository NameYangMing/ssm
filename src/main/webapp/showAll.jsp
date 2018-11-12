<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${requestScope.s}" var="us">
        ${us.id}----${us.username}----${us.name}---${us.password}----${us.sex}<br/>
    </c:forEach>

</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>二级联动</title>
    <script type="text/javascript" src="    static/jquery.min.js"></script>
    <script type="text/javascript">
        function provinceFun() {

        }
    </script>
</head>
<body>
请选择省：
<select name="" onchange="provinceFun()">
    <option value="" selected>请选择省份</option>
    <c:forEach items="${requestScope.province}" var="p">
        <option value="">${p.provinceName}</option>
    </c:forEach>
</select>

请选择市：

</body>
</html>

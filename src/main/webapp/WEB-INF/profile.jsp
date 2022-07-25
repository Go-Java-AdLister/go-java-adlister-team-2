<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Happy Profile"/>
    </jsp:include>
    <style>
        body {
            margin: 0;
            background-color: #FFFDC0;
            text-align: center;

        }

        h1 {
            margin: 0;
            text-align: center;
            font-family: 'Merriweather', serif;
        }
    </style>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
    <h1>Welcome, ${sessionScope.user.username}!</h1>
    <img src="<c:url value="/img/smirking%20spongebob.webp"/>"/>
</div>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to happier times!"/>
    </jsp:include>
    <style>
        body {
            background: cornflowerblue;
            margin: 0;
            text-align: center;
            font-family: 'Merriweather', serif;
        }

        h1 {
            font-size: 7.625rem;
            margin: 50px auto 0 auto;
            font-family: 'Sacramento', cursive;
            color: yellow;
        }
    </style>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
    <img src="<c:url value="img/Sunshine.webp"/>"/>
    <h1>Welcome to the Glad-lister!</h1>
</div>

<div>
    <img src="<c:url value="img/animated%20smile.webp"/>"/>
</div>
</body>
</html>

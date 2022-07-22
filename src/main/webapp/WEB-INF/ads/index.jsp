<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Here are all the happys"/>
    </jsp:include>
</head>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<body>
<div class="container">
    <h1>Here Are all the ads!</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <a href="<c:url value="/ads/details?id=${ad.id}"/>">
                <h2> ${ad.title} </h2>
            </a>
            <p>${ad.description}</p>
        </div>
    </c:forEach>

</div>

</body>
</html>

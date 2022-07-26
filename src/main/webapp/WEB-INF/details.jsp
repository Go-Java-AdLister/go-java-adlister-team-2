<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new glAd"/>
    </jsp:include>
</head>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<body>
<div class="col-md-6">
    <h2><c:out value="${ad.title}"/></h2>
    <h3>Author: <c:out value="${user.username}"/></h3>
    <p><c:out value="${ad.description}"/></p>
    <c:choose>
<%--    isUser from servlet is verified, and allows the delete and edit buttons to be visible    --%>
        <c:when test="${isUser}">
            <form action="/ads/details" method="POST">
                <button type="submit">Delete Ad</button>
            </form>
            <form action="/ads/edit" method="get">
                <button type="submit">Edit Ad</button>
            </form>
        </c:when>
    </c:choose>
</div>
</body>
</html>

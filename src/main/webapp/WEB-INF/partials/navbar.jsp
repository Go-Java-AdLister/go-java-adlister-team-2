<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">GLAD</a>
        </div>
        <ul class="nav navbar-nav navbar-right">

            <c:choose>
                <c:when test="${isLoggedIn}">
                    <li><a href="/profile">Profile</a></li>
                    <li><a href="/ads/create">Create Ad</a></li>
                    <li><a href="/logout">Logout</a></li>

                </c:when>
                <c:otherwise>
                    <li><a href="/login">Login</a></li>
                </c:otherwise>

            </c:choose>
        </ul>
    </div><!-- /.navbar-collapse -->
    <!-- /.container-fluid -->
</nav>

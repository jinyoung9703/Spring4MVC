<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>세미 프로젝트</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="/assets/css/project.css" rel="stylesheet">

</head>
<body>

    <h1>SemiProject</h1>
    <nav>
        <ul>

            <li><a href="/">Home</a></li>
            <li><a href="/member/join">회원가입</a></li>

            <c:if test="${empty sessionScope.member}">
            <li><a href="/member/login">로그인</a></li></c:if>

            <c:if test="${not empty sessionScope.member}">
            <li><a href="/member/logout">로그아웃</a></li></c:if>

            <li><a href="/board/list?cpg=1">게시판</a></li>
            <li><a href="/member/myinfo">회원정보</a></li>
        </ul>
        <hr class="hr">
    </nav>

</body>
</html>
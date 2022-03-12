<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/join.css" rel="stylesheet">
    <title>회원가입</title>
    <script src="/js/common.js" defer></script>
</head>
<body>
   <form action="DispatcherServlet?command=user_join_insert" method="post">
    <div class="logo">쇼핑몰로고...</div>
    <section id="section">
        <h1>회원가입</h1>
        <div id="id">
            <pre>아이디</pre>
            <input class="id" placeholder="아이디 입력 " name="id">
        </div>
        <div id="email">
            <pre>이메일</pre>
            <input class="email" type="email" placeholder="이메일 입력 " name="email">
        </div>
        <div id="pwd">
            <pre>비밀번호</pre>
            <input class="pwd" type="password" placeholder="비밀번호 입력 " name="pwd">
            <input class="pwd" type="password" placeholder="비밀번호 재입력 ">
        </div>
        <div id="ph">
            <pre>전화번호</pre>
            <input class="ph" type="tel" name="tel_front" placeholder="010">
            <input class="ph" type="tel" name="tel_midle" placeholder="0000">
            <input class="ph" type="tel" name="tel_back" placeholder="0000">
            <button id="c_btn">인증요청</button>
        </div>
        <div id="ymd">
            <pre>생년월일</pre>
            <select name="birth_yy">
                <option value="">년도</option>
                <c:forEach items="${birthYyList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
            <select name="birth_mm">
                <option value="">월</option>
                <c:forEach items="${birthMmList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
            <select name="birth_dd">
                <option value="">일</option>
                <c:forEach items="${birthDdList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
        </div>
        <input type="submit" value="가입하기"/>
        <!-- <button id="join_btn" onclick="pageMove('join')">가입하기</button> -->
    </section>
   </form>
</body>

</html>
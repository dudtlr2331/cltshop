<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/one_qna.css" rel="stylesheet">
    <title>1:1 문의</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <header id="header">
        <div class="logo">쇼핑몰로고...</div>
        <div class="top_btn">
           <input type="text"/>
           <a href="/html/user/cart/cart_view.html"><i class="fa-solid fa-cart-shopping"></i></a>
           <a href="/html/user/login/login.html"><i class="fa-solid fa-user-large"></i></a>
        </div>
     </header>
     <section id="main_benner">
        <ul class="menu">
            <a href="/html/user/main/main.html"><li>홈</li></a>
            <a href="/html/user/category/category.html"><li>카테고리</li></a>
            <a href="/html/user/one_qna/one_qna.html"><li>1:1문의</li></a>
            <a href="/html/user/dressroom/dressRoom_main.html"><li>커뮤니티</li></a>
         </ul>
    </section>
    <h3>1:1 문의</h3>
    <table>
        <thead>
            <tr>
                <th>번호</th><th>구분</th><th>제목</th><th>등록일</th><th>처리일</th><th>상태</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <th>1</th><th>테스트</th><th>테스트입니다</th><th>2022-02-15</th><th>2022-02-15</th><th>대기중</th>
            </tr>
        </tbody>
    </table>
    <div class="btn_qna"><button>문의 작성하기</button></div>
</body>
</html>
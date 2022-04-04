<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/mypage.css" rel="stylesheet">
    <link href="/css/mypage_point.css" rel="stylesheet">
    <title>마이페이지-포인트</title>
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
    <article id="content">
        <div class="icon">
            <i class="fa-solid fa-truck"></i>
            <i class="fa-solid fa-p"></i>
            <i class="fa-solid fa-money-check-dollar"></i>
            <i class="fa-solid fa-comments"></i>
        </div>
        <div class="icon_btn">
            <a href="DispatcherServlet?command=mypage" class="a">주문/배송조회 ></a>
            <a href="DispatcherServlet?command=mypage_point" class="b">포인트 ></a>
            <a href="DispatcherServlet?command=mypage_coupon" class="c">쿠폰 ></a>
            <a href="DispatcherServlet?command=mypage_qna" class="d">Q&A</a>
        </div>
    </article>
    <article id="point">
        <div class="top_point">
            <strong>보유 포인트</strong>
            <strong class="color_point">392원</strong>
            <span>당월 소멸 예정 포인트 0원</span>
        </div>
        <h2>포인트 내역</h2>
        <div class="point_details">
            <span>적용일자</span>
            <span>포인트 내역</span>
            <span>포인트</span>
        </div>
        <div class="point_details2">
            <span>포인트 적립/차감 내역이 존재하지 않습니다.</span>
        </div>
    </article>
</body>
</html>
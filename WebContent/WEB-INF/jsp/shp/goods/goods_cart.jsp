<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/category.css" rel="stylesheet">
    <link href="/css/list.css" rel="stylesheet">
    <link href="/css/cart.css" rel="stylesheet">
    <title>장바구니</title>
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
         <a href="/html/user/dressroom/dressroom_main.html"><li>커뮤니티</li></a>
       </ul>
    </section>
    <h2 class="cart_title">장바구니</h2>
    <section id="cart_up">
        <ul class="cart_category">
           <li>상품정보</li>
           <li>옵션</li>
           <li>상품금액</li>
        </ul>
        <ul class="cart_item">
            <li>이름<br><br>24,700원</li>
            <li>다크그레이, XL</li>
            <li>24,700원</li>
         </ul>
     </section>
     <section id="cart_price">
        <div class="cart_price_border">
            <ul class="cart_price_detail">
                <li>총 상품 금액</li>
                <li>할인 금액</li>
                <li>배송비</li>
                <li>총 결제 금액</li>
             </ul>
             <ul class="cart_price_detail">
                <li>29,000원</li>
                <li>4,300원</li>
                <li>0원</li>
                <li>24,700원</li>
             </ul>
        </div>
     </section>
     <section id="cart_button">
         <button class="cart_button_detail">구매하기</button>
     </section>
 </body>
 </html>
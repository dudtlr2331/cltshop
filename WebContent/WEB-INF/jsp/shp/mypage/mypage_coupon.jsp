<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/mypage.css" rel="stylesheet">
    <link href="/css/mypage_coupon.css" rel="stylesheet">
    <title>마이페이지-쿠폰</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <header id="header_login">
        <div>
           <a href="/html/shp/user/login.html">로그인</a>
           <span> ㅣ </span>
           <a href="/html/shp/user/join.html" space="line">회원가입</a>
        </div>
     </header>
    <header id="header">
        <div class="logo">쇼핑몰로고...</div>
        <div class="top_btn">
            <input type="text"/>
            <a href="/html/shp/goods/goods_cart.html"><i class="fa-solid fa-cart-shopping"></i></a>
            <a href="/html/shp/user/login.html"><i class="fa-solid fa-user-large"></i></a>
        </div>
    </header>
    <section id="main_benner">
        <ul class="menu">
            <a href="/html/shp/goods/goods_list.html"><li>홈</li></a>
            <a href="" class="menu_category_item_main"><li>카테고리</li></a>
            <div class="menu_category">
                <ul>
                    <li class="menu_category_item"><a href="/html/shp/goods/goods_category.html"><div>카테고리</div></a></li>
                    <li class="menu_category_item"><a href=""><div>상의</div></a></li>
                    <li class="menu_category_item"><a href=""><div>아우터</div></a></li>
                    <li class="menu_category_item"><a href=""><div>바지</div></a></li>
                </ul>
            </div>
            <a href="/html/shp/qna/qna.html"><li>1:1문의</li></a>
            <a href="/html/shp/dress/dress_main.html"><li>커뮤니티</li></a>
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
            <a href="/html/shp/mypage/mypage.html" class="a">주문/배송조회 ></a>
            <a href="/html/shp/mypage/mypage_point.html" class="b">포인트 ></a>
            <a href="/html/shp/mypage/mypage_coupon.html" class="c">쿠폰 ></a>
            <a href="/html/shp/mypage/mypage_qna.html" class="d">Q&A</a>
        </div>
    </article>
    <article id="coupon">
        <h2>쿠폰 내역</h2>
        <div class="coupon_header">
            <span>쿠폰명</span>
            <span>사용혜택</span>
            <span>사용조건</span>
            <span>유효기간</span>
        </div>
        <div class="coupon_body">
            <span>사용 가능한 쿠폰이 없습니다.</span>
        </div>
        </table>
    </article>
</body>
</html>
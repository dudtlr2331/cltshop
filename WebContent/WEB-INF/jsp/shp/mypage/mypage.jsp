<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/mypage.css" rel="stylesheet">
    <title>마이페이지</title>
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
            <a href="/html/user/mypage/mypage.html" class="a">주문/배송조회 ></a>
            <a href="/html/user/mypage/mypage_point.html" class="b">포인트 ></a>
            <a href="" class="c">쿠폰 ></a>
            <a href="" class="d">Q&A</a>
        </div>
    </article>
    <article id="b_content">
        <div class="a">
            <pre>2022.01.01 | 20115634931</pre>
            <pre><a href="/html/user/mypage/mypage_detail.html">주문상세보기></a></pre>
        </div>
        <div class="b">
            <pre>회사명</pre>
            <pre class="b_money">주문금액</pre>
            <pre class="b_progres">진행상황</pre>
        </div>
        <div class="c">
            <div><img src="/images/아우터4.jpg"></div>
            <div>
                <div>[1+1] 후드티</div>
                <div>그레이XL/다크그린XL</div>
                <div>1개</div>
            </div>
            <div>55,900 원</div>
            <div>구매확정</div>
        </div>
    </article>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/mypage.css" rel="stylesheet">
    <link href="/css/mypage_detail.css" rel="stylesheet">
    <title>마이페이지-상세조회</title>
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
    <div><h1>주문상세조회</h1></div>
    <h2>주문정보</h2>
    <div class="order_member">
        <div>
            <span>주문번호</span>
            <span>1111111111</span>
        </div>
        <div>
            <span>주문일자</span>
            <span>2022.01.01</span>
        </div>
        <div>
            <span>주문자</span>
            <span>이름</span>
        </div>
        <div>
            <span>결제금액</span>
            <span>50000원</span>
        </div>
        <div class="end">
            <span>적립포인트</span>
            <span>50원</span>
        </div>
    </div>
    <h2>주문상품</h2>
    <div class="order_item">
        <div>회사명</div>
        <div class="price">주문금액</div>
        <div>진행상황</div>
    </div>
    <div class="order_item2">
        <div><img src="/images/아우터4.jpg"></div>
        <div>
            <div>[1+1] 후드티</div>
            <div>그레이XL/다크그린XL</div>
            <div>1개</div>
        </div>
        <div>55,900 원</div>
        <div>구매확정</div>
    </div>
    <h2>주문정보</h2>
    <div class="order_item3">
        <div class="a">
            <div>결제수단</div>
            <div>계좌이체</div>
        </div>
        <div class="a">
            <div>총 상품금액</div>
            <div>55,900 원</div>
        </div>
        <div class="a">
            <div>쿠폰 할인 금액</div>
            <div>10,000 원</div>
        </div>
        <div class="a">
            <div>총 사용 포인트</div>
            <div>0 원</div>
        </div>
        <div class="a">
            <div>배송비</div>
            <div>0 원</div>
        </div>
        <div class="a">
            <div>총 주문금액</div>
            <div>45,900 원</div>
        </div>
    </div>
    <h2>배송지 정보</h2>
    <div class="order_item3">
        <div class="a">
            <div>수령인</div>
            <div>홍길동</div>
        </div>
        <div class="a">
            <div>휴대폰</div>
            <div>010-1111-1111</div>
        </div>
        <div class="a">
            <div>우편번호</div>
            <div>10000</div>
        </div>
        <div class="a">
            <div>배송주소</div>
            <div>경기도 부천시</div>
        </div>
        <div class="a">
            <div>나머지 주소</div>
            <div>부천대학교</div>
        </div>
        <div class="a">
            <div>배송메모</div>
            <div>문 앞에 놓아주세요.</div>
        </div>
    </div>
    <button class="delivery_btn" onclick="pageMove('mypage')">주문/배송조회로 이동</button>
</body>
</html>
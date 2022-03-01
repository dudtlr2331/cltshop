<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/product_control.css" rel="stylesheet">
    <title>상품 목록</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <header id="header">
        <div class="logo">쇼핑몰로고...</div>
    </header>
    <nav id="main_cate">
        <ul id="manage_main">
           <li><a href="/html/admin/product_control/product_control.html">상품 관리</a></li>
                <ul class="submanage_menu">
                    <li><a href="/html/admin/product_control/product_control.html">상품 목록</a></li>
                    <li><a href="/html/admin/product_postscript/product_postscript.html">상품 문의 관리</a></li>
                </ul>
           <li><a href="/html/admin/product_order/product_order.html">주문 관리</a></li>
           <li><a href="/html/admin/member_m/member_m.html">회원 관리</a></li>
           <li><a href="/html/admin/event_banner/event_banner.html">이벤트 관리</a></li>
           <li><a href="/html/admin/sales_management/sales_management.html">매출현황</a></li>
           <li><a href="#">드레스룸 관리</a></li>
           <li><a href="#">1:1 문의 관리</a></li>
           <li><a href="/html/admin/coupon_m/coupon.html">쿠폰/적립금 관리</a></li>
        </ul>
    </nav>
    <div class="product">
        <h2>상품 목록</h2>
        <select>
            <option>등록일순</option>
            <option>이름순</option>
        </select>   
        <table class="pro_createtbl">
            <thead>
                <tr>
                    <th>전체선택</th><th>상품이미지</th><th>상품명</th><th>판매가</th><th>상태</th><th>재고수량</th><th>배송비</th><th>컬러</th><th>사이즈</th><th>등록일</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox" id="cb"></td><td>이미지1</td><td>상품1</td><td>29900</td><td>판매중</td><td>10</td><td>2500</td><td>블랙</td><td>S</td><td>2020-04-27</td>
                </tr>
                <tr>
                    <td><input type="checkbox" id="cb"></td><td>이미지2</td><td>상품2</td><td>38900</td><td>품절</td><td>0</td><td>무료</td><td>네이비</td><td>FREE</td><td>2019-05-01</td>
                </tr>
            </tbody>
        </table>
    </div>
    <button id="btn_prod"><a href="/html/admin/product_control/product_control_register.html">상품 등록하기</a></button>
    <footer>

    </footer>
</body>
</html>
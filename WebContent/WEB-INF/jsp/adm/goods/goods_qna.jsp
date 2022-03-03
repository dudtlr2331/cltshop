<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/product_postscript.css" rel="stylesheet">
    <title>상품 문의 관리</title>
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
    <div class="con">
        <h2>상품 문의 관리</h2>
        <h4>문의 관리</h4>
        <hr>
    </div>
    <div class="search">
        <p>상품검색</p>
        <select id="search_select">
            <option>상품명</option>
            <option>제목</option>
            <option>작성자</option>
        </select>
        <input class="se">
    </div>
    <div class="pro_qna">
        <select>
            <option>등록일순</option>
            <option>이름순</option>
        </select>
        <table>
            <thead>
                <tr>
                    <th>전체선택</th><th>상품명</th><th>제목</th><th>작성자</th><th>등록일</th><th>답변상태</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="checkbox" id="cb"></td><td>상품1</td><td>테스트1</td><td>1</td><td>2021-12-28</td>
                    <td><button class="pro_qna_btn"><a href="/html/admin/product_postscript/product_postscript_answer.html">답변</a></button></td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
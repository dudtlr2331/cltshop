<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/coupon.css" rel="stylesheet">
    <title>쿠폰 관리</title>
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
           <li><a href="/html/admin/product_order/product_order.html">주문 관리</a></li>
           <li><a href="/html/admin/member_m/member_m.html">회원 관리</a></li>
           <li><a href="/html/admin/event_banner/event_banner.html">이벤트 관리</a></li>
           <li><a href="/html/admin/sales_management/sales_management.html">매출현황</a></li>
           <li><a href="#">드레스룸 관리</a></li>
           <li><a href="#">1:1 문의 관리</a></li>
           <li><a href="/html/admin/coupon_m/coupon.html">쿠폰/적립금 관리</a></li>
                <ul class="submanage_menu">
                    <li><a href="">쿠폰 관리</a></li>
                </ul>
        </ul>
    </nav>
    <section id="coupon_list">
        <h2>생성된 쿠폰</h2>
        <table>
            <tr>
                <th class="c_name">쿠폰이름</th>
                <th class="discount">할인율</th>
                <th>사용시간</th>
                <th>개수</th>
            </tr>
            <tr>
                <td>쿠폰1</td>
                <td>1000원</td>
                <td>2022.11.09까지</td>
                <td>2</td>
            </tr>
            <tr>
                <td>쿠폰2</td>
                <td>10%</td>
                <td>2023.01.01까지</td>
                <td>1</td>
            </tr>
        </table>
    </section>
    <section id="coupon_making">
        <h2>쿠폰 제작</h2>
        <div>이름 <input type="text"></div>
        <div class="op">할인율 <input type="text">
            <select>
                <option>원</option>
                <option>%</option>
            </select>
        </div>
        <div>사용기간 <input type="text"></div>
        <div>개수 <input type="text"></div>
        <button class="coupon_btn">등록하기</button>
    </section>
</body>
</html>
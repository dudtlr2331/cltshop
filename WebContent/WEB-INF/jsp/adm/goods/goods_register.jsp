<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/product_control.css" rel="stylesheet">
    <title>상품 등록</title>
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
    <div id="pro_register">
        <h2>상품 등록</h2>
        <table class="registertbl">
            <tr class="product_name">
                <th><div>상품명</div></th>
                <td><input class="pro_n"></td>
                <th><div class="large_cate">대분류</div></th>
                <td>
                    <select>
                        <option>상의</option>
                        <option>아우터</option>
                        <option>바지</option>
                        <option>원피스</option>
                        <option>신발</option>
                        <option>가방</option>
                    </select>
                </td>
                <th><div class="small_cate">소분류</div></th>
                <td>
                    <div class="small_select">
                        <select>
                            <option>반팔티</option>
                            <option>긴팔</option>
                            <option>맨투맨</option>
                        </select>
                    </div>
                </td>
            </tr>
            <tr class="product_price">
                <th><div>상품가격</div></th>
                <td><input class="pro_pri"></td>
            </tr>
            <tr class="product_volume">
                <th><div>상품수량</div></th>
                <td><input class="pro_vol"></td>
            </tr>
            <tr class="product_report">
                <th><div>상품소개</div></th>
                <td><input class="pro_rep"></td>
            </tr>
            <tr class="product_image">
                <th><div>이미지</div></th>
                <td><button class="image_btn">파일선택</button></td>
            </tr>
            <tr class="product_delivery_charge">
                <th><div>배송비</div></th>
                <td><input class="pro_del_c"></td>
            </tr>
            <tr class="product_color">
                <th><div>컬러</div></th>
                <td>
                    <select class="pro_co">
                        <option>블랙</option>
                        <option>화이트</option>
                        <option>네이비</option>
                        <option>아이보리</option>
                    </select>
                </td>
            </tr>
            <tr class="product_size">
                <th><div>사이즈</div></th>
                <td>
                    <select class="pro_size">
                        <option>S</option>
                        <option>M</option>
                        <option>L</option>
                        <option>XL</option>
                        <option>XXL</option>
                        <option>FREE</option>
                    </select>
                </td>
            </tr>
        </table>
        <button id="product_save_btn"><a href="/html/admin/product_control/product_control.html">등록</a></button>
        <button id="product_cancel_btn"><a href="/html/admin/product_control/product_control.html">취소</a></button>
    </div>
</body>
</html>
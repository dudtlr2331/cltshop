<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/product_postscript.css" rel="stylesheet">
    <title>답변하기</title>
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
    <div id="pro_answer">
        <h2>답변하기</h2>
        <div class="answer_box1">
            <select>
                <option>에디터</option>
                <option>test</option>
            </select>
            <select>
                <option>돋움</option>
                <option>굴림</option>
            </select>
            <select>
                <option>10pt</option>
                <option>12pt</option>
                <option>14pt</option>
                <option>16pt</option>
                <option>18pt</option>
            </select>
            <button>B</button>
            <button>I</button>
            <button>U</button>
            <button>T</button>
            <button>왼쪽정렬</button>
            <button>가운데정렬</button>
            <button>오른쪽정렬</button>
            <button>기본</button>
            <button>이미지</button>
            <button>동영상</button>
        </div>
        <div class="answer_box2">내용</div>
    </div>
    <button id="pro_save_btn"><a href="/html/admin/product_postscript/product_postscript.html">저장</a></button>
    <button id="pro_cancel_btn"><a href="/html/admin/product_postscript/product_postscript.html">취소</a></button>
</body>
</html>
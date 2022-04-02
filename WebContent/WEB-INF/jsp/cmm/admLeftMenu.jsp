<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- admmenu start -->
<header id="header">
    <div class="logo">쇼핑몰로고...</div>
</header>
<nav id="main_cate">
    <ul id="manage_main">
       <li><a href="/DispatcherServlet?command=adm_goods_list">상품 관리</a></li>
            <ul class="submanage_menu">
                <li><a href="/DispatcherServlet?command=adm_goods_list">상품 목록</a></li>
                <li><a href="/DispatcherServlet?command=adm_goods_qna">상품 문의 관리</a></li>
            </ul>
       <li><a href="/DispatcherServlet?command=adm_order_list">주문 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_user_list">회원 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_event_banner">이벤트 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_stats_sales">매출현황</a></li>
       <li><a href="/DispatcherServlet?command=adm_dressroom_manager">드레스룸 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_qna_list">1:1 문의 관리</a></li>
       <li><a href="/DispatcherServlet?command=adm_coupon">쿠폰/적립금 관리</a></li>
    </ul>
</nav>
<!-- admmenu end -->
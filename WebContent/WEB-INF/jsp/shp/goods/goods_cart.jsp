<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

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
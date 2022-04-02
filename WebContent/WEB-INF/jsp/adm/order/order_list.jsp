<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<div class="product_order_main">
    <h2>주문 관리</h2>
    <div class="product_order_title">
        <h4>주문내역 검색</h4>
    </div>
    <div class="product_order_search_sort">
        <h4>
            검색조건
            <select>
                <option>주문번호</option>
                <option>주문상품정보</option>
                <option>주문자정보</option>
                <option>결제정보</option>
                <option>배송완료일</option>
                <option>배송정보</option>
                <option>주문상태</option>
            </select>
            <input type="text">
        </h4>
    </div>
    <div class="product_order_search_date">
        <h4>
            기간
            <select>
                <option>주문일</option>
            </select>
            <a href="">전체</a>
            <a href="">오늘</a>
            <a href="">3일</a>
            <a href="">7일</a>
            <a href="">1개월</a>
            <a href="">3개월</a>
            <a href="">1년</a>
            <input type="text">
            부터
            <input type="text">
            까지
        </h4>
    </div>
    <div class="product_order_search_purchase">
        <h4>
            결제수단
            <input type="checkbox">무통장입금
            <input type="checkbox">신용카드
            <input type="checkbox">실시간 계좌이체
            <input type="checkbox">가상계좌
            <input type="checkbox">휴대폰
        </h4>
    </div>
    <div class="product_order_result_sort">
        <select name="" id="">
            <option value="">주문번호순</option>
            <option value="">주문일순</option>
        </select>
    </div>
    <table class="product_order_table">
        <thead>
            <tr class="product_order_table_head">
                <th>전체선택</th>
                <th>주문번호</th>
                <th>주문일</th>
                <th>주문상품정보</th>
                <th>주문자정보</th>
                <th>결제정보</th>
                <th>배송완료일</th>
                <th>배송정보</th>
                <th>주문상태</th>
            </tr>
        </thead>
        <tbody class="product_order_table_body">
            <tr>
                <th><input type="checkbox"></th>
                <th>20200501-12345678</th>
                <th>2020-05-01</th>
                <th>상품1</th>
                <th>user1</th>
                <th>29,900<br>신용카드</th>
                <th></th>
                <th></th>
                <th>
                    <select>
                        <option>배송중</option>
                        <option>배송완료</option>
                    </select>
                </th>
            </tr>
        </tbody>
    </table>
    <div class="page_button">
        <button>1</button>
    </div>
</div>
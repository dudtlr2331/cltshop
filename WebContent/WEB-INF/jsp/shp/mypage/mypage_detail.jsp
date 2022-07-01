<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/mypage_detail.css" rel="stylesheet">

<section class="title_area">
	<h3 class="title">주문상세조회</h3>
</section>

<section class="item_list_area">
<h2>주문정보</h2>
<div class="order_member">
    <div>
        <span>주문번호</span>
        <span>${ordList.ordNo}</span>
    </div>
    <div>
        <span>주문일자</span>
        <span>${ordList.ordDate}</span>
    </div>
    <div>
        <span>주문자</span>
        <span>${ordList.ordrNm}</span>
    </div>
    <div>
        <span>결제금액</span>
        <span>${ordList.payMny}원</span>
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
	<div>
		<img src="${searchGoods.goods.imgPath}${searchGoods.goods.imgNm}">
	</div>
   <!-- <div><img src="/images/아우터4.jpg"></div> -->
	<div>
		<div>${searchGoods.sale.bulTitNm}</div>
	</div>
	<div>${searchGoods.sale.goodsPrc}원</div>
	<div>${ordList.codeNm}</div>
</div>
<h2>주문정보</h2>
<div class="order_item3">
    <div class="a">
        <div>결제수단</div>
        <div>${ordList.payWay}</div>
    </div>
    <div class="a">
        <div>총 상품금액</div>
        <div>${searchGoods.sale.goodsPrc}원</div>
    </div>
    <div class="a">
        <div>쿠폰 할인 금액</div>
        <div>0 원</div>
    </div>
    <div class="a">
        <div>총 사용 포인트</div>
        <div>0 원</div>
    </div>
    <div class="a">
        <div>배송비</div>
        <div>${searchGoods.goods.dlvPrc}원</div>
    </div>
    <div class="a">
        <div>총 주문금액</div>
        <div>${ordList.payMny}원</div>
    </div>
</div>
<h2>배송지 정보</h2>
<div class="order_item3">
    <div class="a">
        <div>수령인</div>
        <div>${ordList.acqrNm}</div>
    </div>
    <div class="a">
        <div>휴대폰</div>
        <div>${ordList.acqrPhon}</div>
    </div>
    <div class="a">
        <div>우편번호</div>
        <div>10000</div>
    </div>
    <div class="a">
        <div>배송주소</div>
        <div>${ordList.acqrAddr}</div>
    </div>
    <div class="a">
        <div>나머지 주소</div>
        <div>${ordList.acqrAddrDtl}</div>
    </div>
    <div class="a">
        <div>배송메모</div>
        <div>${ordList.reqMemo}</div>
    </div>
</div>
<div class="btn_area">
    <button class="delivery_btn" onclick="location.href='/DispatcherServlet?command=mypage'">주문/배송조회로 이동</button>
</div>

</section>
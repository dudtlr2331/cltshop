<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<style>
.item_list_area{
	padding-top:10px;
	text-align: center;
}
.rslt_rea{
	text-align: center;
	font-size: 34px;
}
.btn_area button{
	padding: 20px;
	font-size: 16px;
	font-weight: bold;
}
.no_data{
	padding: 24px;
	font-size: 16px;
	font-weight: bold;
}
table{
	width: 100%;
}
.item_list_area{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}
form{
	width: 60%;
}
input[type=text], input[type=number], select{
	width: 100%;
	height: 30px;
}
textarea {
	width: 100%;
}
</style>

<section class="title_area">
	<h3 class="title">주문 내역 입니다.</h3>
</section>

<section class="item_list_area">
<form name="frm" action="DispatcherServlet?command=order_cart_register_act" method="post">
<input type="hidden" name="checkedList" value="${key}">
<h2>배송 정보</h2>
<table>
	<colgroup>
		<col width="20%" />
		<col width="30%" />
		<col width="20%" />
		<col width="30%" />
	</colgroup>
	<tr>
		<th>주문자 이름</th>
		<td><input type="text" name="ordrNm" value="${sessionScope.loginInfo.usrNm}"></td>
		<th>주문자 전화번호</th>
		<td><input type="text" name="ordrPhon" value="${sessionScope.loginInfo.cellNo}"></td>
	</tr>
	<tr>
		<th>주문자 이메일</th>
		<td><input type="text" name="ordrEmail" value="${sessionScope.loginInfo.emailAddr}"></td>
		<th>수취자 이름</th>
		<td><input type="text" name="acqrNm" value="${sessionScope.loginInfo.usrNm}"></td>
	</tr>
	<tr>
		<th>수취자 전화번호</th>
		<td><input type="text" name="acqrPhon" value="${sessionScope.loginInfo.cellNo}"></td>
		<th>수취자 이메일</th>
		<td><input type="text" name="acqrEmail" value="${sessionScope.loginInfo.emailAddr}"></td>
	</tr>
	<tr>
		<th>수취자 주소</th>
		<td><input type="text" name="acqrAddr" value="${sessionScope.loginInfo.loadAddrBase}"></td>
		<th>수취자 상세 주소</th>
		<td><input type="text" name="acqrAddrDtl" value="${sessionScope.loginInfo.loadAddrDtl}"></td>
	</tr>
	<tr>
		<th>요청 사항</th>
		<td colspan="3">
			<textarea rows="10" cols="50" name=reqMemo></textarea>
		</td>
	</tr>
</table>

<h2>상품 정보</h2>
<c:forEach items="${detail}" var="obj">
<input type="hidden" name="entrNo" value="${obj.goods.entrNo}">
<input type="hidden" name="goodsNm" value="${obj.goods.goodsNm}"> <!-- 상품명 -->
<input type="hidden" name="goodsCd" value="${obj.goods.goodsCd}"> <!-- 상품 코드 -->
<input type="hidden" name="payMny" value="${totalPayment}">
<input type="hidden" name="saleBoardSeqs" value="${obj.order.saleBoardSeq}">
	<table>
		<colgroup>
			<col width="20%" />
			<col width="30%" />
			<col width="20%" />
			<col width="30%" />
		</colgroup>
		<tr>
			<th>상품 명</th>
			<td>${obj.goods.goodsNm}</td>
			<th>옵션 정보</th>
			<td></td>
		</tr>
		<tr>
			<th>수량</th>
			<td><input type="number" name="goodsQty" value="1"> <!-- 상품 코드 --></td>
			<th>상품 가격</th>
			<td><fmt:formatNumber value="${obj.sale.goodsPrc - obj.sale.goodsSalePrc}" pattern="#,###" />원</td>
		</tr>
	</table>
</c:forEach>
<th>총 결제 금액 : </th>
	<td><fmt:formatNumber value="${totalGoodsPrc}" pattern="#,###" />원 + 배송비 <fmt:formatNumber value="${totalDlvPrc}" pattern="#,###" />원 = <fmt:formatNumber value="${totalPayment}" pattern="#,###" />원</td>
<tr></br>
	
	<th>결제 수단</th>
	<td>
		<select name="payWay">
			<option value="card">신용/체크카드</option>
			<option value="mobilePay">휴대폰결제</option>
			<option value="kakaoPay">카카오페이</option>
			<option value="naverPay">네이버페이</option>
			<option value="toss">토스</option>
		</select>
	</td>
</tr>
<input type="submit" value="주문하기">
</form>
</section>
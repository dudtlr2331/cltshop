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
</style>
<section class="title_area">
	<h3 class="title">장바구니 담긴 상품</h3>
</section>

<section class="item_list_area">
<form id="frm">
	<input type="hidden" id="gubun" name="gubun" />
	<input type="hidden" id="checkedList" name="checkedList" class="checkedList" />
	<input type="hidden" id="command" name="command" class="checkedList"/>
	
	<table class="table">
		<colgroup>
			<col width="5%">
			<col width="15%">
			<col width="*">
			<col width="15%">
			<col width="15%">
		</colgroup>
		<thead>
			<tr>
				<th scope="row">
					<label>
						<input type="checkbox" class="checkbox" id="ordBasketAll">
						<span></span>
					</label>
				</th>
				<th scope="row">이미지</th>
				<th scope="row">상품명</th>
				<th scope="row">수량</th>
				<th scope="row">판매가격</th>
			</tr>	
		</thead>
		<tbody id="basketList"></tbody>
	</table>
	<hr width="100%"/>
	<div class="rslt_rea">
		<h4 id="rsltArea"></h4>
	</div>
	<div class="btn_area">
		<button type="button" id="allOrdBasket">전체상품 주문</button>
		<button type="button" id="someOrdBasket">선택상품 주문</button>
<!-- 		<button type="button">쇼핑계속하기</button> -->
		<button type="button" id="allDeleteBasket">전체 장바구니 비우기</button>
		<button type="button" id="someDeleteBasket">선택 장바구니 비우기</button>
	</div>
</form>
</section>
<script>
var basketList = null;
document.addEventListener("DOMContentLoaded", () => {
	fn_ajax({
		url: '/DispatcherServlet?command=order_cart_list_ajax',
		method: 'get',
		success: function(data){
			basketList = data.data
			createBasketList();
			resultPrint();
		}
	});
});
document.querySelector('#ordBasketAll').addEventListener('click', ()=>{
	let btn_all = document.querySelector('#ordBasketAll'); 
	let items = document.querySelectorAll('.ordBasketSn');
	for (let name of items) {
	    if(btn_all.checked){
			name.checked = true;
		}else{
	    	name.checked = false;
		}
	}
});
document.querySelector('#allOrdBasket').addEventListener('click', ()=>{
	fn_order_seq_check('all');
});
document.querySelector('#someOrdBasket').addEventListener('click', ()=>{
	fn_order_seq_check('some');
});
document.querySelector('#allDeleteBasket').addEventListener('click', ()=>{
	if(confirm('장바구니를 전체 삭제하겠습니까?')){
		fn_delete_order_seq_check('all');
	}
});
document.querySelector('#someDeleteBasket').addEventListener('click', ()=>{
	if(confirm('장바구니를 선택 삭제하겠습니까?')){
		fn_delete_order_seq_check('some');
	}
});

function fn_order_seq_check(type){
	let items = document.querySelectorAll('.ordBasketSn');
	let strSeq = "";
	for (let name of items) {
		if(type == 'some' && name.checked){
	    	strSeq += name.value + ",";
		}
		if(type == 'all'){
			strSeq += name.value + ",";
		}
	    
	}
	document.querySelector('#gubun').value = type;
	document.querySelector('#checkedList').value = strSeq;
	document.querySelector('#command').value = 'order_cart_register';
	
	let form = document.getElementById("frm");
	form.action = "/DispatcherServlet";
	form.mothod = "POST";
	form.submit();
}

function fn_delete_order_seq_check(type){
	let items = document.querySelectorAll('.ordBasketSn');
	let strSeq = "";
	for (let name of items) {
		if(type == 'some' && name.checked){
	    	strSeq += name.value + ",";
		}
		if(type == 'all'){
			strSeq += name.value + ",";
		}
	    
	}
	fn_ajax({
		url: '/DispatcherServlet?command=order_cart_delete_ajax&checkedList='+strSeq,
		method: 'get',
		success: function(){
			location.href="/DispatcherServlet?command=order_cart_list";
		}
	});
}

function createBasketList(){
	var html = "";
	for(var i=0; i<basketList.length; i++){
		html += '<tr>';
		html += '	<td>';
		html += '		<label>';
		html += '			<input type="checkbox" class="checkbox ordBasketSn" id="ordBasketSn'+i+'" name="ordBasketSn" value="'+basketList[i].ordBasketSeq+'">';
		html += '			<span></span>';
		html += '		</label>';
	    html += '   </td>';
		html += '	<td>';
		html += '		<img src="'+basketList[i].imgPath + basketList[i].imgNm+'" width="100px"/>';
		html += '	</td>';
		html += '	<td><a href="/DispatcherServlet?command=goods_detail&searchSaleBoardSeq='+basketList[i].saleBoardSeq+'">'+basketList[i].bulTitNm+'</a></td>';
		/* html += '	<td><input type="number" class="form-control btnTxt" name="ordrPhon" value="'+basketList[i].goodsQty+'"></td>'; */
		html += '	<td>'+basketList[i].goodsQty+'</td>';
		html += '	<td>'+basketList[i].goodsPrc+'</td>';
		html += '</tr>';
	}
	if(basketList.length == 0){
		html = "<tr><td colspan=\"5\"><div class=\"no_data\">장바구니에 담긴 상품이 없습니다.</div></td></tr>";
	}
	document.querySelector('#basketList').innerHTML = html;
}

function resultPrint(){
	var totalPrc = 0;
	var prclPrc = 0;
	var totalPackPrc = 0;
	//상품 전체 가격
	for(var i=0; i<basketList.length; i++){
		totalPrc += (basketList[i].goodsPrc * basketList[i].goodsQty);
	}
	//배송비
	for(var i=0; i<basketList.length; i++){
		prclPrc = 2500;
	}
	//포장비
	for(var i=0; i<basketList.length; i++){
		totalPackPrc += (basketList[i].packWayPrc * basketList[i].goodsQty);
	}
	let html = "총구매금액 : "+totalPrc+" + 배송비 : "+prclPrc+ " = "+(totalPrc + prclPrc)+"원";
	document.querySelector('#rsltArea').innerHTML += html;
}
</script>
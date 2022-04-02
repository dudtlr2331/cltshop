<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>상품 관리 > 상품 목록</h2>
<div class="src_area">
	<div>
		<select>
			<option>등록일순</option>
			<option>이름순</option>
		</select>
	</div>
</div>
<div class="data_list">
	<table>
	    <thead>
	        <tr>
	            <th>전체선택</th><th>상품이미지</th><th>상품명</th><th>판매가</th><th>상태</th><th>재고수량</th><th>배송비</th><th>컬러</th><th>사이즈</th><th>등록일</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td><input type="checkbox" id="cb"></td><td>이미지1</td><td>상품1</td><td>29900</td><td>판매중</td><td>10</td><td>2500</td><td>블랙</td><td>S</td><td>2020-04-27</td>
	        </tr>
	        <tr>
	            <td><input type="checkbox" id="cb"></td><td>이미지2</td><td>상품2</td><td>38900</td><td>품절</td><td>0</td><td>무료</td><td>네이비</td><td>FREE</td><td>2019-05-01</td>
	        </tr>
	    </tbody>
	</table>
</div>
<div class="btn_area">
	<button id="btn_prod"><a href="/html/admin/product_control/product_control_register.html">상품 등록하기</a></button>
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
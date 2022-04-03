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
	            <th>전체선택</th>
	            <th>순번</th>
	            <th>상품코드</th>
	            <th>상품이미지</th>
	            <th>상품명</th>
	            <th>판매가</th>
	            <th>상태</th>
	            <th>재고수량</th>
	            <th>배송비</th>
	            <th>컬러</th>
	            <th>사이즈</th>
	            <th>등록일</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<c:if test="${empty list }">
	    		<tr><td colspan="12">데이터가 없습니다.</td></tr>
	    	</c:if>
	    	<c:forEach items="${list }" var="obj" varStatus="cnt">
		        <tr>
		            <td>
		            	<input type="checkbox" id="cb">
		            </td>
		            <td>${cnt.count}</td>
		            <td>${obj.goodsCd}</td>
		            <td><img src="${obj.imgPath}${obj.imgNm }" height="200px" width="200px" /></td>
		            <td><a href="/DispatcherServlet?command=adm_goods_edit&goodsInfoSeq=${obj.goodsInfoSeq}">${obj.goodsNm}</a></td>
		            <td>${obj.goodsPrc}</td>
		            <td>${obj.saleStatCd}</td>
		            <td>${obj.inyQty}</td>
		            <td>${obj.dlvPrc}</td>
		            <td>${obj.goodsClr}</td>
		            <td>${obj.goodsSize}</td>
		            <td>${obj.rgstDate}</td>
		        </tr>
	    	</c:forEach>
	    </tbody>
	</table>
</div>
<div class="btn_area">
	<input type="button" value="등록" onclick="location.href='/DispatcherServlet?command=adm_goods_register'" />
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
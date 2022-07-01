<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/bannerMenu.jsp"%>
<section id="product_ranking" class="item_list_area">
	<h2>Today 랭킹</h2>
	<!-- <div class="product_group">
		<pre>전체</pre>
		<pre>상의</pre>
		<pre>아우터</pre>
		<pre>바지</pre>
	</div> -->
	<c:choose>
		<c:when test="${not empty mainHomeList }">
		<div class="img_area">
			<c:forEach var="obj" items="${mainHomeList}" varStatus="status">
			<c:if test="${status.count mod 5 eq 1 }">
				<div class="img_a">
			</c:if>
				<div class="item" onclick="pageMove('product', '${obj.sale.saleBoardSeq}')">
					<img src="${obj.goods.imgPath}${obj.goods.imgNm}">
					<div class="txt_area">
						<div class="item_name">${obj.sale.bulTitNm}</div>
						<div class="item_price">
							<span class="color_red"><fmt:formatNumber value="${obj.sale.goodsSalePrc/obj.sale.goodsPrc * 100}" pattern="###" />%</span><span><fmt:formatNumber value="${obj.sale.goodsPrc - obj.sale.goodsSalePrc}" pattern="#,###" />원</span>
						</div>
					</div>
					<div class="dim"></div>
				</div>
			<c:if test="${status.count mod 5 eq 0 }">
				</div>
			</c:if>
			</c:forEach>
		</div>
		</c:when>
		<c:otherwise>
			<div class="img_area">
				<div class="img_a">데이터가 없습니다.</div>
			</div>
		</c:otherwise>
	</c:choose>
</section>
<%@ include file="/WEB-INF/jsp/cmm/auth.jsp" %>
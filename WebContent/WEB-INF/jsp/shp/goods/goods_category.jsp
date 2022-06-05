<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<section class="search_area">

</section>
<section class="item_list_area">
	<div class="container">
		<div class="items">
			<c:choose>
				<c:when test="${not empty goodsList }">
				<c:forEach var="obj" items="${goodsList}" varStatus="status">
					<div class="item">
						<div class="img">
							<img src="${obj.imgPath}${obj.imgNm}" onclick="location.href='/DispatcherServlet?command=goods_detail&goodsInfoSeq=${obj.goodsInfoSeq}'">
						</div>
						<div class="text">
							<h2>${obj.goodsNm}</h2>
							<p>${obj.goodsPrc}원</p>
							<button onclick="location.href='/DispatcherServlet?command=goods_detail&goodsInfoSeq=${obj.goodsInfoSeq}'">구매하기</button>
						</div>
					</div>
				</c:forEach>
				</c:when>
				<c:otherwise>데이터가 없습니다.</c:otherwise>
			</c:choose>
		</div>
	</div>
</section>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<style>
	.search_area .items{
		display: flex;
		justify-content: center;
		padding: 15px;
		background-color: #ffffff;
	}

	.search_area .item{
		margin-left: 10px;
		margin-right: 10px;
		border: 1px solid;
		padding: 9px;
		border-radius: 14px;
		cursor: pointer;
	}

	.search_area .item.active,.search_area .item:hover{
		background-color: #000000;
		color: #ffffff;
	}

	.item.active a, .item:hover a{
		background-color: #000000;
		color: #ffffff;
	}

	.noitem{
		width: 100%;
		text-align: center;
		padding: 20px;
	}
	
	.item_list_area .container .items .item .img{
		cursor: pointer;
	}
</style>
<section class="search_area">
	<ul class="items">
	<c:if test="${searchType eq 'all'}">
		<li class="item active">
			<a href="/DispatcherServlet?command=main_cata_list&searchType=all">전체</a>
		</li>
	</c:if>
	<c:if test="${searchType ne 'all'}">
		<c:forEach items="${twoDepthCateList}" var="obj">
			<li class="item <c:if test="${obj.catgryCd eq selectedTwoDepthCate}">active</c:if> ">
				<a href="/DispatcherServlet?command=main_cata_list&searchCatgryCd=${selectedOneDepthCate}&searchCatgryCd2=${obj.catgryCd}">${obj.catgryNm}</a>
			</li>
		</c:forEach>
	</c:if>
	</ul>
</section>
<section class="item_list_area">
	<div class="container">
		<div class="items">
			<c:choose>
				<c:when test="${not empty mainCateList }">
				<c:forEach var="obj" items="${mainCateList}" varStatus="status">
					<div class="item">
						<div class="img">
							<img src="${obj.goods.imgPath}${obj.goods.imgNm}" onclick="pageMove('product', '${obj.sale.saleBoardSeq}')">
						</div>
						<div class="text">
							<h2>${obj.sale.bulTitNm}</h2>
							<p><fmt:formatNumber value="${obj.sale.goodsPrc - obj.sale.goodsSalePrc}" pattern="#,###" />원</p>
						</div>
						<div class="btn_area">
							<c:if test="${not empty sessionScope.loginInfo }">
								<button onclick="fn_add_basket('${obj.sale.saleBoardSeq}')">장바구니</button>
							</c:if>
							<button onclick="pageMove('product', '${obj.sale.saleBoardSeq}')">구매하기</button>
						</div>
					</div>
				</c:forEach>
				</c:when>
				<c:otherwise>
					<div class="noitem">데이터가 없습니다.</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</section>
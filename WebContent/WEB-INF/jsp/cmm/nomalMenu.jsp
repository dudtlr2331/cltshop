<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- menu start -->
<header id="header">
	<div class="logo">쇼핑몰로고...</div>
	<div class="top_btn">
		<c:choose>
			<c:when test="${not empty sessionScope.loginInfo }">
				<form action="DispatcherServlet?command=user_update" method="post">
					<span>${sessionScope.loginInfo.memberId }님 환영합니다.</span>
					<input type="submit" value="중복 확인" />
				</form>
			</c:when>
		</c:choose>
		<input type="text" />
		<a href="/html/user/cart/cart_view.html"><i class="fa-solid fa-cart-shopping"></i></a>
		<a href="DispatcherServlet?command=user_login"><i class="fa-solid fa-user-large"></i></a>
	</div>
</header>
<section id="main_benner">
	<ul class="menu">
		<a href="/DispatcherServlet?command=goods_list"><li>홈</li></a>
		<a href="/DispatcherServlet?command=goods_category" class="menu_category_item_main"><li>카테고리</li></a>
		<div class="menu_category">
			<ul>
				<li class="menu_category_item"><a href="/html/shp/goods/goods_category.html"><div>카테고리</div></a></li>
				<li class="menu_category_item"><a href=""><div>상의</div></a></li>
				<li class="menu_category_item"><a href=""><div>아우터</div></a></li>
				<li class="menu_category_item"><a href=""><div>바지</div></a></li>
			</ul>
		</div>
		<a href="/html/shp/qna/qna.html"><li>1:1문의</li></a>
		<a href="DispatcherServlet?command=dress_main"><li>커뮤니티</li></a>
	</ul>
</section>
<!-- menu end -->
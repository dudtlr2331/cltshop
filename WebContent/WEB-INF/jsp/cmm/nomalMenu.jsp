<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header id="header">
	<!-- <div class="logo"><a href="/DispatcherServlet?command=main_home_list"><bold style="font-size: 25px; margin-left: 20px;">CLT</bold> shop</a></div> -->
	<div class="logo"><a href="/DispatcherServlet?command=main_home_list"><img src="/images/logo_01.png" /></a></div>
	<div class="top_btn">
		<c:choose>
			<c:when test="${not empty sessionScope.loginInfo }">
				<span>${sessionScope.loginInfo.usrId }님 환영합니다.</span>
				<input type="button" class="w70" id="btn_edit" onclick="fn_user_edit('${sessionScope.loginInfo.usrBaseSeq}')" value="수정">
				<input type="button" class="w70" id="logout_btn" onclick="location.href='DispatcherServlet?command=user_logout';" value="로그아웃">
<%--				<input type="text" />--%>
				<a href="DispatcherServlet?command=order_cart_list"><i class="fa-solid fa-cart-shopping"></i></a>
				<a href="DispatcherServlet?command=mypage"><i class="fa-solid fa-user-large"></i></a>
			</c:when>
			<c:otherwise>
				<div>
					<input type="button" class="w70" onclick="location.href='DispatcherServlet?command=user_login'" value="로그인"/>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</header>
<section id="main_benner">
	<ul class="menu">
		<a href="/DispatcherServlet?command=main_home_list"><li>홈</li></a>
		<a href="/DispatcherServlet?command=main_cata_list" class="menu_category_item_main"><li>카테고리</li></a>
		<div class="menu_category">
			<ul>
				<li class="menu_category_item"><a href="/DispatcherServlet?command=main_cata_list&searchType=all"><div>카테고리</div></a></li>
				<c:forEach items="${oneDepthCateList}" var="obj">
					<li class="menu_category_item"><a href="/DispatcherServlet?command=main_cata_list&searchCatgryCd=${obj.catgryCd}"><div>${obj.catgryNm}</div></a></li>
				</c:forEach>
			</ul>
		</div>
		<a href="DispatcherServlet?command=main_drss_list"><li>드레스룸</li></a>
		<a href="DispatcherServlet?command=main_qna_list"><li>1:1문의</li></a>
	</ul>
</section>
<c:if test="${not empty sessionScope.message}">
	<script type="text/javascript">alert("${sessionScope.message}");</script>
	<c:remove var="message" scope="session"/>
</c:if>
<!-- menu end -->
<script>
//메인 화면 -------------------------------------------------------
//메인 화면 카테고리 마우스 오버 시 하위 메뉴 노출
const categoryMenuMain = document.querySelector(".menu_category_item_main");
const categoryMenu = document.querySelector(".menu_category");
categoryMenuMain.addEventListener("mouseenter", (event) => {
	categoryMenu.classList.add("visible");
});
categoryMenu.addEventListener("mouseleave", (event) => {
	categoryMenu.classList.remove("visible");
});

function fn_user_edit(usrBaseSeq){
	const form = document.createElement('form');
	form.method = 'post';
	form.action = 'DispatcherServlet?command=user_edit';

	const hiddenField = document.createElement('input');
	hiddenField.type = 'hidden';
	hiddenField.name = 'usrBaseSeq';
	hiddenField.value = usrBaseSeq;
	
	form.appendChild(hiddenField);
	
	document.body.appendChild(form);
	
	form.submit();
}
</script>
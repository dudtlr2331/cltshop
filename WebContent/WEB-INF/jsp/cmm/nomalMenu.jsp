<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- menu start -->
<header id="header_login">
        <div>
           <a href="DispatcherServlet?command=user_login">로그인</a>
           <span> ㅣ </span>
           <a href="DispatcherServlet?command=user_join" space="line">회원가입</a>
        </div>
</header>
<header id="header">
	<div class="logo">쇼핑몰로고...</div>
	<div class="top_btn">
		<c:choose>
			<c:when test="${not empty sessionScope.loginInfo }">
				<%-- <form action="DispatcherServlet?command=user_edit" method="post">
					<span>${sessionScope.loginInfo.memberId }님 환영합니다.</span>
					<input type="submit" value="수정" />
				</form> --%>
				
				<span>${sessionScope.loginInfo.memberId }님 환영합니다.</span>
				<input type="button" id="btn_edit" onclick="fn_user_edit('${sessionScope.loginInfo.memberSeq}')" value="수정">
				<form action="DispatcherServlet?command=user_logout" method="post">
					<input type="submit" id="logout_btn" value="로그아웃">
         		</form>
			</c:when>
		</c:choose>
		<input type="text" />
		<a href="DispatcherServlet?command=goods_cart"><i class="fa-solid fa-cart-shopping"></i></a>
		<a href="DispatcherServlet?command=user_login"><i class="fa-solid fa-user-large"></i></a>
	</div>
</header>
<section id="main_benner">
	<ul class="menu">
		<a href="/DispatcherServlet?command=goods_list"><li>홈</li></a>
		<a href="/DispatcherServlet?command=goods_category" class="menu_category_item_main"><li>카테고리</li></a>
		<div class="menu_category">
			<ul>
				<li class="menu_category_item"><a href="/DispatcherServlet?command=goods_category"><div>카테고리</div></a></li>
				<li class="menu_category_item"><a href=""><div>상의</div></a></li>
				<li class="menu_category_item"><a href=""><div>아우터</div></a></li>
				<li class="menu_category_item"><a href=""><div>바지</div></a></li>
			</ul>
		</div>
		<a href="DispatcherServlet?command=qna"><li>1:1문의</li></a>
		<a href="DispatcherServlet?command=dress_main"><li>커뮤니티</li></a>
	</ul>
</section>
<!-- menu end -->
<script>
function fn_user_edit(memberSeq){
	const form = document.createElement('form');
	form.method = 'post';
	form.action = 'DispatcherServlet?command=user_edit';

	const hiddenField = document.createElement('input');
	hiddenField.type = 'hidden';
	hiddenField.name = 'memberSeq';
	hiddenField.value = memberSeq;
	
	form.appendChild(hiddenField);
	
	document.body.appendChild(form);
	
	form.submit();
}

function fn_logout(){
	const form = document.createElement('form');
	form.method = 'post';
	form.action = 'DispatcherServlet?command=user_logout';
	
	form.submit();
}
</script>


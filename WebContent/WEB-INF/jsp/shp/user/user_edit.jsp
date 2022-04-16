<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form name="frm" action="DispatcherServlet?command=user_edit_act" method="post">
	<div class="logo">쇼핑몰로고...</div>
	<section id="section">
		<h1>회원 정보 수정</h1>
		<div id="id">
			<pre>아이디</pre>
			<input type="text" class="id" value="${sessionScope.loginInfo.memberId }" name="id" readonly="readonly">
			<%-- <input type="text" class="id" value="${sessionScope.loginInfo.memberId }" name="id" disabled="disabled"> --%>
		</div>
		<div id="email">
			<pre>이메일</pre>
			<input class="email" type="email" value="${pvo.email }" name="email">
		</div>
		<div id="pwd">
			<pre>비밀번호</pre>
			<input class="pwd" type="password" value="${pvo.memberPwd }" name="pwd">
			<input class="pwd" type="password" value="${pvo.memberPwd }">
		</div>
		<div id="ph">
			<pre>전화번호</pre>
			<input class="ph" type="tel" name="tel_front" value="${pvo.tel_front }">
			<input class="ph" type="tel" name="tel_midle" value="${pvo.tel_midle }">
			<input class="ph" type="tel" name="tel_back" value="${pvo.tel_back }">
			<button id="c_btn">인증요청</button>
		</div>
		<div id="ymd">
			<pre>생년월일</pre>
			<select name="birth_yy">
				<option value="">년도</option>
				<c:forEach items="${birthYyList }" var="obj">
					<option value="${obj }">${obj }</option>
				</c:forEach>
			</select> <select name="birth_mm">
				<option value="">월</option>
				<c:forEach items="${birthMmList }" var="obj">
					<option value="${obj }">${obj }</option>
				</c:forEach>
			</select> <select name="birth_dd">
				<option value="">일</option>
				<c:forEach items="${birthDdList }" var="obj">
					<option value="${obj }">${obj }</option>
				</c:forEach>
			</select>
		</div>
		<input type="submit" value="수정하기" />
	</section>
</form>
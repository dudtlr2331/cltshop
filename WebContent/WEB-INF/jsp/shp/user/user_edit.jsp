<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form name="frm" action="DispatcherServlet?command=user_edit_act" method="post">
	<div class="logo">쇼핑몰로고...</div>
	<section id="section">
		<h1>회원 정보 수정</h1>
		<div id="id">
			<pre>아이디</pre>
			<input type="text" class="id" value="${sessionScope.loginInfo.usrId }" name="id" readonly="readonly">
			<%-- <input type="text" class="id" value="${sessionScope.loginInfo.usrId }" name="id" disabled="disabled"> --%>
		</div>
		<div id="email">
			<pre>이메일</pre>
			<input class="email" type="email" value="${pvo.emailAddr }" name="emailAddr">
		</div>
		<div id="pwd">
			<pre>비밀번호</pre>
			<input class="pwd" type="password" value="${pvo.passWd }" name="pwd">
			<input class="pwd" type="password" value="${pvo.passWd }">
		</div>
		<div id="ph">
			<pre>전화번호</pre>
			<input type="tel" name="cellNo" value="${pvo.cellNo }">
			<button id="c_btn">인증요청</button>
		</div>
		<div id="landAddr">
			<pre>지번 주소</pre>
			<input class="landAddrBase" type="landAddrBase" value="${pvo.landAddrBase }" name="landAddrBase">
			<pre>상세 주소</pre>
			<input class="landAddrDtl" type="landAddrDtl" value="${pvo.landAddrDtl }" name="landAddrDtl">
			<pre>우편번호</pre>
			<input class="landPostNo" type="landPostNo" value="${pvo.landPostNo }" name="landPostNo">
		</div>
		<div id="loadAddr">
			<pre>도로명 주소</pre>
			<input class="loadAddrBase" type="loadAddrBase" value="${pvo.loadAddrBase }" name="loadAddrBase">
			<pre>상세 주소</pre>
			<input class="loadAddrDtl" type="loadAddrDtl" value="${pvo.loadAddrDtl }" name="loadAddrDtl">
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
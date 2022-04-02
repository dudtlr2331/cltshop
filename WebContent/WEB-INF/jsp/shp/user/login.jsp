<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%-- <c:if test="${sessionScope.message ne ''}"> 아래와 같다--%>
<c:if test="${not empty sessionScope.message}">
	<script type="text/javascript">alert("${sessionScope.message}");</script>
	<%-- <c:out scope="session" var="message" value="메세지가 들어갑니다."/> jsp에서 메세지 추가하고 싶을 떄 사용 --%>
	<c:remove var="message" scope="session"/>
</c:if>
<c:if test="${not empty requestScope.message}">
	<script type="text/javascript">alert("${requestScope.message}");</script>
	<c:remove var="message" scope="session"/>
</c:if>
<i class="fa-brands fa-bots bb"></i>
<section id="section" class="section">
   <div class="input_area">
      <h1>로그인</h1>
      <div class="top">
      	 <form action="DispatcherServlet?command=user_login_insert" method="post">
         	<input class="id" placeholder="아이디 입력 " name="id"><br/>
         	<input class="pwd" type="password" placeholder="비밀번호 입력 " name="pwd"><br/>
         	<input type="submit" value="로그인"/>
         </form>
         	<!-- <input class="id" placeholder="아이디 입력 " name="id">
         	<input class="pwd" type="password" placeholder="비밀번호 입력 " name="pwd">
         	<button id="login_btn" onclick="pageMove('mypage')">로그인</button> -->
      </div>
      <div class="top_log">
         <pre> 아이디 찾기 |</pre>
         <pre> 비밀번호 찾기 |</pre>
         <pre><a href="DispatcherServlet?command=user_join"> 회원가입</a></pre>
      </div>
   </div>
   <div class="btn_area">
      <div class="bottom">
         <pre class="a">SNS 로그인/가입</pre>
      </div>
      <div class="sns_i">      
         <i class="fa-solid fa-comments"></i>
         <i class="fa-solid fa-n"></i>
         <i class="fa-brands fa-facebook"></i>
         <i class="fa-brands fa-google"></i>
      </div>
   </div>
</section>
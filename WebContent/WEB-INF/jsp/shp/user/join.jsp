<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <form name="frm" action="DispatcherServlet?command=user_join_insert" method="post" onsubmit="return checkForm()">
    <div class="logo">쇼핑몰로고...</div>
    <section id="section">
        <h1>회원가입</h1>
        <div id="id">
            <pre>아이디</pre>
            <input class="id" placeholder="아이디 입력 " name="id">
            <input type="button" id="ajaxBtn" value="중복 확인" />
        </div>
        <div id="email">
            <pre>이메일</pre>
            <input class="email" type="email" placeholder="이메일 입력 " name="email">
        </div>
        <div id="pwd">
            <pre>비밀번호</pre>
            <input class="pwd" type="password" placeholder="비밀번호 입력 " name="pwd">
            <input class="pwd" type="password" placeholder="비밀번호 재입력 ">
        </div>
        <div id="ph">
            <pre>전화번호</pre>
            <input class="ph" type="tel" name="tel_front" placeholder="010">
            <input class="ph" type="tel" name="tel_midle" placeholder="0000">
            <input class="ph" type="tel" name="tel_back" placeholder="0000">
            <button id="c_btn">인증요청</button>
        </div>
        <div id="ymd">
            <pre>생년월일</pre>
            <select name="birth_yy">
                <option value="">년도</option>
                <c:forEach items="${birthYyList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
            <select name="birth_mm">
                <option value="">월</option>
                <c:forEach items="${birthMmList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
            <select name="birth_dd">
                <option value="">일</option>
                <c:forEach items="${birthDdList }" var="obj">
                   <option value="${obj }">${obj }</option>
                </c:forEach>
            </select>
        </div>
        <input type="submit" value="가입하기"/>
        <!-- <button id="join_btn" onclick="pageMove('join')">가입하기</button> -->
    </section>
   </form>
   
<script>
(function() {
	document.getElementById("ajaxBtn").addEventListener('click', makeRequest);
	function makeRequest() {
	  httpRequest = new XMLHttpRequest();
	
	  if(!httpRequest) {
	    alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
	    return false;
	  }
	  id = frm.id.value;
	  httpRequest.onreadystatechange = alertContents;
	  httpRequest.open('POST', "DispatcherServlet?command=user_id_check");
	  httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	  httpRequest.send('id='+encodeURIComponent(id));
	}
	
	function alertContents() {
	  if (httpRequest.readyState === XMLHttpRequest.DONE) {
	    if (httpRequest.status === 200) {
	  	  var res = httpRequest.responseText;
	  	  console.log('res:' + res);
	  	  var rtnJson = JSON.parse(res);
	  	  if(rtnJson.result == 'success'){
	  		  alert("사용할수 있는 아이디 입니다.");
	  		  isIdCheck = true;
	  	  }else{
	  		  alert("이미 사용중인 아이디 입니다.");
	  	  }
	    } else {
	      alert('request에 뭔가 문제가 있어요.');
	    }
	  }
	}
	
})();
var isIdCheck = false;
var httpRequest;
var frm = document.frm;
var id = '';

function checkForm(){
	if(!isIdCheck){
		alert("아이디를 체크해 주세요.");
		return false;
	}
}
</script>
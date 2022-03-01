<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="/css/common.css" rel="stylesheet">
<link href="/css/login.css" rel="stylesheet">
<title>로그인</title>
<script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
<script src="/js/common.js" defer></script>
</head>
<body>
<i class="fa-brands fa-bots bb"></i>
<section id="section" class="section">
	<div class="input_area">
		<h1>로그인</h1>
		<div class="top">
			<input class="id" placeholder="아이디 입력 ">
			<input class="pwd" type="password" placeholder="비밀번호 입력 ">
			<button id="login_btn" onclick="pageMove('mypage')">로그인</button>
		</div>
		<div class="top_log">
			<pre> 아이디 찾기 |</pre>
			<pre> 비밀번호 찾기 |</pre>
			<pre><a href="/html/user/join/join.html"> 회원가입</a></pre>
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
</body>

</html>
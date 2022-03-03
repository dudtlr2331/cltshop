<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/category.css" rel="stylesheet">
    <link href="/css/list.css" rel="stylesheet">
    <link href="/css/dressRoom.css" rel="stylesheet">
    <title>드레스룸</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <header id="header">
       <div class="logo">쇼핑몰로고...</div>
       <div class="top_btn">
          <input type="text"/>
          <a href="/html/user/cart/cart_view.html"><i class="fa-solid fa-cart-shopping"></i></a>
          <a href="/html/user/login/login.html"><i class="fa-solid fa-user-large"></i></a>
       </div>
    </header>
    <section id="main_benner">
       <ul class="menu">
        <a href="/html/user/main/main.html"><li>홈</li></a>
        <a href="/html/user/category/category.html"><li>카테고리</li></a>
        <a href="/html/user/one_qna/one_qna.html"><li>1:1문의</li></a>
        <a href="/html/user/dressroom/dressroom_main.html"><li>커뮤니티</li></a>
       </ul>
    </section>
    <h3 class="dressroom_create_title">드레스룸 등록</h3>
    <section id="dressroom_create">
        <div class="dressroom_create_detail">
            <h3>제목 <input type="text" name="" id=""></h3>
            <h3>내용</h3>
            <span>파일 첨부</span><button>쇼핑몰 내 검색</button><button>사진</button><button>동영상</button>
        </div>
        <div class="dressroom_create_content">내용</div>
        <div class="dressroom_create_detail">
            <h3>태그 : 남성, 겨울</h3>
        </div>
        <div class="dressRoom_create_down">
            <a class="dressroom_create_button" href="/html/user/dressroom/dressroom_main.html">등록하기</a>
        </div>
    </section>
</body>
</html>
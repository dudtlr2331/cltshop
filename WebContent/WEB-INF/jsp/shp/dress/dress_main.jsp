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
    <link href="../../../css/dressRoom.css" rel="stylesheet">
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
    <section id="dressroom_bestmonth">
        <a href="">◀</a>
        <ul class="dressroom_bestmonth_detail">
           <li>이미지</li>
           <li>제목<br><br>내용</li>
        </ul>
        <a href="">▶</a>
     </section>
     <section id="dressroom_create_btn">
        <a class="dressroom_create_btn_detail" href="DispatcherServlet?command=dress_register">드레스룸 만들기</a>
    </section>
    <h3 class="dressroom_dresser">베스트 드레서</h3>
    <section id="dressroom_dressers">
        <div class="dressroom_dressers_detail">
           <div>
                <div>이미지</div>
                이름<br>
                <i class="fa-solid fa-heart"></i>191
           </div>
           <div>
                <div>이미지</div>
                이름<br>
                <i class="fa-solid fa-heart"></i>191
           </div>
           <div>
                <div>이미지</div>
                이름<br>
                <i class="fa-solid fa-heart"></i>85
           </div>
            <div>
                <div>이미지</div>
                이름<br>
                <i class="fa-solid fa-heart"></i>34
           </div>
        </div>
     </section>
     <section id="dressroom_category">
        <div class="dressroom_category_detail">
           <ul class="dressroom_category_list">
               <li class="item_main"><div>성별</div></li>
               <li class="item_sub"><div>남성</div></li>
               <li class="item_sub"><div>여성</div></li>
               <li class="item_main"><div>계절</div></li>
               <li class="item_sub"><div>봄</div></li>
               <li class="item_sub"><div>여름</div></li>
               <li class="item_sub"><div>가을</div></li>
               <li class="item_sub"><div>겨울</div></li>
               <li class="item_main"><div>나이대</div></li>
               <li class="item_sub"><div>10대 이하</div></li>
               <li class="item_sub"><div>10-20대</div></li>
               <li class="item_sub"><div>20-30대</div></li>
               <li class="item_sub"><div>30-40대</div></li>
               <li class="item_sub"><div>40-50대</div></li>
               <li class="item_sub"><div>50-60대</div></li>
               <li class="item_sub"><div>60대 이상</div></li>
           </ul>
        </div>
        <div class="dressroom_main_detail">
           <div class="dressroom_main_up">
              <div class="dressroom_main_sort">
                 <a href="">이름순</a>
                 <a href="">최신순</a>
                 <a href="">좋아요순</a>
              </div>
              <div class="dressroom_main_search">
                 <input type="text"/>
              </div>
           </div>
           <div class="dressroom_main_down">
              <div class="dressroom_main_item">
                 <div class="dressroom_main_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플1.png"></div>
                 <div class="dressroom_main_item_detail">
                    <ul class="dressroom_main_ul">
                       <li>제목</li>
                       <li>작성자</li>
                       <li>좋아요 수</li>
                    </ul>
                 </div>
              </div>
              <div class="dressroom_main_item">
               <div class="dressroom_main_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플2.png"></div>
               <div class="dressroom_main_item_detail">
                  <ul class="dressroom_main_ul">
                     <li>제목</li>
                     <li>작성자</li>
                     <li>좋아요 수</li>
                  </ul>
               </div>
            </div>
            <div class="dressroom_main_item">
               <div class="dressroom_main_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플3.png"></div>
               <div class="dressroom_main_item_detail">
                  <ul class="dressroom_main_ul">
                     <li>제목</li>
                     <li>작성자</li>
                     <li>좋아요 수</li>
                  </ul>
               </div>
            </div>
            <div class="dressroom_main_item">
               <div class="dressroom_main_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플4.png"></div>
               <div class="dressroom_main_item_detail">
                  <ul class="dressroom_main_ul">
                     <li>제목</li>
                     <li>작성자</li>
                     <li>좋아요 수</li>
                  </ul>
               </div>
            </div>
           </div>
        </div>
     </section>
</body>
</html>
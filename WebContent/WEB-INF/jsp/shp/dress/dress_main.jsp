<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

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
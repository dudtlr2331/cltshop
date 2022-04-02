<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<div class="dressroom_manager_main">
    <h2>드레스룸 관리</h2>
    <div class="dressroom_manager_dresser_title">
        <h4>드레서</h4>
    </div>
    <table class="dressroom_manager_table">
        <thead>
           <tr class="dressroom_manager_table_head">
              <th>번호</th>
              <th>아이디</th>
              <th>이름</th>
              <th>드레스룸 수</th>
              <th>총 좋아요 수</th>
              <th>드레스룸 목록</th>
          </tr>
        </thead>
        <tbody>
           <tr class="dressroom_manager_table_body">
              <th>01</th>
              <th>user1</th>
              <th>홍길동</th>
              <th>2</th>
              <th>207</th>
              <th><a href="">바로가기</a></th>
          </tr>
        </tbody>
    </table>
</div>
<div class="dressroom_manager_list_title">
  <h4>드레스룸 목록</h4>
</div>
<section id="dressroom_manager_list">
    <div class="dressroom_manager_list_category">
       <ul class="dressroom_manager_list_item">
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
    <div class="dressroom_manager_list_detail">
       <div class="dressroom_manager_list_detail_up">
          <div class="dressroom_manager_list_detail_sort">
             <a href="">이름순</a>
             <a href="">최신순</a>
             <a href="">좋아요순</a>
          </div>
          <div class="dressroom_manager_list_detail_search">
             <input type="text"/>
          </div>
       </div>
       <div class="dressroom_manager_list_detail_down">
          <div class="dressroom_manager_item">
             <div class="dressroom_manager_item_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플1.png"></div>
             <div class="dressroom_manager_item_detail">
                <ul class="dressroom_manager_item_ul">
                   <li>제목</li>
                   <li>작성자</li>
                   <li>좋아요 수</li>
                </ul>
             </div>
          </div>
          <div class="dressroom_manager_item">
           <div class="dressroom_manager_item_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플2.png"></div>
           <div class="dressroom_manager_item_detail">
              <ul class="dressroom_manager_item_ul">
                 <li>제목</li>
                 <li>작성자</li>
                 <li>좋아요 수</li>
              </ul>
           </div>
        </div>
        <div class="dressroom_manager_item">
           <div class="dressroom_manager_item_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플3.png"></div>
           <div class="dressroom_manager_item_detail">
              <ul class="dressroom_manager_item_ul">
                 <li>제목</li>
                 <li>작성자</li>
                 <li>좋아요 수</li>
              </ul>
           </div>
        </div>
        <div class="dressroom_manager_item">
           <div class="dressroom_manager_item_img"><img width="100%" height="100%" src="../../../images/드레스룸-샘플4.png"></div>
           <div class="dressroom_manager_item_detail">
              <ul class="dressroom_manager_item_ul">
                 <li>제목</li>
                 <li>작성자</li>
                 <li>좋아요 수</li>
              </ul>
           </div>
        </div>
       </div>
    </div>
 </section>
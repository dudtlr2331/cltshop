<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

<h3 class="dressroom_create_title">드레스룸 등록</h3>
<section id="dressroom_create">
    <div class="dressroom_create_detail">
        <h3>제목 <input type="text" name="dressroom_name" id=""></h3>
        <h3>내용</h3>
        <span>파일 첨부</span><button>쇼핑몰 내 검색</button><button>사진</button><button>동영상</button>
    </div>
    <div class="dress">
        <input type="text" name="dressroom_description" id="">
    </div>
    <div class="dressroom_create_detail">
        <h3>태그 : 남성, 겨울</h3>
    </div>
    <div class="dressRoom_create_down">
        <a class="dressroom_create_button" href="DispatcherServlet?command=dress_main">등록하기</a>
    </div>
</section>
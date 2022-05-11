<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/dressRoom.css" rel="stylesheet">

<form action="/DispatcherServlet?command=dress_register_act" method="post" enctype="multipart/form-data">

<h3 class="dressroom_create_title">드레스룸 등록</h3>
<section id="dressroom_create">
    <div class="dressroom_create_detail">
        <h3>제목 <input type="text" name="dressroomName" id=""></h3>
        <h3>내용</h3>
        <span>파일 첨부</span><button>쇼핑몰 내 검색</button><button>사진</button><button>동영상</button>
    </div>
    <div class="dress">
    	<textarea rows="20" cols="70" name="dressroomDescription"></textarea>
    </div>
    <div class="dressroom_create_detail">
        <h3>태그 : 남성, 겨울</h3>
    </div>
    <div class="dressRoom_create_down">
        <input type="submit" value="등록" />
    </div>
</section>
</form>
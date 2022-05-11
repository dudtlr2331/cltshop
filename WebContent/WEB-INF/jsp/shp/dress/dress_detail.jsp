<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/dressRoom.css" rel="stylesheet">

<form name="frm" action="/DispatcherServlet?command=dress_edit" method="post">
	<input type="hidden" name="dressroomInfoSEQ" value="${pvo.dressroomInfoSEQ }" />
	
	<div>제목</div>
	<input type="text" value="${pvo.dressroomName}"><br/>
	
	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="70">${pvo.dressroomDescription}</textarea><br/>
	
	<div>태그</div>
	<input type="text" value="${pvo.tagId}"><br/>
	
	<div>작성자</div>
	<div>${pvo.userId}</div>
    
	<div>좋아요 수</div>
	<div>${pvo.dressroomLike}</div>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=dress_main'"/>
    <input type="submit" value="수정"/>
</form>
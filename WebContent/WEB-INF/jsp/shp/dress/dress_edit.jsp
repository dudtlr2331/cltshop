<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/dressRoom.css" rel="stylesheet">

<form name="frm" action="/DispatcherServlet?command=dress_edit_act" method="post" onsubmit="return fn_dress_edit()">
	<input type="hidden" name="dressroomInfoSEQ" value="${pvo.dressroomInfoSEQ }" />
	
	<div>제목</div>
	<input type="text" name="dressroomName" value="${pvo.dressroomName}"><br/>
	
	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="70" name="dressroomDescription">${pvo.dressroomDescription}</textarea><br/>
	
	<div>태그</div>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=dress_main'"/>
    <input type="button" value="삭제" onclick="fn_dress_remove('${pvo.dressroomInfoSEQ}')"/>
    <input type="submit" value="수정"/>
</form>
<script>
function fn_dress_edit(){
	if(confirm('드레스룸을 정말 수정 하시겠습니까?')){
		return true;
	}else{
		return false;
	}
}

function fn_dress_remove(dressroomInfoSEQ){
	if(confirm('드레스룸을 정말 삭제 하시겠습니까?')){
		location.href='/DispatcherServlet?command=dress_remove_act&dressroomInfoSEQ=' + dressroomInfoSEQ;
	}
}
</script>
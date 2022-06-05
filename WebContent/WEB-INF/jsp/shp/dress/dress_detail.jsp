<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/dressRoom.css" rel="stylesheet">

<form name="frm" action="/DispatcherServlet?command=dress_edit" method="post">
	<input type="hidden" name="saleBoardRpySeq" value="${pvo.saleBoardRpySeq }" />
	
	<div>제목</div>
	<input type="text" value="${pvo.bulTitNm}"><br/>

	<div id="imgPreView">
		<img alt="" width="300px" src="${pvo.imgPath}${pvo.imgNm}">
	</div>

	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="70">${pvo.bulCont}</textarea><br/>
	
	<div>태그</div>
	
	<div>작성자</div>
	<div>${pvo.rgstId}</div>
    
	<div>좋아요 수</div>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=dress_main'"/>
    <input type="submit" value="수정"/>
</form>
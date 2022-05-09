<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

<form name="frm" action="/DispatcherServlet?command=qna_edit" method="post">
	<input type="hidden" name="qnaBoardSeq" value="${pvo.qnaBoardSeq }" />
	
	<div>제목</div>
	<input type="text" value="${pvo.titNm}"><br/>
	
	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="100">${pvo.cont}</textarea><br/>
	
	<div>카테고리</div>
	<input type="text" value="${pvo.qnaTp}"><br/>
	
	<div>답변 상태</div>
	<input type="text" value="${pvo.ansrStat}"><br/>
    
	<div>사용 여부</div>
	<input type="text" value="${pvo.useYn}"><br/>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=qna'"/>
    <input type="submit" value="수정"/>
</form>
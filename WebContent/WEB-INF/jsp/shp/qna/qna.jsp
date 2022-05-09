<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/one_qna.css" rel="stylesheet">
<c:if test="${not empty sessionScope.message}">
	<script type="text/javascript">alert("${sessionScope.message}");</script>
	<c:remove var="message" scope="session"/>
</c:if>
<h3>1:1 문의</h3>
<table>
    <thead>
        <tr>
            <th>번호</th><th>구분</th><th>제목</th><th>등록일</th><th>작성자</th><th>상태</th>
        </tr>
    </thead>
    <tbody>
	    	<c:if test="${empty list }">
	    		<tr><td colspan="6">데이터가 없습니다.</td></tr>
	    	</c:if>
	    	<c:forEach items="${list }" var="obj">
		        <tr>
		            <td>${obj.qnaBoardSeq}</td>
		            <td>${obj.qnaTp}</td>
		            <td><a href="/DispatcherServlet?command=qna_detail&qnaBoardSeq=${obj.qnaBoardSeq}">${obj.titNm}</a></td>
		            <td>${obj.rgstDate}</td>
		            <td>${obj.rgstId}</td> <!-- <td>처리일</td> -->
		            <td>${obj.ansrStat}</td>
		        </tr>
	    	</c:forEach>
	</table>
<input type="button" value="작성하기" onclick="location.href='/DispatcherServlet?command=qna_insert'" />
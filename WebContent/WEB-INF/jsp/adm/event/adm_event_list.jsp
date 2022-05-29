<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>이벤트 배너 목록</h2>
<div class="data_list">
	<table>
	    <thead>
	        <tr>
	            <th>선택</th>
	            <th>이벤트 코드</th>
	            <th>이벤트 이름</th>
	            <th>이벤트 등록 날짜</th>
	            <th>이벤트 만료 날짜</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<c:if test="${empty list }">
	    		<tr><td colspan="4">데이터가 없습니다.</td></tr>
	    	</c:if>
	    	<c:forEach items="${list }" var="obj" varStatus="cnt">
		        <tr>
		            <td>
		            	<input type="checkbox" id="cb">
		            </td>
		            <td>${obj.eventNum}</td>
		            <td><a href="/DispatcherServlet?command=adm_event_edit&eventInfoSeq=${obj.eventInfoSeq}">${obj.eventName}</a></td>
		            <td>${obj.eventRegistDate}</td>
		            <td>${obj.eventEndDate}</td>
		        </tr>
	    	</c:forEach>
	    </tbody>
	</table>
</div>
<div class="btn_area">
	<input type="button" value="추가" onclick="location.href='/DispatcherServlet?command=adm_event_register'" />
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>쿠폰 목록</h2>
<div class="data_list">
	<table>
	    <thead>
	        <tr>
	            <th>선택</th>
	            <th>쿠폰 코드</th>
	            <th>쿠폰 이름</th>
	            <th>쿠폰 할인율</th>
	            <th>쿠폰 등록 날짜</th>
	            <th>쿠폰 만료 날짜</th>
	            <th>쿠폰 개수</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<c:if test="${empty list }">
	    		<tr><td colspan="7">데이터가 없습니다.</td></tr>
	    	</c:if>
	    	<c:forEach items="${list }" var="obj" varStatus="cnt">
		        <tr>
		            <td>
		            	<input type="checkbox" id="cb">
		            </td>
		            <td>${obj.couNum}</td>
		            <td><a href="/DispatcherServlet?command=adm_cpn_edit&couInfoSeq=${obj.couInfoSeq}">${obj.couName}</a></td>
		            <td>${obj.couDiscount}</td>
		            <td>${obj.couRegistDate}</td>
		            <td>${obj.couEndDate}</td>
		            <td>${obj.couCount}</td> 
		        </tr>
	    	</c:forEach>
	    </tbody>
	</table>
</div>
<div class="btn_area">
	<input type="button" value="추가" onclick="location.href='/DispatcherServlet?command=adm_cpn_register'" />
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
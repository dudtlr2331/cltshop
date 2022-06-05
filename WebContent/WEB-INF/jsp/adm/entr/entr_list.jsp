<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>업체 관리 > 업체 목록</h2>
<div class="src_area">
	<div>
		<select>
			<option>등록일순</option>
			<option>이름순</option>
		</select>
	</div>
</div>
<div class="data_list">
	<table>
	    <thead>
	        <tr>
	            <th>전체선택</th>
	            <th>순번</th>
	            <th>거래처명</th>
	            <th>대표자명</th>
	            <th>대표자번호</th>
	            <th>담당자명</th>
	            <th>담당자번호</th>
	            <th>평점</th>
	            <th>개점일</th>
	            <th>폐점일</th>
	            <th>오픈여부</th>
	            <th>사용여부</th>
	            <th>등록 아이디</th>
	            <th>수정 아이디</th>
	        </tr>
	    </thead>
	    <tbody>
	    	<c:if test="${empty entrList }">
	    		<tr><td colspan="12">데이터가 없습니다.</td></tr>
	    	</c:if>
	    	<c:forEach items="${entrList }" var="obj" varStatus="cnt">
		        <tr>
		            <td><input type="checkbox" id="cb"></td>
		            <td>${cnt.count}</td>
		            <td><a href="/DispatcherServlet?command=adm_entr_edit&entrNo=${obj.entrNo}">${obj.entrNm}</a></td>
		            <td>${obj.presNm}</td>
		            <td>${obj.presTell}</td>
		            <td>${obj.aempNm}</td>
		            <td>${obj.aempTell}</td>
		            <td>${obj.score}</td>
		            <td>${obj.opnDate}</td>
		            <td>${obj.closeDate}</td>
		            <td>${obj.opnYn}</td>
		            <td>${obj.useYn}</td>
		            <td>${obj.rgstId}</td>
		            <td>${obj.updtId}</td>
		        </tr>
	    	</c:forEach>
	    </tbody>
	</table>
</div>
<div class="btn_area">
	<input type="button" value="등록" onclick="location.href='/DispatcherServlet?command=adm_entr_register'" />
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
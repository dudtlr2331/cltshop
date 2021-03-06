<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>1:1 문의 관리</h2>
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
        <tr>
            <th>전체선택</th>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>등록일</th>
            <th>답변상태</th>
        </tr>
        <c:forEach items="${rvo}" var="obj">
	        <tr>
	            <td><input type="checkbox" id="cb"></td>
	            <td>${obj.qnaBoardSeq}</td>
	            <td>${obj.titNm}</td>
	            <td>${obj.rgstId }</td>
	            <td>${obj.rgstDate}</td>
	            <td><button class="one_btn"><a href="/DispatcherServlet?command=adm_qna_answer&qnaBoardSeq=${obj.qnaBoardSeq}">답변하기</a></button></td>
	        </tr>
		</c:forEach>
    </table>
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
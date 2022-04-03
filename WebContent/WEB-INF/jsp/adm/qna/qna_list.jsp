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
        <tr>
            <td><input type="checkbox" id="cb"></td>
            <td>01</td>
            <td>문의 테스트입니다.</td>
            <td>1(user1)</td>
            <td>2021-01-01</td>
            <td><button class="one_btn"><a href="/html/admin/one_management/one_management_answer.html">답변하기</a></button></td>
        </tr>
    </table>
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
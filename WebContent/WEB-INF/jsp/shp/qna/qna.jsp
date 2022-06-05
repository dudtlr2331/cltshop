<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<style>
	.item_list_area {
		padding: 10px;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	.item_list_area table{
		width: 80%;
	}
	.item_list_area table th{
		text-align: center;
		padding-bottom: 10px;
	}
	.item_list_area table td{
		text-align: center;
		padding-top: 10px;
		padding-bottom: 10px;
	}
	.btn_area{
		width: 80%;
	}
</style>
<section class="title_area">
	<h3 class="title">1:1 문의</h3>
</section>
<section class="item_list_area">
	<table>
		<thead>
			<tr><th>번호</th><th>구분</th><th>제목</th><th>등록일</th><th>작성자</th><th>상태</th></tr>
		</thead>
		<tbody>
		<c:if test="${empty list }">
			<tr><td class="nodata" colspan="6">데이터가 없습니다.</td></tr>
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
		</tbody>
	</table>
	<div class="btn_area">
		<input type="button" class="w70" value="작성하기" onclick="location.href='/DispatcherServlet?command=qna_insert'" />
	</div>
</section>
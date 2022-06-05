<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<link href="/css/mypage_qna.css" rel="stylesheet">

<article id="content">
    <div class="icon">
        <i class="fa-solid fa-truck"></i>
        <i class="fa-solid fa-p"></i>
        <i class="fa-solid fa-money-check-dollar"></i>
        <i class="fa-solid fa-comments"></i>
    </div>
    <div class="icon_btn">
        <a href="DispatcherServlet?command=mypage" class="a">주문/배송조회 ></a>
        <a href="DispatcherServlet?command=mypage_point" class="b">포인트 ></a>
        <a href="DispatcherServlet?command=mypage_coupon" class="c">쿠폰 ></a>
        <a href="DispatcherServlet?command=mypage_qna" class="d">Q&A</a>
    </div>
</article>
<article id="my_qna">
    <h2>상품 Q&A</h2>
    <%-- <c:if test="${empty qnaList }">
		<div class="qna_body">
			<span>Q&A 내역이 존재하지 않습니다.</span>
		</div>
	</c:if>
	<c:forEach items="${qnaList}" var="obj">
		<tr>
			<td>${obj.qnaBoardSeq}</td>
			<td>${obj.qnaTp}</td>
			<td><a href="/DispatcherServlet?command=qna_detail&qnaBoardSeq=${obj.qnaBoardSeq}">${obj.titNm}</a></td>
			<td>${obj.rgstDate}</td>
			<td>${obj.rgstId}</td>
			<td>${obj.ansrStat}</td>
		</tr>
	</c:forEach> --%>
	<table>
		<thead>
			<tr><th>번호</th><th>구분</th><th>제목</th><th>등록일</th><th>작성자</th><th>상태</th></tr>
		</thead>
		<tbody>
		<c:if test="${empty qnaList }">
			<tr><td class="nodata" colspan="6">데이터가 없습니다.</td></tr>
		</c:if>
		<c:forEach items="${qnaList }" var="obj">
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
</article>
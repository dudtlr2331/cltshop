<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<div class="con">
    <h2>상품 문의 관리</h2>
    <h4>문의 관리</h4>
    <hr>
</div>
<div class="search">
    <p>상품검색</p>
    <select id="search_select">
        <option>상품명</option>
        <option>제목</option>
        <option>작성자</option>
    </select>
    <input class="se">
</div>
<div class="pro_qna">
    <select>
        <option>등록일순</option>
        <option>이름순</option>
    </select>
    <table>
        <thead>
            <tr>
                <th>전체선택</th><th>상품명</th><th>제목</th><th>작성자</th><th>등록일</th><th>답변상태</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" id="cb"></td><td>상품1</td><td>테스트1</td><td>1</td><td>2021-12-28</td>
                <td><button class="pro_qna_btn"><a href="/html/admin/product_postscript/product_postscript_answer.html">답변</a></button></td>
            </tr>
        </tbody>
    </table>
</div>
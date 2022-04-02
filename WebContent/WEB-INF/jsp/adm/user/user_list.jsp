<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>회원 관리</h2>
<div class="src_area">
    <h4>회원 검색</h4>
    <div>
	    <table>
	    	<colgroup>
	    		<col width="25%"/>
	    		<col width="25%"/>
	    		<col width="25%"/>
	    		<col width="25%"/>
	    	</colgroup>
	        <tr>
	            <th class="col">검색</th>
	            <td colspan="3">
	             <select>
	                 <option>아이디</option>
	                 <option>이름</option>
	             </select>
	             <input class="search" type="text"/>
	            </td>
	        </tr>
	        <tr>
	            <th>회원등급</th>
	            <td>
	             <select>
	                 <option>등급</option>
	                 <option>회원</option>
	                 <option>관리자</option>
	             </select>
	            </td>
	            <th>회원구분</th>
	            <td>
	                <label>빨강<input type="radio" name="color" value="red" checked="checked"></label><br/>
	                <label>노랑<input type="radio" name="color" value="yellow"></label><br/>
	                <label>파랑<input type="radio" name="color" value="blue"></label><br/>
	            </td>
	        </tr>
	        <tr>
	            <th class="col">회원가입일</th>
	            <td colspan="3"><input class="membership_date1" type="text"/><input class="membership_date2" type="text"/></td>
	        </tr>
	    </table>
    </div>
    <div>
        <div>검색 1명 / 전체 1명</div>
        <select>
            <option>회원가입순</option>
            <option>번호 순</option>
        </select>
    </div>
</div>

<button id="go" class="btn_prod">회원 등록</button>
<button class="member_search_btn">검색</button>

<div class="data_list">
	<table>
		<colgroup>
			<col width="3%"/>
			<col width="10%"/>
			<col width="17%"/>
			<col width="10%"/>
			<col width="10%"/>
			<col width="10%"/>
			<col width="10%"/>
			<col width="10%"/>
			<col width="10%"/>
			<col width="10%"/>
		</colgroup>
		<thead>
			<tr>
				<th></th>
				<th>번호</th>
				<th>아이디/닉네임</th>
				<th>이름</th>
				<th>등급</th>
				<th>적립금</th>
				<th>구매건수</th>
				<th>구매금액</th>
				<th>회원가입일</th>
				<th>정보수정</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input type="checkbox"></td>
				<td>01</td>
				<td>user1/유저</td>
				<td>홍길동</td>
				<td>일반회원</td>
				<td>1000원</td>
				<td>1건</td>
				<td>29,900원</td>
				<td>2018-01-01</td>
				<td>0</td>
			</tr>
		</tbody>
	</table>
</div>

<div id="popup" style="display: none;">
    <h3>회원 등록</h3>
    <div id="popup-text">
        아이디  <input type="text"/><br>
        닉네임  <input type="text"/><br>
        이름  <input type="text"/><br>
        등급  <input type="text"/><br>
        적립금  <input type="text"/><br>
        구매건수  <input type="text"/><br>
        구매금액  <input type="text"/><br>
        회원가입일  <input type="text"/><br>
    </div>
    <button id="exit" class="join_btn">등록</button>
</div>
<script>
const go = document.querySelector("#go");
const bg = document.querySelector("#bg");
const popup = document.querySelector("#popup");
const exit = document.querySelector("#exit");

go.addEventListener("click",function(){
    bg.classList.remove("hidden");
    popup.classList.remove("hidden");
});
exit.addEventListener("click",function(){
    bg.classList.add("hidden");
    popup.classList.add("hidden");
});
</script>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
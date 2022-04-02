<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>주문 관리</h2>
<div class="src_area">
	<h3>주문내역 검색</h3>
	<div>
		<table>
			<colgroup>
				<col width="10%"></col>
				<col width="90%"></col>
			</colgroup>
			<tr>
				<th>검색조건</th>
				<td>
					<div>
						<select>
			                <option>주문번호</option>
			                <option>주문상품정보</option>
			                <option>주문자정보</option>
			                <option>결제정보</option>
			                <option>배송완료일</option>
			                <option>배송정보</option>
			                <option>주문상태</option>
			            </select>
			            <input type="text">
					</div>
				</td>
			</tr>
			<tr>
				<th>기간</th>
				<td>
					<div>
						<select>
			                <option>주문일</option>
			            </select>
			            <a href="">전체</a>
			            <a href="">오늘</a>
			            <a href="">3일</a>
			            <a href="">7일</a>
			            <a href="">1개월</a>
			            <a href="">3개월</a>
			            <a href="">1년</a>
			            <input type="text">
			            부터
			            <input type="text">
			            까지
					</div>
				</td>
			</tr>
			<tr>
				<th>결제수단</th>
				<td>
					<div>
						<input type="checkbox">무통장입금
			            <input type="checkbox">신용카드
			            <input type="checkbox">실시간 계좌이체
			            <input type="checkbox">가상계좌
			            <input type="checkbox">휴대폰
					</div>
				</td>
			</tr>
		</table>
	</div>
	<div>
		<select name="" id="">
            <option value="">주문번호순</option>
            <option value="">주문일순</option>
        </select>
	</div>
</div>
<div class="data_list">
    <table>
        <thead>
            <tr>
                <th>전체선택</th>
                <th>주문번호</th>
                <th>주문일</th>
                <th>주문상품정보</th>
                <th>주문자정보</th>
                <th>결제정보</th>
                <th>배송완료일</th>
                <th>배송정보</th>
                <th>주문상태</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox"></td>
                <td>20200501-12345678</td>
                <td>2020-05-01</td>
                <td>상품1</td>
                <td>user1</td>
                <td>29,900<br>신용카드</td>
                <td></td>
                <td></td>
                <td>
                    <select>
                        <option>배송중</option>
                        <option>배송완료</option>
                    </select>
                </td>
            </tr>
        </tbody>
    </table>
    <div>
        <button>1</button>
    </div>
</div>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
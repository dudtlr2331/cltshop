<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<div class="member_search">
    <h2>회원 관리</h2>
    <h4>회원 검색</h4>
    <table>
        <thead>
            <tr>
                <th class="col">검색</th>
                <th><select>
                    <option>아이디</option>
                    <option>이름</option>
                </select></th>
                <th><input class="search" type="text"/></th>
            </tr>
            <tr>
                <th class="col">회원등급</th>
                <th><select>
                    <option>등급</option>
                    <option>회원</option>
                    <option>관리자</option>
                </select></th>
                <th class="col2">회원구분</th>
                <!-- <th>
                    <label><input type="radio" name="color" value="red" checked="checked">빨강</label>
                    <label><input type="radio" name="color" value="yellow">노랑</label>
                    <label><input type="radio" name="color" value="blue">파랑</label>
                </th>                     -->
            </tr>
            <tr>
                <th class="col">회원가입일</th>
                <th><input class="membership_date1" type="text"/></th>
                <th><input class="membership_date2" type="text"/></th>
            </tr>
        </thead>
    </table>
</div>
<button id="go" class="btn_prod">회원 등록</button>
<button class="member_search_btn">검색</button>
<section>
    <div class="a">
        <div>검색 1명 / 전체 1명</div>
        <select>
            <option>회원가입순</option>
            <option>번호 순</option>
        </select>
    </div>
    <div class="b">
        <div>   </div>
        <div>번호</div>
        <div>아이디/닉네임</div>
        <div>이름</div>
        <div>등급</div>
        <div>적립금</div>
        <div>구매건수</div>
        <div>구매금액</div>
        <div>회원가입일</div>
        <div>정보수정</div>
    </div>
    <div class="c">
        <input type="checkbox">
        <div>01</div>
        <div>user1/유저</div>
        <div>홍길동</div>
        <div>일반회원</div>
        <div>1000원</div>
        <div>1건</div>
        <div>29,900원</div>
        <div>2018-01-01</div>
        <div>0</div>
    </div>
</section>

<div id="bg" class="hidden"></div>
<div id="popup" class="hidden">
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
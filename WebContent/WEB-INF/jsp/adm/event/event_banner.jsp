<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
<section id="top">
    <div>
        선택한 항목을 <button>X삭제</button>
    </div>
    <button id="go" class="btn_prod">등록</button>
</section>
<section id="bottom">
    <table>
        <tr>
            <th><input type="checkbox"></th>
            <th class="b1">번호</th>
            <th class="b2">제목</th>
            <th class="b3">상태</th>
            <th class="b4">기간</th>
            <th class="b5">등록일</th>
        </tr>
        <tr>
            <td class="bb">배너 내역이 없습니다.</td>
        </tr>
    </table>
</section>

<div id="bg" class="hidden"></div>
<div id="popup" class="hidden">
    <h3>이벤트 배너 등록</h3>
    <div id="popup-text">
        <table>
            <tr>
                <th>제목</th>
                <td><input type="text"></td>
            </tr>
            <tr>
                <th>기간 설정</th>
                <td><input type="date"> ~ <input type="date"></td>
            </tr>
            <tr>
                <th>진행 여부</th>
                <td><input type="radio">대기<input type="radio">진행<input type="radio">종료</td>
            </tr>
        </table>
    </div>
    <div id="popup-text">
        <table>
            <tr>
                <th>이미지 설정</th>
                <th>순서</th>
                <th>편집</th>
                <th>이미지 등록</th>
                <th>URL</th>
            </tr>
            <tr>
                <td></td>
                <td>1</td>
                <td>↑ ↓</td>
                <td><input type="file"></td>
                <td><input type="url"></td>
            </tr>
        </table>
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

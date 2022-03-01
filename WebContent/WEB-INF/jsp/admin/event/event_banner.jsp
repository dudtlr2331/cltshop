<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/manager_menu.css" rel="stylesheet">
    <link href="/css/event_banner.css" rel="stylesheet">
    <title>이벤트 관리</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <header id="header">
        <div class="logo">쇼핑몰로고...</div>
    </header>
    <nav id="main_cate">
        <ul id="manage_main">
           <li><a href="/html/admin/product_control/product_control.html">상품 관리</a></li>
           <li><a href="/html/admin/product_order/product_order.html">주문 관리</a></li>
           <li><a href="/html/admin/member_m/member_m.html">회원 관리</a></li>
           <li><a href="/html/admin/event_banner/event_banner.html">이벤트 관리</a></li>
                <ul class="submanage_menu">
                    <li><a href="">이벤트 배너 관리</a></li>
                </ul>
           <li><a href="/html/admin/sales_management/sales_management.html">매출현황</a></li>
           <li><a href="#">드레스룸 관리</a></li>
           <li><a href="#">1:1 문의 관리</a></li>
           <li><a href="/html/admin/coupon_m/coupon.html">쿠폰/적립금 관리</a></li>
        </ul>
    </nav>
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
</body>
</html>
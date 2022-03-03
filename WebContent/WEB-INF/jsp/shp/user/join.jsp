<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/join.css" rel="stylesheet">
    <title>회원가입</title>
    <script src="/js/common.js" defer></script>
</head>

<body>
    <div class="logo">쇼핑몰로고...</div>
    <section id="section">
        <h1>회원가입</h1>
        <div id="id">
            <pre>아이디</pre>
            <input class="id" placeholder="아이디 입력 ">
        </div>
        <div id="email">
            <pre>이메일</pre>
            <input class="email" type="email" placeholder="이메일 입력 ">
        </div>
        <div id="pwd">
            <pre>비밀번호</pre>
            <input class="pwd" type="password" placeholder="비밀번호 입력 ">
            <input class="pwd" type="password" placeholder="비밀번호 재입력 ">
        </div>
        <div id="ph">
            <pre>전화번호</pre>
            <input class="ph" type="tel" placeholder="010">
            <input class="ph" type="tel" placeholder="0000">
            <input class="ph" type="tel" placeholder="0000">
            <button id="c_btn">인증요청</button>
        </div>
        <div id="ymd">
            <pre>생년월일</pre>
            <select name="yy">
                <option value="">년도</option>
                <option value="년도">1999</option>
                <option value="년도">1998</option>
                <option value="년도">1997</option>
                <option value="년도">1996</option>
                <option value="년도">1995</option>
                <option value="년도">1994</option>
            </select>
            <select name="mm">
                <option value="">월</option>
                <option value="월">1</option>
                <option value="월">2</option>
                <option value="월">3</option>
                <option value="월">4</option>
                <option value="월">5</option>
                <option value="월">6</option>
                <option value="월">7</option>
                <option value="월">8</option>
                <option value="월">9</option>
                <option value="월">10</option>
                <option value="월">11</option>
                <option value="월">12</option>
            </select>
            <select name="dd">
                <option value="">일</option>
                <option value="일">1</option>
                <option value="일">2</option>
                <option value="일">3</option>
                <option value="일">4</option>
                <option value="일">5</option>
                <option value="일">6</option>
                <option value="일">7</option>
                <option value="일">8</option>
                <option value="일">9</option>
                <option value="일">10</option>
                <option value="일">11</option>
                <option value="일">12</option>
                <option value="일">13</option>
                <option value="일">14</option>
                <option value="일">15</option>
                <option value="일">16</option>
                <option value="일">17</option>
                <option value="일">18</option>
                <option value="일">19</option>
                <option value="일">20</option>
                <option value="일">21</option>
                <option value="일">22</option>
                <option value="일">23</option>
                <option value="일">24</option>
                <option value="일">25</option>
                <option value="일">26</option>
                <option value="일">27</option>
                <option value="일">28</option>
                <option value="일">29</option>
                <option value="일">30</option>
                <option value="일">31</option>
            </select>
        </div>
        <button id="join_btn" onclick="pageMove('join')">가입하기</button>
    </section>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

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
<article id="b_content">
    <div class="a">
        <pre>2022.01.01 | 20115634931</pre>
        <pre><a href="DispatcherServlet?command=mypage_detail">주문상세보기></a></pre>
    </div>
    <div class="b">
        <pre>회사명</pre>
        <pre class="b_money">주문금액</pre>
        <pre class="b_progres">진행상황</pre>
    </div>
    <div class="c">
        <div><img src="/images/아우터4.jpg"></div>
        <div>
            <div>[1+1] 후드티</div>
            <div>그레이XL/다크그린XL</div>
            <div>1개</div>
        </div>
        <div>55,900 원</div>
        <div>구매확정</div>
    </div>
</article>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp"%>
<link href="/css/product.css" rel="stylesheet">
<!-- 상품 중간 메뉴 (상단) -->
<section id="product_menu_upperbar" class="invisible">
    <div>
        <ul class="product_menu_list_upperbar">
            <li class="product_menu_item select" data-link="#product_menu">상품정보</li>
            <li class="product_menu_item" data-link="#product_review">리뷰</li>
            <li class="product_menu_item" data-link="#product_qna">Q&A</li>
            <li class="product_menu_item" data-link="#product_order_detail">주문정보</li>
        </ul>
    </div>
</section>
<!-- 상품 메인 -->
<section id="product_main">
    <div class="product_image">
        <img alt="메인이미지" src="${detail.goods.imgPath}${detail.goods.imgNm}">
    </div>
    <div class="product_main_detail">
        <h3>${detail.sale.bulTitNm}</h3>
        <h2><fmt:formatNumber value="${detail.sale.goodsSalePrc/detail.sale.goodsPrc * 100}" pattern="###" />% <del><fmt:formatNumber value="${detail.sale.goodsPrc}" pattern="#,###" />원</del> <fmt:formatNumber value="${detail.sale.goodsPrc - detail.sale.goodsSalePrc}" pattern="#,###" />원</h2>
        <h5>배송비 <fmt:formatNumber value="${detail.goods.dlvPrc}" pattern="#,###" />원</h5>
        <h4>예상 구매가 ${detail.sale.goodsPrc - detail.sale.goodsSalePrc + detail.goods.dlvPrc}원</h4>
        <h5>적립 <fmt:formatNumber value="${(detail.sale.goodsPrc - detail.sale.goodsSalePrc) * 0.03}" pattern="#,###" />원</h5>
        <h5>리뷰정보 718개 <a href="#">리뷰 보기</a></h5>
        <select name="colorOption" id="product_main_detail_select">
            <option value="">[컬러] 옵션을 선택하세요.</option>
            <option value="W">흰색</option>
            <option value="B">검정색</option>
            <option value="G">회색</option>
        </select>
        <select name="sizeOption" id="product_main_detail_select">
            <option value="">[사이즈] 옵션을 선택하세요.</option>
            <option value="M">M</option>
            <option value="L">L</option>
            <option value="XL">XL</option>
        </select>
        <h3>총 상품 금액 0원</h3>
        <c:if test="${not empty sessionScope.loginInfo }">
	        <button class="product_main_detail_button_mid" onclick="fn_add_basket('${detail.sale.saleBoardSeq}')">장바구니</button>
        </c:if>
        <button class="product_main_detail_button_mid" onclick="location.href='/DispatcherServlet?command=order&searchSaleBoardSeq='+${detail.sale.saleBoardSeq}">바로구매</button>
        <button class="product_main_detail_button_small">♥</button>
    </div>
</section>
<!-- 상품 중간 메뉴 -->
<section id="product_menu">
    <div>
        <ul class="product_menu_list">
            <li class="product_menu_item select" data-link="#product_menu">상품정보</li>
            <li class="product_menu_item" data-link="#product_review">리뷰</li>
            <li class="product_menu_item" data-link="#product_qna">Q&A</li>
            <li class="product_menu_item" data-link="#product_order_detail">주문정보</li>
        </ul>
    </div>
</section>
<!-- 상품 정보 -->
<section id="product_detail">
    <div>
        <div class="product_detail_image">
            이미지
        </div>
        <div class="product_detail_document">
            <h3>상품 설명</h3>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라
        </div>
        <div class="product_detail_document">
            <h3>사이즈 정보</h3>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라 <br>
            블라 블라 블라 블라
        </div>
    </div>
</section>
<!-- 상품 리뷰 -->
<section id="product_review">
    <div>
        <div class="product_review_titlebar">
            <div class="product_review_title">
                <h4>사진 리뷰 346</h4>
            </div>
            <div class="product_review_sort">
                <h4><a href="">전체</a> | <a href="">사진 리뷰</a> | <a href="">텍스트 리뷰</a></h4>
            </div>
        </div>
        <div class="product_review_box">
            <div class="product_review_detail">
                <div class="product_review_profile">
                    <div class="product_review_profile_image">
                        이미지
                    </div>
                    <div class="product_review_profile_detail">
                        <div>
                            <a href="">wa*****</a><br>
                            <a href="">2022.01.01</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="product_review_document">
                <h5>178cm</h5>
                옷이 어쩌구 저쩌구<br>
                사이즈가 어쩌구 저쩌구
            </div>
            <div class="product_review_image">
                이미지
            </div>
        </div>
        <div class="product_review_box">
            <div class="product_review_detail">
                <div class="product_review_profile">
                    <div class="product_review_profile_image">
                        이미지
                    </div>
                    <div class="product_review_profile_detail">
                        <div>
                            <a href="">rl***</a><br>
                            <a href="">2022.01.01</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="product_review_document">
                <h5>180cm</h5>
                키가 어쩌구 저쩌구<br>
                내용이 어쩌구 저쩌구
            </div>
            <div class="product_review_image">
                이미지
            </div>
        </div>
        <button class="product_review_button">더 많은 사진 리뷰 보기 ></button>
        <div class="product_review_titlebar">
            <div class="product_review_title">
                <h4>텍스트 리뷰 372</h4>
            </div>
        </div>
        <div class="product_review_box">
            <div class="product_review_detail">
                <div class="product_review_profile">
                    <div class="product_review_profile_image">
                        이미지
                    </div>
                    <div class="product_review_profile_detail">
                        <div>
                            <a href="">yg******</a><br>
                            <a href="">2022.01.01</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="product_review_document">
                <h5>160cm</h5>
                사진이 어쩌구 저쩌구<br>
                리뷰가 어쩌구 저쩌구
            </div>
        </div>
        <button class="product_review_button">더 많은 텍스트 리뷰 보기 ></button>
    </div>
</section>
<!-- 상품 QnA -->
<section id="product_qna">
    <div>
        <div class="product_qna_titlebar">
            <div class="product_qna_title">
                <h4>QnA 342</h4>
            </div>
            <div class="product_qna_buttonbar">
                <button class="product_qna_button">문의 내용 작성하기</button>
            </div>
        </div>
        <div class="product_qna_detail">
            <div class="product_qna_table_title">
                <ul>
                    <li>답변상태</li>
                    <li>내용</li>
                    <li>작성자</li>
                    <li>작성일</li>
                </ul>
            </div>
            <div class="product_qna_table_content">
                <ul>
                    <li>답변완료</li>
                    <li>내용</li>
                    <li>kim****</li>
                    <li>2021.12.31</li>
                </ul>
            </div>
            <div class="product_qna_table_content">
                <ul>
                    <li>답변대기</li>
                    <li>비밀글 입니다</li>
                    <li>hap***</li>
                    <li>2022.01.01</li>
                </ul>
            </div>
            <div class="product_qna_table_content">
                <ul>
                    <li>답변대기</li>
                    <li>내용</li>
                    <li>han****</li>
                    <li>2022.01.01</li>
                </ul>
            </div>
        </div>
        <div class="product_qna_page">
            <a href="">&lt&lt</a>
            <a href="">&lt</a>
            <a href="">1</a>
            <a href="">2</a>
            <a href="">3</a>
            <a href="">4</a>
            <a href="">5</a>
            <a href="">6</a>
            <a href="">7</a>
            <a href="">8</a>
            <a href="">9</a>
            <a href="">10</a>
            <a href="">&gt</a>
            <a class="" href="">&gt&gt</a>
        </div>
    </div>
</section>
<!-- 상품 주문 정보 -->
<section id="product_order_detail">
    <div>
        <div class="product_order_title">
            <h4>배송 정보</h4>
        </div>
        <table class="product_order_table">
            <tr>
                <th class="product_order_table_title">배송방법</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">배송사</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">배송비</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">묶음 배송 여부</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">배송기간</th>
                <th class="product_order_table_document"></th>
            </tr>
        </table>
        <div class="product_order_title">
            <h4>교환 / 반품 안내</h4>
        </div>
        <table class="product_order_table">
            <tr>
                <th class="product_order_table_title">교환 / 반품 비용(왕복 비용)</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">교환 / 반품 신청 기준일</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">교환 / 반품 제한사항</th>
                <th class="product_order_table_document"></th>
            </tr>
        </table>
        <div class="product_order_title">
            <h4>판매자 정보</h4>
        </div>
        <table class="product_order_table">
            <tr>
                <th class="product_order_table_title">상호 / 대표자</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">연락처</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">E-mail</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">사업장 소재지</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">통신판매 신고번호</th>
                <th class="product_order_table_document"></th>
            </tr>
            <tr>
                <th class="product_order_table_title">사업자 정보</th>
                <th class="product_order_table_document"></th>
            </tr>
        </table>
    </div>
</section>
<script>
//상품 선택 화면 --------------------------------------------------
//상품 중간 메뉴 선택시 해당 부분으로 이동(상단 포함)
const productMenu = document.querySelector(".product_menu_list");
const productMenuUpperbar = document.querySelector(".product_menu_list_upperbar");
productMenu.addEventListener("click", (event) => { //클릭 이벤트 발생시
 const target = event.target; //마우스 클릭 타겟
 const link = target.dataset.link; //data-link와 연동
 if (link == null) { //data-link가 null일 경우
     return; //아무것도 안함
 }
 const scrollTo = document.querySelector(link);
 scrollTo.scrollIntoView({behavior : 'smooth'}); //이동
});
productMenuUpperbar.addEventListener("click", (event) => { //상단
 const target = event.target;
 const link = target.dataset.link;
 if (link == null) {
     return;
 }
 const scrollTo = document.querySelector(link);
 scrollTo.scrollIntoView({behavior : 'smooth'}); //이동
});

//일정 아래로 스크롤 하면 상품 중간 메뉴 상단에 나타남
const productUpperbar = document.querySelector('#product_menu_upperbar');
const productMenuTop = window.pageYOffset + productMenu.getBoundingClientRect().top - 10;
document.addEventListener("scroll", () => {
 if(window.scrollY > productMenuTop) {
     productUpperbar.classList.remove('invisible');
     productUpperbar.classList.add('visible');
 } else {
     productUpperbar.classList.remove('visible');
     productUpperbar.classList.add('invisible');
 }
});
</script>
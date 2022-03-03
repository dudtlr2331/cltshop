<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/product.css" rel="stylesheet">
    <title>상품상세정보</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
    <!-- 상품 중간 메뉴 (상단) -->
    <section id="product_menu_upperbar">
        <div>
            <ul class="product_menu_list_upperbar">
                <li class="product_menu_item select" data-link="#product_menu">상품정보</li>
                <li class="product_menu_item" data-link="#product_review">리뷰</li>
                <li class="product_menu_item" data-link="#product_qna">Q&A</li>
                <li class="product_menu_item" data-link="#product_order_detail">주문정보</li>
            </ul>
        </div>
    </section>
    <header id="header">
        <div class="logo">쇼핑몰로고...</div>
        <div class="top_btn">
           <input type="text"/>
           <a href=""><i class="fa-solid fa-cart-shopping"></i></a>
           <a href="/html/user/login/login.html"><i class="fa-solid fa-user-large"></i></a>
        </div>
     </header>
     <section id="main_benner">
        <ul class="menu">
            <a href="/html/user/main/main.html"><li>홈</li></a>
            <a href="/html/user/category/category.html"><li>카테고리</li></a>
            <a href="/html/user/one_qna/one_qna.html"><li>1:1문의</li></a>
            <a href="/html/user/dressroom/dressRoom_main.html"><li>커뮤니티</li></a>
         </ul>
    </section>
    <!-- 상품 메인 -->
    <section id="product_main">
        <div class="product_image">
            이미지
        </div>
        <div class="product_main_detail">
            <h3>[기모 선택 / 2장] 조거 스웨트 팬츠 (3Color)</h3>
            <h2>72% <del>132,800원</del> 37,200원</h2>
            <h4>예상 구매가 29,000원</h4>
            <h5>적립 372원</h5>
            <h5>배송비 무료 배송</h5>
            <h5>리뷰정보 718개 <a href="#">리뷰 보기</a></h5>
            <select name="" id="product_main_detail_select">
                <option value="">[컬러] 옵션을 선택하세요.</option>
                <option value="">흰색</option>
                <option value="">검정색</option>
                <option value="">회색</option>
            </select>
            <select name="" id="product_main_detail_select">
                <option value="">[사이즈] 옵션을 선택하세요.</option>
                <option value="">M</option>
                <option value="">L</option>
                <option value="">XL</option>
            </select>
            <h3>총 상품 금액 0원</h3>
            <button class="product_main_detail_button_mid">장바구니</button>
            <button class="product_main_detail_button_mid">바로구매</button>
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
</body>
</html>
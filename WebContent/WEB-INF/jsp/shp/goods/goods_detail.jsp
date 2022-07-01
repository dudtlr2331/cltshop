<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp"%>
<link href="/css/product.css" rel="stylesheet">
<!-- 상품 중간 메뉴 (상단) -->
<section id="product_menu_upperbar" class="invisible">
    <div>
        <ul class="product_menu_list_upperbar">
            <li class="product_menu_item select" data-link="#product_menu">상품정보</li>
            <li class="product_menu_item" data-link="#product_review">드레스룸</li>
            <li class="product_menu_item" data-link="#product_qna">Q&A</li>
            <li class="product_menu_item" data-link="#product_order_detail">주문정보</li>
        </ul>
    </div>
</section>
<!-- 상품 메인 -->
<section id="product_main">
    <div class="product_image">
        <img alt="메인이미지" src="${detail.goods.imgPath}${detail.goods.imgNm} " width="348" height="349">
    </div>
    <div class="product_main_detail">
        <h3>${detail.sale.bulTitNm}</h3>
        <h2><fmt:formatNumber value="${detail.sale.goodsSalePrc/detail.sale.goodsPrc * 100}" pattern="###" />% <del><fmt:formatNumber value="${detail.sale.goodsPrc}" pattern="#,###" />원</del> <fmt:formatNumber value="${detail.sale.goodsPrc - detail.sale.goodsSalePrc}" pattern="#,###" />원</h2>
        <h5>배송비 <fmt:formatNumber value="${detail.goods.dlvPrc}" pattern="#,###" />원</h5>
        <h4>예상 구매가 ${detail.sale.goodsPrc - detail.sale.goodsSalePrc + detail.goods.dlvPrc}원</h4>
        <h5>적립 <fmt:formatNumber value="${(detail.sale.goodsPrc - detail.sale.goodsSalePrc) * 0.03}" pattern="#,###" />원</h5>
       <!--  <h5>리뷰정보 718개 <a href="#">리뷰 보기</a></h5> -->
        <select name="colorOption" id="colorOption">
            <option value="">[컬러] 옵션을 선택하세요.</option>
            <option value="흰색">흰색</option>
            <option value="검정색">검정색</option>
            <option value="회색">회색</option>
            <option value="파란색">파란색</option>
        </select>
        <select name="sizeOption" id="sizeOption">
            <option value="">[사이즈] 옵션을 선택하세요.</option>
            <option value="S">S</option>
            <option value="M">M</option>
            <option value="L">L</option>
            <option value="XL">XL</option>
        </select>
        <h3>총 상품 금액 ${detail.sale.goodsPrc - detail.sale.goodsSalePrc + detail.goods.dlvPrc}원</h3>
        <c:if test="${not empty sessionScope.loginInfo }">
	        <button class="product_main_detail_button_mid" onclick="fn_add_basket('${detail.sale.saleBoardSeq}')">장바구니</button>
        </c:if>
        <button class="product_main_detail_button_mid" onclick="fn_order()">바로구매</button>
        <!-- <button class="product_main_detail_button_small">♥</button> -->
    </div>
</section>
<!-- 상품 중간 메뉴 -->
<section id="product_menu">
    <div>
        <ul class="product_menu_list">
            <li class="product_menu_item select" data-link="#product_menu">상품정보</li>
            <li class="product_menu_item" data-link="#product_review">드레스룸</li>
            <li class="product_menu_item" data-link="#product_qna">Q&A</li>
            <li class="product_menu_item" data-link="#product_order_detail">주문정보</li>
        </ul>
    </div>
</section>
<!-- 상품 정보 -->
<section id="product_detail">
    <div>
        <div class="product_detail_image">
           	<img src="${detail.goods.imgPath}${detail.goods.imgNm}" width="697" height="697"/></br>
        </div>
        <div class="product_detail_document">
            <h3>상품 설명</h3>
            ${detail.sale.bulCont}
        </div>
        <div class="product_detail_document">
            <h3>사이즈 정보</h3>
            <img src="/images/top_size.png" width="800" height="800"/></br>
            <img src="/images/pants_size.png" width="800" height="800"/>
        </div>
    </div>
</section>
<!-- 상품 리뷰 -->
<section id="product_review">
	<div>
		<div class="product_review_titlebar">
			<div class="product_review_title">
				<h4>드레스룸</h4>
			</div>
			<div class="product_review_sort">
				
			</div>
		</div>
		<c:if test="${empty rvo }">
			<div class="nodata">작성된 드레스룸이 없습니다.</div>
		</c:if>
		<c:forEach items="${rvo}" var="obj">
			<div class="product_review_box">
				<div class=""><a href="/DispatcherServlet?command=dress_detail&saleBoardRpySeq=${obj.saleBoardRpySeq}">제목 : ${obj.bulTitNm}</a></div> <!-- 제목 -->
				<div class="product_review_detail">
					<div class="product_review_profile">
						<div class="product_review_profile_detail">
							<div>${obj.rgstId }<br>${obj.rgstDate }</div> <!-- 작성자, 작성일 -->
						</div>
					</div>
				</div>
				<div class="product_review_document">내용 : ${obj.bulCont }</div> <!-- 내용 -->
				<div class="product_review_image"><img src="${obj.imgPath }${obj.imgNm }" width="298" height="298"/></div> <!-- 이미지 -->
			</div>
		</c:forEach>
		<button class="product_review_button" onclick="location.href='/DispatcherServlet?command=main_drss_list'">더 많은 드레스룸 보기 ></button>
	</div>
</section>
<!-- 상품 QnA -->
<section id="product_qna">
    <div>
        <div class="product_qna_titlebar">
            <div class="product_qna_title">
                <h4>Q&A</h4>
            </div>
            <div class="product_qna_buttonbar">
                <button class="product_qna_button" onclick="location.href='/DispatcherServlet?command=goods_dtl_qna_insert&goodsCd='+${detail.goods.goodsCd}">문의 내용 작성하기</button>
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
            <c:if test="${empty rqvo }">
            	<div class="nodata">문의가 없습니다.</div>
			</c:if>
            <c:forEach items="${rqvo}" var="obj">
	           <div class="product_qna_table_content">
	               <ul>
	                   <li>${obj.ansrStat }</li>
	                   <li><a href="/DispatcherServlet?command=qna_detail&qnaBoardSeq=${obj.qnaBoardSeq}">${obj.cont }</a></li>
	                   <li>${obj.rgstId }</li>
	                   <li>${obj.rgstDate }</li>
	               </ul>
	           </div>
            </c:forEach>
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
                <th class="product_order_table_title">배송 기간</th>
                <th class="product_order_table_document">평일기준 익일 순차적 배송</br>
                	정상 배송 당일, 순차적으로 출고되어 정상 운영일에 발송되지 않을 수 있습니다.</br>
                	(최대 2~3일 소요)</br>
					배송 일정 및 기타 상품 관련 문의는 아래 고객센터로 접수 바랍니다.</br>
					고객센터 : 070-0000-0000</th>
            </tr>
            <tr>
                <th class="product_order_table_title">배송 마감일</th>
                <th class="product_order_table_document">평일기준 오후 3시마감</th>
            </tr>
            <tr>
                <th class="product_order_table_title">상담 가능일</th>
                <th class="product_order_table_document">운영시간 10시 ~ 17시</th>
            </tr>
        </table>
        <div class="product_order_title">
            <h4>교환/반품 안내</h4>
        </div>
        <table class="product_order_table"> <!-- 주문 정보 -->
            <tr>
                <th class="product_order_table_title">교환/반품 정보</th>
                <th class="product_order_table_document">반품 및 교환은 상품 수령 후 7일 이내에 신청하실 수 있습니다.</br>
					재화 등의 내용이 표시, 광고의 내용과 다르거나 계약내용과 다르게 이행된 경우에는 전자상거래법 제17조3항에 따라 청약철회를 할 수 있습니다.</br>
					교환/환불이 발생하는 경우 그 원인을 제공한 자가 배송비를 부담합니다.</br>
					- 고객변심 : 최초 배송비 + 반품 배송비 + (교환의 경우) 교환 배송비는 고객이 부담</br>
					- 판매자귀책 : 최초 배송비 + 반품 배송비 + (교환의 경우) 교환 배송비는 판매자가 부담</br>
					다음의 경우는 교환 및 환불이 불가능합니다.</br>
					- 반품/교환 가능 기간을 초과한 경우</br>
					- 상품 및 구성품을 분실하였거나 취급부주의로 인한 오염/파손/고장된 경우</br>
					- 상품을 착용하였거나 세탁, 수선한 경우</br>
					- 소비자 과실로 인한 옷의 변색(예 : 착생, 화장품 오염 등)</br>
					- 착용으로 인한 니트류 상품의 늘어남 발생 및 가죽 제품의 주름 발생</br>
					- 명품은 택 제거 후 반품 불가</br>
					- 상품의 가치가 현저히 감소하여 재판매가 불가할 경우</br>
					- 구매확정된 주문의 경우</br>
					- 귀금속류의 경우는 소비자분쟁해결 기준에 의거 교환만 가능합니다.</br>
					(단, 함량미달의 경우에는 환불이 가능함)</br>
        </table>
        <div class="product_order_title"> <!-- 판매자 정보 -->
            <h4>판매자 정보</h4>
        </div>
        <table class="product_order_table">
            <tr>
                <th class="product_order_table_title">상호 / 대표자</th>
                <th class="product_order_table_document">CLTshop / 성영식</th>
            </tr>
            <tr>
                <th class="product_order_table_title">연락처</th>
                <th class="product_order_table_document">010-1234-5678</th>
            </tr>
            <tr>
                <th class="product_order_table_title">E-mail</th>
                <th class="product_order_table_document">cltshop@gmail.com</th>
            </tr>
            <tr>
                <th class="product_order_table_title">사업장 소재지</th>
                <th class="product_order_table_document">경기 부천시 소사로 56</th>
            </tr>
            <tr>
                <th class="product_order_table_title">통신판매업신고</th>
                <th class="product_order_table_document">2022-부천소사-0001</th>
            </tr>
            <tr>
                <th class="product_order_table_title">사업자 번호</th>
                <th class="product_order_table_document">123-12-12345</th>
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
//바로 구매 버튼 클릭시
function fn_order(){
	let select_color_option = document.querySelector("#colorOption");
	let select_size_option = document.querySelector("#sizeOption");
	
	if(select_color_option.value != "" &&  select_size_option.value != ""){
		location.href='/DispatcherServlet?command=order&searchSaleBoardSeq='+${detail.sale.saleBoardSeq}+'&colorOption='+select_color_option.value+'&sizeOption='+select_size_option.value;
	}else{
		alert("옵션을 선택해주세요.");
	}
}
</script>
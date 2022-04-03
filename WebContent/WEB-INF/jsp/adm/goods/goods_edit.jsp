<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>상품 관리 > 상품 목록 > 상품 등록</h2>
<form action="/DispatcherServlet?command=adm_goods_register_act" method="post" enctype="multipart/form-data">
<div class="data_list">
    <table>
    	<colgroup>
    		<col width="20%" />
    		<col width="30%" />
    		<col width="20%" />
    		<col width="30%" />
    	</colgroup>
    	<tr>
    		<th><div>판매처</div></th>
    		<td>
    			<select name="entrNo">
    				<option value="1" <c:if test="${pvo.entrNo eq '1'}" >select</c:if>>온라인몰</option>
    			</select>
    		</td>
    		<th><div>판매상태</div></th>
    		<td>
    			<select name="saleStatCd">
    				<option value="01" <c:if test="${pvo.saleStatCd eq '01'}" >select</c:if>>판매중</option>
    				<option value="02" <c:if test="${pvo.saleStatCd eq '02'}" >select</c:if>>판매중지</option>
    				<option value="03" <c:if test="${pvo.saleStatCd eq '03'}" >select</c:if>>품절</option>
    				<option value="04" <c:if test="${pvo.saleStatCd eq '04'}" >select</c:if>>재고부족</option>
    			</select>
    		</td>
    	</tr>
        <tr>
    		<th><div>상품명</div></th>
            <td><input type="text" name="goodsNm" value="${pvo.goodsNm}"></td>
            <th><div>상품가격</div></th>
            <td><input type="number" name="goodsPrc" value="${pvo.goodsPrc}"></td>
        </tr>
        <tr>
			<th><div>대분류</div></th>
            <td>
                <select name="catgryCd">
                    <option value="S01" <c:if test="${pvo.catgryCd eq 'S01'}" >select</c:if>>상의</option>
                    <option value="S02" <c:if test="${pvo.catgryCd eq 'S02'}" >select</c:if>>아우터</option>
                    <option value="S03" <c:if test="${pvo.catgryCd eq 'S03'}" >select</c:if>>바지</option>
                    <option value="S04" <c:if test="${pvo.catgryCd eq 'S04'}" >select</c:if>>원피스</option>
                    <option value="S05" <c:if test="${pvo.catgryCd eq 'S05'}" >select</c:if>>신발</option>
                    <option value="S06" <c:if test="${pvo.catgryCd eq 'S06'}" >select</c:if>>가방</option>
                </select>
            </td>
            <th><div>소분류</div></th>
            <td>
				<select name="catgryCd2">
					<option value="">대분류선택</option>
				</select>
            </td>            
        </tr>
        <tr>
            <th><div>상품수량</div></th>
            <td><input type="number" name="inyQty" value="${pvo.inyQty}"></td>
            <th><div>배송비</div></th>
            <td><input type="number" name="dlvPrc" value="${pvo.dlvPrc}"></td>
        </tr>
        <tr>
        	<th><div>사이즈</div></th>
            <td>
                <select name="goodsSize">
                    <option value="XS" <c:if test="${pvo.goodsSize eq 'XS'}" >select</c:if>>S</option>
                    <option value="S" <c:if test="${pvo.goodsSize eq 'S'}" >select</c:if>>S</option>
                    <option value="M" <c:if test="${pvo.goodsSize eq 'M'}" >select</c:if>>M</option>
                    <option value="L" <c:if test="${pvo.goodsSize eq 'L'}" >select</c:if>>L</option>
                    <option value="XL" <c:if test="${pvo.goodsSize eq 'XL'}" >select</c:if>>XL</option>
                    <option value="XXL" <c:if test="${pvo.goodsSize eq 'XXL'}" >select</c:if>>XXL</option>
                    <option value="XXXL" <c:if test="${pvo.goodsSize eq 'XXXL'}" >select</c:if>>XXXL</option>
                    <option value="FREE" <c:if test="${pvo.goodsSize eq 'FREE'}" >select</c:if>>FREE</option>
                </select>
            </td>
            <th><div>컬러</div></th>
            <td>
                <select name="goodsClr">
                    <option value="black" <c:if test="${pvo.goodsClr eq 'black'}" >select</c:if>>블랙</option>
                    <option value="white" <c:if test="${pvo.goodsClr eq 'white'}" >select</c:if>>화이트</option>
                    <option value="naivy" <c:if test="${pvo.goodsClr eq 'naivy'}" >select</c:if>>네이비</option>
                    <option value="ivory" <c:if test="${pvo.goodsClr eq 'ivory'}" >select</c:if>>아이보리</option>
                </select>
            </td>
        </tr>
        <tr>
            <th><div>사용여부</div></th>            
            <td>
            	<select name="useYn">
            		<option value="Y" <c:if test="${pvo.useYn eq 'Y'}" >select</c:if>>사용</option>
            		<option value="N" <c:if test="${pvo.useYn eq 'N'}" >select</c:if>>미사용</option>
            	</select>
            </td>
			<th><div>이미지</div></th>
            <td>
            	<input type="file" name="file1" onchange="previewImg(event);">
            	<input type="hidden" name="imgPath" id="imgPath" />
            	<input type="hidden" name="imgNm" id="imgNm" />
            </td>
        </tr>
        <tr>
            <th><div>상품소개</div></th>
            <td colspan="2">
            	<textarea rows="20" cols="70" name="goodsIntr">${pvo.goodsIntr}</textarea>
            </td>
            <td>
            	<div id="imgPreView">
            		<img alt="" width="300px" src="${pvo.imgPath}/${pvo.imgNm}">
            	</div>
            </td>
        </tr>
    </table>
</div>
<div class="btn_area">
    <input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=adm_goods_list'"/>
    <input type="submit" value="등록" />
</div>
</form>
<script>
function previewImg(e){
	let reader = new FileReader();
	reader.onload = function(event) {
		let img = document.querySelector("#imgPreView img");
		if(null!=img){
			document.querySelector("#imgPreView img").remove();
		}
		img = document.createElement("img");
		img.setAttribute("src", event.target.result);
		img.setAttribute("width", "300px");
		//img.setAttribute("height", "");
		document.querySelector("#imgPreView").appendChild(img);
	};
	reader.readAsDataURL(event.target.files[0]);
}
</script>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
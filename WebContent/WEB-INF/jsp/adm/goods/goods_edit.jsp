<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>상품 관리 > 상품 목록 > 상품 등록</h2>
<form action="/DispatcherServlet?command=adm_goods_edit_act" method="post" enctype="multipart/form-data" onsubmit="return fn_goods_edit()">
<input type="hidden" name="goodsInfoSeq" value="${pvo.goodsInfoSeq }" />
<input type="hidden" name="goodsCd" value="${pvo.goodsCd }" />
<input type="hidden" name="imgPath" id="imgPath" value="${pvo.imgPath }"/>
<input type="hidden" name="imgNm" id="imgNm" value="${pvo.imgNm }" />
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
    				<option value="1" <c:if test="${pvo.entrNo eq '1'}" >selected</c:if>>온라인몰</option>
    			</select>
    		</td>
    		<th><div>판매상태</div></th>
    		<td>
    			<select name="saleStatCd">
    				<option value="01" <c:if test="${pvo.saleStatCd eq '01'}" >selected</c:if>>판매중</option>
    				<option value="02" <c:if test="${pvo.saleStatCd eq '02'}" >selected</c:if>>판매중지</option>
    				<option value="03" <c:if test="${pvo.saleStatCd eq '03'}" >selected</c:if>>품절</option>
    				<option value="04" <c:if test="${pvo.saleStatCd eq '04'}" >selected</c:if>>재고부족</option>
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
                <select name="catgryCd" id="catgryCd">
                    <option value="S01" <c:if test="${pvo.catgryCd eq 'S01'}" >selected</c:if>>상의</option>
                    <option value="S02" <c:if test="${pvo.catgryCd eq 'S02'}" >selected</c:if>>아우터</option>
                    <option value="S03" <c:if test="${pvo.catgryCd eq 'S03'}" >selected</c:if>>바지</option>
                    <option value="S04" <c:if test="${pvo.catgryCd eq 'S04'}" >selected</c:if>>원피스</option>
                    <option value="S05" <c:if test="${pvo.catgryCd eq 'S05'}" >selected</c:if>>신발</option>
                    <option value="S06" <c:if test="${pvo.catgryCd eq 'S06'}" >selected</c:if>>가방</option>
                </select>
            </td>
            <th><div>소분류</div></th>
            <td>
				<select name="catgryCd2" id="catgryCd2">
					<c:if test="${pvo.catgryCd eq 'S01'}">
						<option value="">선택</option>
						<option value="A01" <c:if test="${pvo.catgryCd2 eq 'A01'}" >selected</c:if>>반팔</option>
						<option value="A02" <c:if test="${pvo.catgryCd2 eq 'A02'}" >selected</c:if>>긴팔</option>
					</c:if>
					<c:if test="${pvo.catgryCd eq 'S02'}">
						<option value="">선택</option>
						<option value="B01" <c:if test="${pvo.catgryCd2 eq 'B01'}" >selected</c:if>>자켓</option>
						<option value="B02" <c:if test="${pvo.catgryCd2 eq 'B02'}" >selected</c:if>>패딩</option>
						<option value="B03" <c:if test="${pvo.catgryCd2 eq 'B03'}" >selected</c:if>>롱패딩</option>
					</c:if>
					<c:if test="${pvo.catgryCd eq 'S03'}">
						<option value="">선택</option>
						<option value="C01" <c:if test="${pvo.catgryCd2 eq 'C01'}" >selected</c:if>>청바지</option>
					</c:if>
					<c:if test="${pvo.catgryCd eq 'S04'}">
						<option value="">선택</option>
						<option value="D01" <c:if test="${pvo.catgryCd2 eq 'D01'}" >selected</c:if>>원피스</option>
					</c:if>
					<c:if test="${pvo.catgryCd eq 'S05'}">
						<option value="">선택</option>
						<option value="E01" <c:if test="${pvo.catgryCd2 eq 'E01'}" >selected</c:if>>운동화</option>
					</c:if>
					<c:if test="${pvo.catgryCd eq 'S06'}">
						<option value="">선택</option>
						<option value="F01" <c:if test="${pvo.catgryCd2 eq 'F01'}" >selected</c:if>>책가방</option>
					</c:if>
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
                    <option value="XS" <c:if test="${pvo.goodsSize eq 'XS'}" >selected</c:if>>S</option>
                    <option value="S" <c:if test="${pvo.goodsSize eq 'S'}" >selected</c:if>>S</option>
                    <option value="M" <c:if test="${pvo.goodsSize eq 'M'}" >selected</c:if>>M</option>
                    <option value="L" <c:if test="${pvo.goodsSize eq 'L'}" >selected</c:if>>L</option>
                    <option value="XL" <c:if test="${pvo.goodsSize eq 'XL'}" >selected</c:if>>XL</option>
                    <option value="XXL" <c:if test="${pvo.goodsSize eq 'XXL'}" >selected</c:if>>XXL</option>
                    <option value="XXXL" <c:if test="${pvo.goodsSize eq 'XXXL'}" >selected</c:if>>XXXL</option>
                    <option value="FREE" <c:if test="${pvo.goodsSize eq 'FREE'}" >selected</c:if>>FREE</option>
                </select>
            </td>
            <th><div>컬러</div></th>
            <td>
                <select name="goodsClr">
                    <option value="black" <c:if test="${pvo.goodsClr eq 'black'}" >selected</c:if>>블랙</option>
                    <option value="white" <c:if test="${pvo.goodsClr eq 'white'}" >selected</c:if>>화이트</option>
                    <option value="naivy" <c:if test="${pvo.goodsClr eq 'naivy'}" >selected</c:if>>네이비</option>
                    <option value="ivory" <c:if test="${pvo.goodsClr eq 'ivory'}" >selected</c:if>>아이보리</option>
                </select>
            </td>
        </tr>
        <tr>
            <th><div>사용여부</div></th>            
            <td>
            	<select name="useYn">
            		<option value="Y" <c:if test="${pvo.useYn eq 'Y'}" >selected</c:if>>사용</option>
            		<option value="N" <c:if test="${pvo.useYn eq 'N'}" >selected</c:if>>미사용</option>
            	</select>
            </td>
			<th><div>이미지</div></th>
            <td>
            	<input type="file" name="file1" onchange="previewImg(event);">
            </td>
        </tr>
        <tr>
            <th><div>상품소개</div></th>
            <td colspan="2">
            	<textarea rows="20" cols="70" name="goodsIntr">${pvo.goodsIntr}</textarea>
            </td>
            <td>
            	<div id="imgPreView">
            		<img alt="" width="300px" src="${pvo.imgPath}${pvo.imgNm}">
            	</div>
            </td>
        </tr>
    </table>
</div>
<div class="btn_area">
    <input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=adm_goods_list'"/>
    <input type="button" value="삭제" onclick="fn_goods_remove('${pvo.goodsInfoSeq}')"/>
    <input type="submit" value="수정"/>
</div>
</form>
<script>
window.onload = ()=>{
	let sel_catgryCd = document.querySelector('#catgryCd');
	let sel_catgryCd2 = document.querySelector('#catgryCd2');
	sel_catgryCd.addEventListener('change', (e)=>{
		//option 삭제
		let sel_catgryCd2_options = document.querySelectorAll('#catgryCd2 option');
		for(let i=0; i<sel_catgryCd2_options.length; i++){
			sel_catgryCd2_options[i].remove();
		}
		
		let selectedIdx = e.target.selectedIndex;
		let selectedVal = e.target.value;
		let optionList = [];
		if(selectedVal == 'S01'){ //상의
			optionList.push({'':'선택'});
			optionList.push({'A01':'반팔'});
			optionList.push({'A02':'긴팔'});
		}
		else if(selectedVal == 'S02'){ //아우터
			optionList.push({'':'선택'});
			optionList.push({'B01':'자켓'});
			optionList.push({'B02':'패딩'});
			optionList.push({'B03':'롱패딩'});
		}
		else if(selectedVal == 'S03'){ //바지
			optionList.push({'':'선택'});
			optionList.push({'C01':'청바지'});
		}
		else if(selectedVal == 'S04'){ //원피스
			optionList.push({'':'선택'});
			optionList.push({'D01':'원피스'});
		}
		else if(selectedVal == 'S05'){ //신발
			optionList.push({'':'선택'});
			optionList.push({'E01':'운동화'});
		}
		else if(selectedVal == 'S06'){ //가방
			optionList.push({'':'선택'});
			optionList.push({'F01':'책가방'});
		}
		
		for(let obj in optionList){
			let objValue = optionList[obj];
			for(val in objValue) {
				let option = document.createElement('option');
				let key = val;
				let value = objValue[key];
				option.value = key;
				option.innerHTML = value;
				sel_catgryCd2.append(option);
			}
			//option.value = 
		}
	});
};

//상품수정
function fn_goods_edit(){
	if(confirm('상품을 정말 수정 하시겠습니까?')){
		return true;
	}else{
		return false;
	}
}

//상품삭제
function fn_goods_remove(goodsInfoSeq){
	if(confirm('상품을 정말 삭제 하시겠습니까?')){
		location.href='/DispatcherServlet?command=adm_goods_remove_act&goodsInfoSeq=' + goodsInfoSeq;
	}
}

//첨부파일 이미지 미리보기
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
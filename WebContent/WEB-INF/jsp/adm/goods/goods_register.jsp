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
    				<option value="1">온라인몰</option>
    			</select>
    		</td>
    		<th><div>판매상태</div></th>
    		<td>
    			<select name="saleStatCd">
    				<option value="01">판매중</option>
    				<option value="02">판매중지</option>
    				<option value="03">품절</option>
    				<option value="04">재고부족</option>
    			</select>
    		</td>
    	</tr>
        <tr>
    		<th><div>상품명</div></th>
            <td><input type="text" name="goodsNm"></td>
            <th><div>상품가격</div></th>
            <td><input type="number" name="goodsPrc"></td>
        </tr>
        <tr>
			<th><div>대분류</div></th>
            <td>
                <select name="catgryCd" id="catgryCd">
                    <option value="">선택</option>
                    <option value="S01">상의</option>
                    <option value="S02">아우터</option>
                    <option value="S03">바지</option>
                    <option value="S04">원피스</option>
                    <option value="S05">신발</option>
                    <option value="S06">가방</option>
                </select>
            </td>
            <th><div>소분류</div></th>
            <td>
				<select name="catgryCd2" id="catgryCd2">
					<option value="">선택</option>
				</select>
            </td>            
        </tr>
        <tr>
            <th><div>상품수량</div></th>
            <td><input type="number" name="inyQty" value="1"></td>
            <th><div>배송비</div></th>
            <td><input type="number" name="dlvPrc" value="2000"></td>
        </tr>
        <tr>
        	<th><div>사이즈</div></th>
            <td>
                <select name="goodsSize">
                    <option value="XS">S</option>
                    <option value="S">S</option>
                    <option value="M">M</option>
                    <option value="L">L</option>
                    <option value="XL">XL</option>
                    <option value="XXL">XXL</option>
                    <option value="XXXL">XXXL</option>
                    <option value="FREE">FREE</option>
                </select>
            </td>
            <th><div>컬러</div></th>
            <td>
                <select name="goodsClr">
                    <option value="black">블랙</option>
                    <option value="white">화이트</option>
                    <option value="naivy">네이비</option>
                    <option value="ivory">아이보리</option>
                </select>
            </td>
        </tr>
        <tr>
            <th><div>사용여부</div></th>            
            <td>
            	<select name="useYn">
            		<option value="Y">사용</option>
            		<option value="N">미사용</option>
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
            	<textarea rows="20" cols="70" name="goodsIntr"></textarea>
            </td>
            <td>
            	<div id="imgPreView"></div>
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
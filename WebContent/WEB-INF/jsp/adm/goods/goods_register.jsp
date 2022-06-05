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
					<c:forEach items="${entrList}" var="obj">
						<option value="${obj.entrNo}">${obj.entrNm}(${obj.entrNo})</option>
					</c:forEach>
				</select>
    		</td>
    		<th><div>판매상태</div></th>
    		<td>
    			<select name="saleStatCd">
    				<c:forEach items="${codeList}" var="obj">
						<option value="${obj.codeNm}">${obj.codeNm}</option>
					</c:forEach>
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
                    <c:forEach items="${upperCodeList}" var="obj">
                    	<option value="${obj.catgryCd}">${obj.catgryNm}</option>
                    </c:forEach>
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
(function(){
	document.getElementById("catgryCd").addEventListener('change', makeRequest);
	function makeRequest() {
		httpRequest = new XMLHttpRequest();
		if(!httpRequest) {
			alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		let catgryCd = document.querySelector('#catgryCd').value;
		httpRequest.onreadystatechange = alertContents;
		httpRequest.open('POST', "DispatcherServlet?command=adm_cate_list_ajax");
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		/* httpRequest.setRequestHeader('Content-Type', 'application/json'); */
		httpRequest.send('catgryCd='+encodeURIComponent(catgryCd));
	}
	
	function alertContents() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {
			if (httpRequest.status === 200) {
				var res = httpRequest.responseText;
				console.log('res:' + res);
				var rtnJson = JSON.parse(res);
				if(rtnJson.result == 'success'){
					let sel_catgryCd2 = document.querySelector('#catgryCd2');
					let sel_catgryCd2_options = document.querySelectorAll('#catgryCd2 option');
					for(let i=0; i<sel_catgryCd2_options.length; i++){
						sel_catgryCd2_options[i].remove();
					}
					//추가
					for(let i=0; i<rtnJson.dataList.length; i++){
						let objValue = rtnJson.dataList[i];
						let option = document.createElement('option');
						let catgryCd = objValue['catgryCd'];
						let catgryNm = objValue['catgryNm'];
						option.value = catgryCd;
						option.innerHTML = catgryNm;
						sel_catgryCd2.append(option);
					}
				}else{
					alert("에러 발생.");
				}
			} else {
				alert('request에 뭔가 문제가 있어요.');
			}
		}
	}
})();

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
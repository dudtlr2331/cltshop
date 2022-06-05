<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>
<style>
a{
	color: black !important;
	text-decoration: none !important;
}
</style>

<section class="title_area">
	<h3 class="title">드레스룸 등록</h3>
</section>

<form action="/DispatcherServlet?command=dress_register_act" method="post" enctype="multipart/form-data">
<section id="dressroom_create">
    <div>판매 게시판 시퀀스</div>
	<input type="number" name="saleBoardSeq"><br/>
	
	<div>상위 카테고리</div>
	<select name="oneDepthCateList" id="oneDepthCateList">
		<option value="">선택</option>
		<c:forEach items="${oneDepthCateList }" var="obj">
			<option value="${obj.catgryCd}">${obj.catgryNm}</option>
	    </c:forEach>
    </select>
	
	<div>하위 카테고리</div>
	<select name="twoDepthCateList" id="twoDepthCateList"> 
   	</select>
	
	<div>상품</div>
	<select name="goodsCd" id="searchGoodsList"> <!-- 상품 코드 -->
   	</select>
	
	<div>상품 이미지</div>
	<img id="goodsImg" src="">

	<!-- <div>상품코드</div>
	<input type="number" name="goodsCd"><br/> -->
	
	<div>거래처 번호</div>
	<input type="number" name="entrNo"><br/>
	
    <div class="dressroom_create_detail">
        <h3>제목 <input type="text" name="bulTitNm" id=""></h3>
        <h3>내용</h3>
        <span>파일 첨부</span><button>쇼핑몰 내 검색</button><button>사진</button><button>동영상</button>
    </div>

	<div>이미지</div>
       	<input type="file" name="file1" onchange="previewImg(event);">
       	<input type="hidden" name="imgPath" id="imgPath" />
    	<input type="hidden" name="imgNm" id="imgNm" />
	<div id="imgPreView"></div>
	
	<div class ='content'>
		<jsp:include page="note.jsp"/>
	</div>

    <div>사용 여부</div>
	<select name="useYn">
      	<option value="Y">사용</option>
    	<option value="N">미사용</option>
    </select>
    
    <div class="dressroom_create_detail">
        <h3>태그 : 남성, 겨울</h3>
    </div>
    
    <div class="dressRoom_create_down">
        <input type="submit" value="등록" />
    </div>
</section>
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
		document.querySelector("#imgPreView").appendChild(img);
	};
	reader.readAsDataURL(event.target.files[0]);
}

(function(){
	document.getElementById("oneDepthCateList").addEventListener('change', makeRequest);
	function makeRequest() {
		httpRequest = new XMLHttpRequest();
		if(!httpRequest) {
			alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		let oneDepthCateList = document.querySelector('#oneDepthCateList').value;
		httpRequest.onreadystatechange = alertContents;
		httpRequest.open('POST', "DispatcherServlet?command=dress_cate_ajax");
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		httpRequest.send('oneDepthCateList='+encodeURIComponent(oneDepthCateList));
	}
	
	function alertContents() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {
			if (httpRequest.status === 200) {
				var res = httpRequest.responseText;
				console.log('res:' + res);
				var rtnJson = JSON.parse(res);
				if(rtnJson.result == 'success'){
					let sel_twoDepthCateList = document.querySelector('#twoDepthCateList');
					let sel_twoDepthCateList_options = document.querySelectorAll('#twoDepthCateList option');
					for(let i=0; i<sel_twoDepthCateList_options.length; i++){
						sel_twoDepthCateList_options[i].remove();
					}
					//추가
					for(let i=0; i<rtnJson.dataList.length; i++){
						let objValue = rtnJson.dataList[i];
						let option = document.createElement('option');
						let catgryCd = objValue['catgryCd'];
						let catgryNm = objValue['catgryNm'];
						option.value = catgryCd;
						option.innerHTML = catgryNm;
						sel_twoDepthCateList.append(option);
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

(function(){
	document.getElementById("twoDepthCateList").addEventListener('change', makeRequest);
	function makeRequest() {
		httpRequest = new XMLHttpRequest();
		if(!httpRequest) {
			alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		let oneDepthCateList = document.querySelector('#oneDepthCateList').value;
		let twoDepthCateList = document.querySelector('#twoDepthCateList').value;
		httpRequest.onreadystatechange = alertContents;
		httpRequest.open('POST', "DispatcherServlet?command=dress_cate_ajax2");
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		httpRequest.send('oneDepthCateList='+encodeURIComponent(oneDepthCateList)+'&twoDepthCateList='+encodeURIComponent(twoDepthCateList));
	}
	
	function alertContents() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {
			if (httpRequest.status === 200) {
				var res = httpRequest.responseText;
				console.log('res:' + res);
				var rtnJson = JSON.parse(res);
				if(rtnJson.result == 'success'){
					let sel_searchGoodsList = document.querySelector('#searchGoodsList');
					let sel_searchGoodsList_options = document.querySelectorAll('#searchGoodsList option');
					for(let i=0; i<sel_searchGoodsList_options.length; i++){
						sel_searchGoodsList_options[i].remove();
					}
					//추가
					for(let i=0; i<rtnJson.dataList.length; i++){
						let objValue = rtnJson.dataList[i];
						let option = document.createElement('option');
						let goodsCd = objValue['goodsCd'];
						let goodsNm = objValue['goodsNm'];
						option.value = goodsCd;
						option.innerHTML = goodsNm;
						sel_searchGoodsList.append(option);
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

(function(){
	document.getElementById("searchGoodsList").addEventListener('change', makeRequest);
	function makeRequest() {
		httpRequest = new XMLHttpRequest();
		if(!httpRequest) {
			alert('XMLHTTP 인스턴스를 만들 수가 없어요 ㅠㅠ');
			return false;
		}
		let searchGoodsList = document.querySelector('#searchGoodsList').value;
		httpRequest.onreadystatechange = alertContents;
		httpRequest.open('POST', "DispatcherServlet?command=dress_cate_ajax3");
		httpRequest.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
		httpRequest.send('searchGoodsList='+encodeURIComponent(searchGoodsList));
	}
	
	function alertContents() {
		if (httpRequest.readyState === XMLHttpRequest.DONE) {
			if (httpRequest.status === 200) {
				var res = httpRequest.responseText;
				console.log('res:' + res);
				var rtnJson = JSON.parse(res);
				if(rtnJson.result == 'success'){
					//추가
					let objValue = rtnJson.dataList[0];
					let imgPath = objValue['imgPath'];
					let imgNm = objValue['imgNm'];
					document.getElementById("goodsImg").src = imgPath + imgNm;
				}else{
					alert("에러 발생.");
				}
			} else {
				alert('request에 뭔가 문제가 있어요.');
			}
		}
	}
})();
</script>
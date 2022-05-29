<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>
<h2>이벤트 배너 목록 > 이벤트 배너 수정</h2>
<form action="/DispatcherServlet?command=adm_event_edit_act" method="post" enctype="multipart/form-data" onsubmit="return fn_event_edit()">
<input type="hidden" name="eventInfoSeq" value="${pvo.eventInfoSeq }" />
<div class="data_list">
    <table>
    	<colgroup>
    		<col width="20%" />
    		<col width="30%" />
    		<col width="20%" />
    		<col width="30%" />
    	</colgroup>
    	<tr>
    		<th><div>이벤트 이름</div></th>
            <td><input type="text" name="eventName" value="${pvo.eventName }"></td>
            <th><div>이벤트 만료 날짜</div></th>
            <td><input type="Date" name="eventEndDate" value="${pvo.eventEndDate }"></td>
            <th><div>이미지</div></th>
            <td>
            	<input type="file" name="file1" onchange="previewImg(event);">
            </td>
        </tr>
        <tr>
    		<th><div>이미지 미리보기</div></th>
            <td colspan="5">
            	<div id="imgPreView">
            		<img alt="" src="${pvo.imgPath}${pvo.imgNm}">
            		<input type="hidden" name="imgPath" value="${pvo.imgPath}" />
            		<input type="hidden" name="imgNm" value="${pvo.imgNm}" />
            	</div>
            </td>
        </tr>
    </table>
</div>
<div class="btn_area">
    <input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=adm_event_list'"/>
    <input type="button" value="삭제" onclick="fn_event_remove('${pvo.eventInfoSeq}')"/>
    <input type="submit" value="수정"/>
</div>
</form>
<script>
//상품수정
function fn_event_edit(){
	if(confirm('이벤트 배너를 정말 수정 하시겠습니까?')){
		return true;
	}else{
		return false;
	}
}

//상품삭제
function fn_event_remove(eventInfoSeq){
	if(confirm('이벤트 배너를 정말 삭제 하시겠습니까?')){
		location.href='/DispatcherServlet?command=adm_event_remove_act&eventInfoSeq=' + eventInfoSeq;
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
		document.querySelector("#imgPreView").appendChild(img);
	};
	reader.readAsDataURL(event.target.files[0]);
}
</script>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
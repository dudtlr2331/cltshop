<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

<form name="frm" action="/DispatcherServlet?command=qna_edit_act" method="post" onsubmit="return fn_qna_edit()">
	<input type="hidden" name="qnaBoardSeq" value="${pvo.qnaBoardSeq }" />
	<%-- <input type="hidden" name="updtId" value="${pvo.updtId }" />
	<input type="hidden" name="updtDate" value="${pvo.updtDate }" /> --%>
	
	<div>제목</div>
	<input type="text" name="titNm" value="${pvo.titNm}"><br/>
	
	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="100" name="cont">${pvo.cont}</textarea><br/>
	
	<div>카테고리</div>
	<select name="qnaTp">
    	<option value="상품문의" <c:if test="${pvo.qnaTp eq '상품문의'}" >selected</c:if>>상품문의</option>
      	<option value="일반문의" <c:if test="${pvo.qnaTp eq '일반문의'}" >selected</c:if>>일반문의</option>
    </select>
	
	<div>답변 상태</div>
	<select name="ansrStat">
    	<option value="답변미완료" <c:if test="${pvo.ansrStat eq '답변미완료'}" >selected</c:if>>답변미완료</option>
      	<option value="답변완료" <c:if test="${pvo.ansrStat eq '답변완료'}" >selected</c:if>>답변완료</option>
    </select>
    
	<div>사용 여부</div>
	<select name="useYn">
      	<option value="Y" <c:if test="${pvo.useYn eq 'Y'}" >selected</c:if>>사용</option>
    	<option value="N" <c:if test="${pvo.useYn eq 'N'}" >selected</c:if>>미사용</option>
    </select>
    
	<div>비밀글</div>
	<select name="passYn" id="passYn">>
      	<option value="Y" <c:if test="${pvo.passYn eq 'Y'}" >selected</c:if>>사용</option>
    	<option value="N" <c:if test="${pvo.passYn eq 'N'}" >selected</c:if>>미사용</option>
    </select>
    
	<div id="passWd">
		<pre>비밀글 비밀번호</pre>
		<input type="password" name="passWd" value="${pvo.passWd}">
	</div>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=qna'"/>
    <input type="button" value="삭제" onclick="fn_qna_remove('${pvo.qnaBoardSeq}')"/>
    <input type="submit" value="수정"/>
</form>
<script>
//상품수정
function fn_qna_edit(){
	if(confirm('상품을 정말 수정 하시겠습니까?')){
		return true;
	}else{
		return false;
	}
}

//상품삭제
function fn_qna_remove(qnaBoardSeq){
	if(confirm('상품을 정말 삭제 하시겠습니까?')){
		location.href='/DispatcherServlet?command=qna_remove_act&qnaBoardSeq=' + qnaBoardSeq;
	}
}

document.addEventListener("DOMContentLoaded", () => {
	let sel_passYn = document.querySelector('#passYn');
	var target = document.getElementById("passYn");
   	
	console.log(target.options[target.selectedIndex].value);
	if(target.options[target.selectedIndex].value == 'N'){
		document.getElementById("passWd").style.display = "none";
	}else if(target.options[target.selectedIndex].value == 'Y'){
		document.getElementById("passWd").style.display = "block";
	}
	
	
	sel_passYn.addEventListener('change', (e)=>{
		let selectedVal = e.target.value;
		
		if(selectedVal == 'N'){
			document.getElementById("passWd").style.display = "none";
		}else{
			document.getElementById("passWd").style.display = "block";
		}
		
	});
});
</script>
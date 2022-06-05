<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>

<form name="frm" action="DispatcherServlet?command=adm_code_edit_act" method="post" onsubmit="return fn_code_edit()">
	<input type="text" name="stdCdBaseSeq" value="${pvo.stdCdBaseSeq }" />
	
	<div>코드 이름</div>
	<input type="text" name="codeNm"  value="${pvo.codeNm}"><br/>

	<div>코드 값</div>
	<input type="text" name="codeVal"  value="${pvo.codeVal}"><br/>
	
	<label for="codeDesc">설명</label><br/>
    <textarea rows="20" cols="50" name="codeDesc">${pvo.codeDesc}</textarea><br/>
	
	<div>코드 그룹</div>
	<input type="text" name="grpCd" value="${pvo.grpCd}"><br/>
	
	<div>코드 순번</div>
	<input type="number" name="grpOrdr" value="${pvo.grpOrdr}"><br/>
	
	<div>사용 여부</div>
	<select name="useYn">
      	<option value="Y" <c:if test="${pvo.useYn eq 'Y'}" >selected</c:if>>사용</option>
    	<option value="N" <c:if test="${pvo.useYn eq 'N'}" >selected</c:if>>미사용</option>
    </select>
	
	<input type="button" value="목록" onclick="location.href='/DispatcherServlet?command=adm_code_list'"/>
    <input type="button" value="삭제" onclick="fn_code_remove('${pvo.stdCdBaseSeq}')"/>
	<input type="submit" value="수정" />
</form>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
<script>
//상품수정
function fn_code_edit(){
	if(confirm('상품을 정말 수정 하시겠습니까?')){
		return true;
	}else{
		return false;
	}
}

//상품삭제
function fn_code_remove(stdCdBaseSeq){
	if(confirm('상품을 정말 삭제 하시겠습니까?')){
		location.href='/DispatcherServlet?command=adm_code_remove_act&stdCdBaseSeq=' + stdCdBaseSeq;
	}
}
</script>
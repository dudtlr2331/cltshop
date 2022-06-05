<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/admHeader.jsp" %>

<form name="frm" action="DispatcherServlet?command=adm_code_register_act" method="post">
	<div>코드 이름</div>
	<input type="text" name="codeNm"><br/>

	<div>코드 값</div>
	<input type="text" name="codeVal"><br/>
	
	<label for="codeDesc">설명</label><br/>
    <textarea rows="20" cols="50" name="codeDesc"></textarea><br/>
	
	<div>코드 그룹</div>
	<input type="text" name="grpCd"><br/>
	
	<div>코드 순번</div>
	<input type="number" name="grpOrdr"><br/>
	
	<div>사용 여부</div>
	<select name="useYn">
      	<option value="Y">사용</option>
    	<option value="N">미사용</option>
    </select>
	
	<input type="submit" value="등록하기" />
</form>
<%@ include file="/WEB-INF/jsp/cmm/admFooter.jsp" %>
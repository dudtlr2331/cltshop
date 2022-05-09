<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/nomalMenu.jsp" %>

<form name="frm" action="DispatcherServlet?command=qna_insert_act" method="post">
	
	<div>제목</div>
	<input type="text" name="titNm"><br/>
	
	<label for="cont">내용</label><br/>
    <textarea rows="20" cols="100" name="cont"></textarea><br/>
	
	<div>카테고리</div>
	<select name="qnaTp">
    	<option value="상품문의">상품문의</option>
      	<option value="일반문의">일반문의</option>
    </select>
	
	<div>답변 상태</div>
	<select name="ansrStat">
    	<option value="답변미완료">답변미완료</option>
      	<option value="답변완료">답변완료</option>
    </select>
    
	<div>사용 여부</div>
	<select name="useYn">
      	<option value="Y">사용</option>
    	<option value="N">미사용</option>
    </select>
    
	<div>비밀글</div>
	<select name="passYn" id="passYn">
      	<option value="Y">사용</option>
    	<option value="N" selected="selected">미사용</option>
    </select>
    
	<div id="passWd">
		<pre>비밀글 비밀번호</pre>
		<input type="password" name="passWd">
	</div>
	<input type="submit" value="작성하기" />
</form>
<script>
document.addEventListener("DOMContentLoaded", () => {
	let sel_passYn = document.querySelector('#passYn');
	sel_passYn.addEventListener('change', (e)=>{
		let selectedVal = e.target.value;
		
		if(selectedVal == 'N'){
			document.getElementById("passWd").style.display = "none";
		}else{
		document.getElementById("passWd").style.display = "block";
		}
		
	});
	document.getElementById("passWd").style.display = "none";
});
</script>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/css/admin.css" rel="stylesheet">
<!-- adm header start -->
<c:if test="${not empty sessionScope.message}">
	<script type="text/javascript">alert("${sessionScope.message}");</script>
	<c:remove var="message" scope="session"/>
</c:if>
<header id="header">
    <div class="logo"><img src="/images/logo_01.png" / width="80" height="40"></div>
</header>
<section class="admin_body">
	<%@ include file="/WEB-INF/jsp/cmm/admLeftMenu.jsp" %>
	<div class="adm_content">
<!-- adm header end -->
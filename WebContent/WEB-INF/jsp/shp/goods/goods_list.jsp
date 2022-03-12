<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/css/common.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <title>홈</title>
    <script src="https://kit.fontawesome.com/db1622cae4.js" crossorigin="anonymous"></script>
    <script src="/js/common.js" defer></script>
</head>
<body>
   <header id="header">
      <div class="logo">쇼핑몰로고...</div>
      <div class="top_btn">
         <input type="text"/>
         <a href="/html/user/cart/cart_view.html"><i class="fa-solid fa-cart-shopping"></i></a>
         <a href="DispatcherServlet?command=user_login"><i class="fa-solid fa-user-large"></i></a>
      </div>
   </header>

   <section id="main_benner">
      <ul class="menu">
         <a href="/html/user/main/main.html"><li>홈</li></a>
         <a href="/html/user/category/category.html"><li>카테고리</li></a>
         <a href="/html/user/one_qna/one_qna.html"><li>1:1문의</li></a>
         <a href="/html/user/dressroom/dressRoom_main.html"><li>커뮤니티</li></a>
      </ul>
      <div class="img_area">
         <a href="">◀</a>
         <div class="images">
            <img src="/images/이벤트배너-발렌타인.jpg">
            <div class="icons">
               <a href=""><i class="fa-solid fa-play"></i></a>
               <a href=""><i class="fa-solid fa-stop"></i></a>
               <span>1/10</span>
            </div>
         </div>
         <a href="">▶</a>
      </div>
   </section>

   <footer id="product_ranking">
      <h2>Today 랭킹</h2>
      <div class="product_group">
         <pre>전체</pre>
         <pre>상의</pre>
         <pre>아우터</pre>
         <pre>바지</pre>
      </div>
      <div class="img_area">
         <div class="img_a">
            <c:choose>
               <c:when test="${not empty goodsList }">
                  <c:forEach var="obj" items="${goodsList}" begin="0" end="3">
                     <div class="item" onclick="pageMove('product')">
                        <img src="${obj.goodsImg}">
                        <div class="txt_area">
                           <div class="item_name">${obj.goodsNm}</div>
                           <div class="item_price">
                              <span class="color_red">50%</span>
                              <span>${obj.goodsPrc}원</span>
                           </div>
                        </div>
                        <div class="dim"></div>
                     </div>
                  </c:forEach>
               </c:when>
               <c:otherwise>
                  데이터가 없습니다.
               </c:otherwise>
            </c:choose>
         </div>
         
         <div class="img_area">
         <div class="img_a">
            <c:choose>
               <c:when test="${not empty goodsList }">
                  <c:forEach var="obj" items="${goodsList}" begin="4" end="7">
                     <div class="item" onclick="pageMove('product')">
                        <img src="${obj.goodsImg}">
                        <div class="txt_area">
                           <div class="item_name">${obj.goodsNm}</div>
                           <div class="item_price">
                              <span class="color_red">50%</span>
                              <span>${obj.goodsPrc}원</span>
                           </div>
                        </div>
                        <div class="dim"></div>
                     </div>
                  </c:forEach>
               </c:when>
               <c:otherwise>
                  데이터가 없습니다.
               </c:otherwise>
            </c:choose>
         </div>
         
         <div class="img_area">
         <div class="img_a">
            <c:choose>
               <c:when test="${not empty goodsList }">
                  <c:forEach var="obj" items="${goodsList}" begin="8" end="11">
                     <div class="item" onclick="pageMove('product')">
                        <img src="${obj.goodsImg}">
                        <div class="txt_area">
                           <div class="item_name">${obj.goodsNm}</div>
                           <div class="item_price">
                              <span class="color_red">50%</span>
                              <span>${obj.goodsPrc}원</span>
                           </div>
                        </div>
                        <div class="dim"></div>
                     </div>
                  </c:forEach>
               </c:when>
               <c:otherwise>
                  데이터가 없습니다.
               </c:otherwise>
            </c:choose>
         </div>
         
         <div class="img_area">
         <div class="img_a">
            <c:choose>
               <c:when test="${not empty goodsList }">
                  <c:forEach var="obj" items="${goodsList}" begin="12" end="15">
                     <div class="item" onclick="pageMove('product')">
                        <img src="${obj.goodsImg}">
                        <div class="txt_area">
                           <div class="item_name">${obj.goodsNm}</div>
                           <div class="item_price">
                              <span class="color_red">50%</span>
                              <span>${obj.goodsPrc}원</span>
                           </div>
                        </div>
                        <div class="dim"></div>
                     </div>
                  </c:forEach>
               </c:when>
               <c:otherwise>
                  데이터가 없습니다.
               </c:otherwise>
            </c:choose>
         </div>

      </div>
   </footer>
</body>
</html>
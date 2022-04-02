<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/cmm/bannerMenu.jsp" %>
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
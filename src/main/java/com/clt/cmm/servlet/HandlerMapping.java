package com.clt.cmm.servlet;

import com.clt.adm.cate.AdmCateController;
import com.clt.adm.code.AdmCodeController;
import com.clt.adm.cpn.AdmCpnController;
import com.clt.adm.dress.AdmDressController;
import com.clt.adm.entr.AdmEntrController;
import com.clt.adm.event.AdmEventController;
import com.clt.adm.goods.AdmGoodsController;
import com.clt.adm.order.AdmOrderController;
import com.clt.adm.point.AdmPointController;
import com.clt.adm.qna.AdmQnaController;
import com.clt.adm.sales.AdmSalesController;
import com.clt.adm.stats.AdmStatsController;
import com.clt.adm.user.AdmUserController;
import com.clt.cmm.controller.Controller;
import com.clt.shp.dress.DressController;
import com.clt.shp.goods.GoodsController;
import com.clt.shp.main.MainController;
import com.clt.shp.mypage.MypgController;
import com.clt.shp.order.OrderController;
import com.clt.shp.qna.QnaController;
import com.clt.shp.user.UserController;

public class HandlerMapping {
   private static HandlerMapping handler = new HandlerMapping();

   /******************************** adm ********************************/
   public static final String ADM_ENTR_LIST = "adm_entr_list";/*업체목록*/
   public static final String ADM_ENTR_REGISTER = "adm_entr_register";/*업체등록 페이지*/
   public static final String ADM_ENTR_REGISTER_ACT = "adm_entr_register_act";/*업체등록*/
   public static final String ADM_ENTR_EDIT = "adm_entr_edit";/*업체수정 페이지*/
   public static final String ADM_ENTR_EDIT_ACT = "adm_entr_edit_act";/*업체수정*/
   public static final String ADM_ENTR_REMOVE_ACT = "adm_entr_remove_act";/*업체삭제*/
   public static final String ADM_CODE_LIST = "adm_code_list";/*코드목록*/
   public static final String ADM_CODE_LIST_AJAX = "adm_code_list_ajax";/*코드목록*/
   public static final String ADM_CODE_REGISTER = "adm_code_register";/*코드등록 페이지*/
   public static final String ADM_CODE_REGISTER_ACT = "adm_code_register_act";/*코드등록*/
   public static final String ADM_CODE_EDIT = "adm_code_edit";/*코드수정 페이지*/
   public static final String ADM_CODE_EDIT_ACT = "adm_code_edit_act";/*코드수정*/
   public static final String ADM_CODE_REMOVE_ACT = "adm_code_remove_act";/*코드삭제*/
   public static final String ADM_CATE_LIST = "adm_cate_list";/*카테고리목록*/
   public static final String ADM_CATE_LIST_AJAX = "adm_cate_list_ajax";/*카테고리목록*/
   public static final String ADM_CATE_REGISTER_ACT = "adm_cate_register_act";/*카테고리 등록*/
   public static final String ADM_CATE_REMOVE_ACT = "adm_cate_remove_act";/*카테고리 삭제*/
   public static final String ADM_GOODS_LIST = "adm_goods_list";/*상품목록*/
   public static final String ADM_GOODS_LIST_AJAX = "adm_goods_list_ajax";/*상품목록*/
   public static final String ADM_GOODS_REGISTER = "adm_goods_register";/*상품등록*/
   public static final String ADM_GOODS_REGISTER_ACT = "adm_goods_register_act";/*상품등록*/
   public static final String ADM_GOODS_EDIT = "adm_goods_edit";/*상품수정*/
   public static final String ADM_GOODS_EDIT_ACT = "adm_goods_edit_act";/*상품수정*/
   public static final String ADM_GOODS_REMOVE_ACT = "adm_goods_remove_act";/*상품삭제*/
   public static final String ADM_GOODS_QNA = "adm_goods_qna";/*상품 문의 관리*/
   public static final String ADM_SALES_LIST = "adm_sales_list";/*상품 판매 게시글 관리*/
   public static final String ADM_SALES_REGISTER = "adm_sales_register";/*상품 판게 게시글 등록*/
   public static final String ADM_SALES_REGISTER_ACT = "adm_sales_register_act";/*상품 판게 게시글 등록 액션*/
   public static final String ADM_SALES_UPDATE = "adm_sales_update";/*상품 판매 게시글 수정*/
   public static final String ADM_SALES_UPDATE_ACT = "adm_sales_update_act";/*상품 판게 게시글 수정 액션*/
   public static final String ADM_SALES_REMOVE_ACT = "adm_sales_remove_act";/*상품 판게 게시글 삭제 액션*/
   public static final String ADM_ORDER_LIST = "adm_order_list";/*주문 관리*/
   public static final String ADM_ORDER_DETAIL = "adm_order_detail";/*주문 관리 - 주문 상세*/
   public static final String ADM_USER_LIST = "adm_user_list";/*회원 관리*/
   public static final String ADM_USER_DETAIL = "adm_user_detail";/*회원 관리 - 회원 상세*/
   public static final String ADM_USER_SEARCH = "adm_user_search";/*회원 관리 - 회원 검색*/
   public static final String ADM_STATS_SALES = "adm_stats_sales";/*매출현황*/
   public static final String ADM_DRESSROOM_MANAGER = "adm_dressroom_manager";/*드레스룸 관리*/
   public static final String ADM_DRESSROOM_MANAGER_EDIT = "adm_dressroom_manager_edit";/*드레스룸 수정*/
   public static final String ADM_DRESSROOM_MANAGER_EDIT_ACT = "adm_dressroom_manager_edit_act";/*드레스룸 수정*/
   public static final String ADM_DRESSROOM_MANAGER_REMOVE_ACT = "adm_dressroom_manager_remove_act";/*드레스룸 삭제*/
   public static final String ADM_QNA_LIST = "adm_qna_list";/*1:1 문의 관리*/
   public static final String ADM_QNA_ANSWER = "adm_qna_answer";/*1:1 문의 관리 - 문의 답변*/
   public static final String ADM_QNA_ANSWER_ACT = "adm_qna_answer_act";/*1:1 문의 관리 - 문의 답변 등록 액션*/
   public static final String ADM_CPN_LIST = "adm_cpn_list";/*쿠폰/적립금 관리*/
   public static final String ADM_CPN_REGISTER = "adm_cpn_register";/*쿠폰/적립금 관리*/
   public static final String ADM_CPN_REGISTER_ACT = "adm_cpn_register_act";/*쿠폰/적립금 관리*/
   public static final String ADM_CPN_EDIT = "adm_cpn_edit";/*쿠폰/적립금 관리*/
   public static final String ADM_CPN_EDIT_ACT = "adm_cpn_edit_act";/*쿠폰/적립금 관리*/
   public static final String ADM_CPN_REMOVE_ACT = "adm_cpn_remove_act";/*쿠폰/적립금 관리*/
   public static final String ADM_POINT_LIST = "adm_point_list";/*쿠폰/적립금 관리*/
//   public static final String ADM_EVENT_BANNER = "adm_event_banner";/*이벤트 관리*/
   public static final String ADM_EVENT_LIST = "adm_event_list";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_REGISTER = "adm_event_register";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_REGISTER_ACT = "adm_event_register_act";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_EDIT = "adm_event_edit";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_EDIT_ACT = "adm_event_edit_act";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_REMOVE_ACT = "adm_event_remove_act";/*이벤트 배너 관리*/
   public static final String ADM_EVENT_LIST_AJAX = "adm_event_list_ajax";/*이벤트 배너 관리 메인 화면에 출력*/
   
   /******************************** shp ********************************/
   //유저
   public static final String USER_LOGIN = "user_login";
   public static final String USER_LOGIN_INSERT = "user_login_insert";
   public static final String USER_JOIN = "user_join";
   public static final String USER_JOIN_INSERT = "user_join_insert";
   public static final String USER_ID_CHECK = "user_id_check";
   public static final String USER_EDIT = "user_edit"; /*회원수정*/
   public static final String USER_EDIT_ACT = "user_edit_act";/*회원수정*/
   public static final String USER_LOGOUT = "user_logout";/*로그아웃*/
   
   //드레스룸
   public static final String DRESS_MAIN = "dress_main";
   public static final String DRESS_CATE_AJAX = "dress_cate_ajax";
   public static final String DRESS_CATE_AJAX2 = "dress_cate_ajax2";
   public static final String DRESS_CATE_AJAX3 = "dress_cate_ajax3";
   public static final String DRESS_REGISTER = "dress_register";
   public static final String DRESS_REGISTER_ACT = "dress_register_act";
   public static final String DRESS_DETAIL = "dress_detail";
   public static final String DRESS_EDIT = "dress_edit";
   public static final String DRESS_EDIT_ACT = "dress_edit_act";
   public static final String DRESS_REMOVE_ACT = "dress_remove_act";
   
   //마이페이지
   public static final String MYPAGE = "mypage";
   public static final String MYPAGE_COUPON = "mypage_coupon";
   public static final String MYPAGE_DETAIL = "mypage_detail";
   public static final String MYPAGE_POINT = "mypage_point";
   public static final String MYPAGE_QNA = "mypage_qna";
   
   //Q&A
   public static final String QNA_DETAIL = "qna_detail"; /*Q&A상세보기*/
   public static final String QNA_INSERT = "qna_insert"; /*Q&A작성*/
   public static final String GOODS_DTL_QNA_INSERT = "goods_dtl_qna_insert"; /*Q&A작성*/
   public static final String QNA_INSERT_ACT = "qna_insert_act"; /*Q&A작성*/
   public static final String QNA_EDIT = "qna_edit"; /*Q&A수정*/
   public static final String QNA_EDIT_ACT = "qna_edit_act"; /*Q&A수정*/
   public static final String QNA_REMOVE_ACT = "qna_remove_act"; /*Q&A삭제*/
   
   //상품
   public static final String GOODS_LIST = "goods_list";
   public static final String GOODS_CATEGORY = "goods_category";
   public static final String GOODS_CART_ADD_AJAX = "goods_cart_add_ajax";
   public static final String GOODS_DETAIL = "goods_detail";
   
   //메인
   public static final String MAIN_HOME_LIST = "main_home_list";
   public static final String MAIN_CATA_LIST = "main_cata_list";
   public static final String MAIN_QNA_LIST = "main_qna_list";
   public static final String MAIN_DRSS_LIST = "main_drss_list";
   
   //주문
   public static final String ORDER = "order";
   public static final String ORDER_LIST = "order_list";
   public static final String ORDER_CART_INSERT_AJAX = "order_cart_insert_ajax";
   public static final String ORDER_CART_DELETE_AJAX = "order_cart_delete_ajax";
   public static final String ORDER_CART_LIST = "order_cart_list";
   public static final String ORDER_CART_LIST_AJAX = "order_cart_list_ajax";
   public static final String ORDER_CART_REGISTER = "order_cart_register";
   public static final String ORDER_CART_REGISTER_ACT = "order_cart_register_act";
   public static final String ORDER_REGISTER = "order_register";

   private HandlerMapping() {
   }

   public static HandlerMapping getInstance() {
      return handler;
   }

   public Controller createController(String command) {
      Controller controller = null;
      
      /******************************** shp ********************************/
      //main
	  if(command.equals(HandlerMapping.MAIN_HOME_LIST)
		  || command.equals(HandlerMapping.MAIN_CATA_LIST)
          || command.equals(HandlerMapping.MAIN_QNA_LIST)
          || command.equals(HandlerMapping.MAIN_DRSS_LIST)) {
		  controller = new MainController(command); 
	  }
      //goods
      else if (command.equals(HandlerMapping.GOODS_LIST) 
    		  || command.equals(HandlerMapping.GOODS_CATEGORY) 
              || command.equals(HandlerMapping.GOODS_CART_ADD_AJAX)
    		  || command.equals(HandlerMapping.GOODS_DETAIL)) {
         controller = new GoodsController(command);
      }
      //user
      else if(command.equals(HandlerMapping.USER_LOGIN) 
    		 || command.equals(HandlerMapping.USER_JOIN) 
    		 || command.equals(HandlerMapping.USER_JOIN_INSERT)
             || command.equals(HandlerMapping.USER_LOGIN_INSERT) 
             || command.equals(HandlerMapping.USER_ID_CHECK) 
             || command.equals(HandlerMapping.USER_EDIT)
             || command.equals(HandlerMapping.USER_EDIT_ACT) 
             || command.equals(HandlerMapping.USER_LOGOUT)) {
         controller = new UserController(command);
      }
      //dress
      else if(command.equals(HandlerMapping.DRESS_MAIN)
    		 || command.equals(HandlerMapping.DRESS_CATE_AJAX) 
    		 || command.equals(HandlerMapping.DRESS_CATE_AJAX2) 
    		 || command.equals(HandlerMapping.DRESS_CATE_AJAX3) 
		     || command.equals(HandlerMapping.DRESS_REGISTER) 
		     || command.equals(HandlerMapping.DRESS_REGISTER_ACT) 
		     || command.equals(HandlerMapping.DRESS_DETAIL)
		     || command.equals(HandlerMapping.DRESS_EDIT) 
		     || command.equals(HandlerMapping.DRESS_EDIT_ACT) 
		     || command.equals(HandlerMapping.DRESS_REMOVE_ACT)) { 
    	  controller = new DressController(command);
      }
      //mypage
      else if(command.equals(HandlerMapping.MYPAGE) 
    		 || command.equals(HandlerMapping.MYPAGE_COUPON) 
    		 || command.equals(HandlerMapping.MYPAGE_DETAIL) 
    		 || command.equals(HandlerMapping.MYPAGE_POINT) 
    		 || command.equals(HandlerMapping.MYPAGE_QNA)) {
    	  controller = new MypgController(command);
      }
      //Q&A
      else if(command.equals(HandlerMapping.QNA_INSERT)
    		  || command.equals(HandlerMapping.GOODS_DTL_QNA_INSERT) 
    		 || command.equals(HandlerMapping.QNA_INSERT_ACT) 
    		 || command.equals(HandlerMapping.QNA_DETAIL)
    		 || command.equals(HandlerMapping.QNA_EDIT) 
    		 || command.equals(HandlerMapping.QNA_EDIT_ACT) 
    		 || command.equals(HandlerMapping.QNA_REMOVE_ACT)) { 
    	  controller = new QnaController(command);
      }
	  //order
      else if(command.equals(HandlerMapping.ORDER)
    		 || command.equals(HandlerMapping.ORDER_REGISTER) 
    		 || command.equals(HandlerMapping.ORDER_LIST)
             || command.equals(HandlerMapping.ORDER_CART_LIST)
             || command.equals(HandlerMapping.ORDER_CART_LIST_AJAX)
             || command.equals(HandlerMapping.ORDER_CART_INSERT_AJAX)
             || command.equals(HandlerMapping.ORDER_CART_REGISTER)
             || command.equals(HandlerMapping.ORDER_CART_REGISTER_ACT)
             || command.equals(HandlerMapping.ORDER_CART_DELETE_AJAX)){
    	  controller = new OrderController(command);
      }
      /******************************** adm ********************************/
      //업체관리
      else if(command.equals(HandlerMapping.ADM_ENTR_LIST)
		  || command.equals(HandlerMapping.ADM_ENTR_REGISTER) 
		  || command.equals(HandlerMapping.ADM_ENTR_REGISTER_ACT)
		  || command.equals(HandlerMapping.ADM_ENTR_EDIT)
		  || command.equals(HandlerMapping.ADM_ENTR_EDIT_ACT)
    	  || command.equals(HandlerMapping.ADM_ENTR_REMOVE_ACT)) {
    	  controller = new AdmEntrController(command);
      }
      //공통코드 관리
      else if(command.equals(HandlerMapping.ADM_CODE_LIST)
    		  || command.equals(HandlerMapping.ADM_CODE_LIST_AJAX)
    		  || command.equals(HandlerMapping.ADM_CODE_REGISTER)
    		  || command.equals(HandlerMapping.ADM_CODE_REGISTER_ACT)
    		  || command.equals(HandlerMapping.ADM_CODE_EDIT)
    		  || command.equals(HandlerMapping.ADM_CODE_EDIT_ACT)
    		  || command.equals(HandlerMapping.ADM_CODE_REMOVE_ACT)) {
    	  controller = new AdmCodeController(command);
      }
      //카테고리 관리
      else if(command.equals(HandlerMapping.ADM_CATE_LIST)
    	  || command.equals(HandlerMapping.ADM_CATE_LIST_AJAX)
    	  || command.equals(HandlerMapping.ADM_CATE_REGISTER_ACT)
    	  || command.equals(HandlerMapping.ADM_CATE_REMOVE_ACT)) {
    	  controller = new AdmCateController(command);
      }
      //상품목록, 상품 문의 관리
      else if(command.equals(HandlerMapping.ADM_GOODS_LIST) 
		  || command.equals(HandlerMapping.ADM_GOODS_LIST_AJAX)
		  || command.equals(HandlerMapping.ADM_GOODS_QNA)
		  || command.equals(HandlerMapping.ADM_GOODS_REGISTER) 
		  || command.equals(HandlerMapping.ADM_GOODS_REGISTER_ACT)
		  || command.equals(HandlerMapping.ADM_GOODS_EDIT)
		  || command.equals(HandlerMapping.ADM_GOODS_EDIT_ACT)
    	  || command.equals(HandlerMapping.ADM_GOODS_REMOVE_ACT)){
         controller = new AdmGoodsController(command);
      }
      //상품 판매 게시글 관리
      else if(command.equals(HandlerMapping.ADM_SALES_LIST)
          || command.equals(HandlerMapping.ADM_SALES_REGISTER)
          || command.equals(HandlerMapping.ADM_SALES_REGISTER_ACT)
          || command.equals(HandlerMapping.ADM_SALES_UPDATE)
          || command.equals(HandlerMapping.ADM_SALES_UPDATE_ACT)
          || command.equals(HandlerMapping.ADM_SALES_REMOVE_ACT)){
    	  controller = new AdmSalesController(command);
      }
      //주문 관리
      else if(command.equals(HandlerMapping.ADM_ORDER_LIST)
    		  || command.equals(HandlerMapping.ADM_ORDER_DETAIL)){
         controller = new AdmOrderController(command);
      }
      //회원 관리
      else if(command.equals(HandlerMapping.ADM_USER_LIST)
    	  || command.equals(HandlerMapping.ADM_USER_DETAIL)
    	  || command.equals(HandlerMapping.ADM_USER_SEARCH)){
         controller = new AdmUserController(command);
      }
      //이벤트 관리
      else if(command.equals(HandlerMapping.ADM_EVENT_LIST)
        	  || command.equals(HandlerMapping.ADM_EVENT_REGISTER)
    		  || command.equals(HandlerMapping.ADM_EVENT_REGISTER_ACT)
    		  || command.equals(HandlerMapping.ADM_EVENT_EDIT)
    		  || command.equals(HandlerMapping.ADM_EVENT_EDIT_ACT)
    		  || command.equals(HandlerMapping.ADM_EVENT_LIST_AJAX)
    		  || command.equals(HandlerMapping.ADM_EVENT_REMOVE_ACT)){
             controller = new AdmEventController(command);
          }
      //매출현황
      else if(command.equals(HandlerMapping.ADM_STATS_SALES)){
         controller = new AdmStatsController(command);
      }
      //드레스룸 관리
      else if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER)
 		  || command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_EDIT) 
 		  || command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_EDIT_ACT) 
 		  || command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER_REMOVE_ACT)){
         controller = new AdmDressController(command);
      }
      //1:1 문의 관리
      else if(command.equals(HandlerMapping.ADM_QNA_LIST)
    		  || command.equals(HandlerMapping.ADM_QNA_ANSWER) 
    		  || command.equals(HandlerMapping.ADM_QNA_ANSWER_ACT)){
         controller = new AdmQnaController(command);
      }
      //쿠폰 관리
      else if(command.equals(HandlerMapping.ADM_CPN_LIST)
    		  || command.equals(HandlerMapping.ADM_CPN_EDIT)
    		  || command.equals(HandlerMapping.ADM_CPN_REGISTER)
    		  || command.equals(HandlerMapping.ADM_CPN_REGISTER_ACT)
    		  || command.equals(HandlerMapping.ADM_CPN_EDIT_ACT)
    		  || command.equals(HandlerMapping.ADM_CPN_REMOVE_ACT)){
         controller = new AdmCpnController(command);
      }
      //포인트 관리 
      else if(command.equals(HandlerMapping.ADM_POINT_LIST)) {
    	  controller = new AdmPointController(command);
      }
      
      return controller;
   }
}
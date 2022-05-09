package com.clt.cmm.servlet;

import com.clt.adm.cpn.AdmCpnController;
import com.clt.adm.dress.AdmDressController;
import com.clt.adm.event.AdmEventController;
import com.clt.adm.goods.AdmGoodsController;
import com.clt.adm.order.AdmOrderController;
import com.clt.adm.qna.AdmQnaController;
import com.clt.adm.stats.AdmStatsController;
import com.clt.adm.user.AdmUserController;
import com.clt.cmm.controller.Controller;
import com.clt.shp.dress.DressController;
import com.clt.shp.goods.GoodsController;
import com.clt.shp.mypage.MypageController;
import com.clt.shp.qna.QnaController;
import com.clt.shp.user.UserController;

public class HandlerMapping {
   private static HandlerMapping handler = new HandlerMapping();
   
   /******************************** adm ********************************/
   public static final String ADM_GOODS_LIST = "adm_goods_list";/*상품목록*/
   public static final String ADM_GOODS_REGISTER = "adm_goods_register";/*상품등록*/
   public static final String ADM_GOODS_REGISTER_ACT = "adm_goods_register_act";/*상품등록*/
   public static final String ADM_GOODS_EDIT = "adm_goods_edit";/*상품수정*/
   public static final String ADM_GOODS_EDIT_ACT = "adm_goods_edit_act";/*상품수정*/
   public static final String ADM_GOODS_REMOVE_ACT = "adm_goods_remove_act";/*상품삭제*/
   public static final String ADM_GOODS_QNA = "adm_goods_qna";/*상품 문의 관리*/
   public static final String ADM_ORDER_LIST = "adm_order_list";/*주문 관리*/
   public static final String ADM_USER_LIST = "adm_user_list";/*회원 관리*/
   public static final String ADM_EVENT_BANNER = "adm_event_banner";/*이벤트 관리*/
   public static final String ADM_STATS_SALES = "adm_stats_sales";/*매출현황*/
   public static final String ADM_DRESSROOM_MANAGER = "adm_dressroom_manager";/*드레스룸 관리*/
   public static final String ADM_QNA_LIST = "adm_qna_list";/*1:1 문의 관리*/
   public static final String ADM_COUPON = "adm_coupon";/*쿠폰/적립금 관리*/
   
   /******************************** shp ********************************/
   //유저
   public static final String USER_LOGIN = "user_login";
   public static final String USER_LOGOUT = "user_logout";
   public static final String USER_LOGIN_INSERT = "user_login_insert";
   public static final String USER_JOIN = "user_join";
   public static final String USER_JOIN_INSERT = "user_join_insert";
   public static final String USER_ID_CHECK = "user_id_check";
   public static final String USER_EDIT = "user_edit"; /*회원수정*/
   public static final String USER_EDIT_ACT = "user_edit_act";/*회원수정*/
   
   //드레스룸
   public static final String DRESS_MAIN = "dress_main";
   public static final String DRESS_REGISTER = "dress_register";
   
   //마이페이지
   public static final String MYPAGE = "mypage";
   public static final String MYPAGE_COUPON = "mypage_coupon";
   public static final String MYPAGE_DETAIL = "mypage_detail";
   public static final String MYPAGE_POINT = "mypage_point";
   public static final String MYPAGE_QNA = "mypage_qna";
   
   //Q&A
   public static final String QNA = "qna"; /*Q&A리스트*/
   public static final String QNA_DETAIL = "qna_detail"; /*Q&A상세보기*/   
   public static final String QNA_INSERT = "qna_insert"; /*Q&A작성*/
   public static final String QNA_INSERT_ACT = "qna_insert_act"; /*Q&A작성*/
   public static final String QNA_EDIT = "qna_edit"; /*Q&A수정*/
   public static final String QNA_EDIT_ACT = "qna_edit_act"; /*Q&A수정*/
   public static final String QNA_REMOVE_ACT = "qna_remove_act"; /*Q&A삭제*/
   
   //상품
   public static final String GOODS_LIST = "goods_list";
   public static final String GOODS_CATEGORY = "goods_category";
   public static final String GOODS_CART = "goods_cart";

   private HandlerMapping() {
   }

   public static HandlerMapping getInstance() {
      return handler;
   }

   public Controller createController(String command) {
      Controller controller = null;
      
      /******************************** adm ********************************/
      //상품목록, 상품 문의 관리
      if(command.equals(HandlerMapping.ADM_GOODS_LIST) 
		  || command.equals(HandlerMapping.ADM_GOODS_QNA)
		  || command.equals(HandlerMapping.ADM_GOODS_REGISTER) 
		  || command.equals(HandlerMapping.ADM_GOODS_REGISTER_ACT)
		  || command.equals(HandlerMapping.ADM_GOODS_EDIT)
		  || command.equals(HandlerMapping.ADM_GOODS_EDIT_ACT)
    	  || command.equals(HandlerMapping.ADM_GOODS_REMOVE_ACT)){
         controller = new AdmGoodsController(command);
      }
      //주문 관리
      else if(command.equals(HandlerMapping.ADM_ORDER_LIST)){
         controller = new AdmOrderController(command);
      }
      //회원 관리
      else if(command.equals(HandlerMapping.ADM_USER_LIST)){
         controller = new AdmUserController(command);
      }
      //이벤트 관리
      else if(command.equals(HandlerMapping.ADM_EVENT_BANNER)){
         controller = new AdmEventController(command);
      }
      //매출현황
      else if(command.equals(HandlerMapping.ADM_STATS_SALES)){
         controller = new AdmStatsController(command);
      }
      //드레스룸 관리
      else if(command.equals(HandlerMapping.ADM_DRESSROOM_MANAGER)){
         controller = new AdmDressController(command);
      }
      //1:1 문의 관리
      else if(command.equals(HandlerMapping.ADM_QNA_LIST)){
         controller = new AdmQnaController(command);
      }
      //쿠폰/적립금 관리
      else if(command.equals(HandlerMapping.ADM_COUPON)){
         controller = new AdmCpnController(command);
      }
      /******************************** shp ********************************/
      //goods
      else if (command.equals(HandlerMapping.GOODS_LIST) || command.equals(HandlerMapping.GOODS_CATEGORY)|| command.equals(HandlerMapping.GOODS_CART)) {
         controller = new GoodsController(command);
      }
      //user
      else if(command.equals(HandlerMapping.USER_LOGIN) || command.equals(HandlerMapping.USER_JOIN) || command.equals(HandlerMapping.USER_JOIN_INSERT)
            || command.equals(HandlerMapping.USER_LOGIN_INSERT) || command.equals(HandlerMapping.USER_ID_CHECK) || command.equals(HandlerMapping.USER_EDIT)
            || command.equals(HandlerMapping.USER_EDIT_ACT) || command.equals(HandlerMapping.USER_LOGOUT)) {
         controller = new UserController(command);
      }
      //dress
      else if(command.equals(HandlerMapping.DRESS_MAIN) || command.equals(HandlerMapping.DRESS_REGISTER)) {
    	  controller = new DressController(command);
      }
      //mypage
      else if(command.equals(HandlerMapping.MYPAGE) || command.equals(HandlerMapping.MYPAGE_COUPON) || command.equals(HandlerMapping.MYPAGE_DETAIL) 
    		  || command.equals(HandlerMapping.MYPAGE_POINT) || command.equals(HandlerMapping.MYPAGE_QNA)) {
    	  controller = new MypageController(command);
      }
      //Q&A
      else if(command.equals(HandlerMapping.QNA) || command.equals(HandlerMapping.QNA_INSERT) || command.equals(HandlerMapping.QNA_INSERT_ACT) || command.equals(HandlerMapping.QNA_DETAIL)
    		  || command.equals(HandlerMapping.QNA_EDIT) || command.equals(HandlerMapping.QNA_EDIT_ACT) || command.equals(HandlerMapping.QNA_REMOVE_ACT)) { 
    	  controller = new QnaController(command);
      }
      return controller;
   }
}
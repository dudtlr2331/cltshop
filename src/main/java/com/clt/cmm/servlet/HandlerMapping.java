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
import com.clt.shp.goods.GoodsController;
import com.clt.shp.user.UserController;

public class HandlerMapping {
   private static HandlerMapping handler = new HandlerMapping();
   
   /******************************** adm ********************************/
   public static final String ADM_GOODS_LIST       = "adm_goods_list";/*상품목록*/
   public static final String ADM_GOODS_QNA       = "adm_goods_qna";/*상품 문의 관리*/
   public static final String ADM_ORDER_LIST       = "adm_order_list";/*주문 관리*/
   public static final String ADM_USER_LIST       = "adm_user_list";/*회원 관리*/
   public static final String ADM_EVENT_BANNER       = "adm_event_banner";/*이벤트 관리*/
   public static final String ADM_STATS_SALES       = "adm_stats_sales";/*매출현황*/
   public static final String ADM_DRESSROOM_MANAGER = "adm_dressroom_manager";/*드레스룸 관리*/
   public static final String ADM_ONE_MANAGEMENT    = "adm_one_management";/*1:1 문의 관리*/
   public static final String ADM_COUPON          = "adm_coupon";/*쿠폰/적립금 관리*/
   
   /******************************** shp ********************************/
   //유저
   public static final String USER_LOGIN = "user_login";
   public static final String USER_LOGIN_INSERT = "user_login_insert";
   public static final String USER_JOIN = "user_join";
   public static final String USER_JOIN_INSERT = "user_join_insert";
   public static final String USER_ID_CHECK = "user_id_check";
   public static final String USER_UPDATE = "user_update";
   
   //상품
   public static final String GOODS_LIST = "goods_list";
   public static final String GOODS_CATEGORY = "goods_category";

   private HandlerMapping() {
   }

   public static HandlerMapping getInstance() {
      return handler;
   }

   public Controller createController(String command) {
      Controller controller = null;
      
      /******************************** adm ********************************/
      //상품목록, 상품 문의 관리
      if(command.equals(HandlerMapping.ADM_GOODS_LIST) || command.equals(HandlerMapping.ADM_GOODS_QNA)){
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
      else if(command.equals(HandlerMapping.ADM_ONE_MANAGEMENT)){
         controller = new AdmQnaController(command);
      }
      //쿠폰/적립금 관리
      else if(command.equals(HandlerMapping.ADM_COUPON)){
         controller = new AdmCpnController(command);
      }
      /******************************** shp ********************************/
      //goods
      else if (command.equals(HandlerMapping.GOODS_LIST) || command.equals(HandlerMapping.GOODS_CATEGORY)) {
         controller = new GoodsController(command);
      }
      //user
      else if(command.equals(HandlerMapping.USER_LOGIN) || command.equals(HandlerMapping.USER_JOIN) || command.equals(HandlerMapping.USER_JOIN_INSERT)
            || command.equals(HandlerMapping.USER_LOGIN_INSERT) || command.equals(HandlerMapping.USER_ID_CHECK) || command.equals(HandlerMapping.USER_UPDATE)) {
         controller = new UserController(command);
      }
      return controller;
   }
}
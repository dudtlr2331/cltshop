package com.clt.cmm.servlet;

import com.clt.cmm.controller.Controller;
import com.clt.shp.goods.GoodsController;
import com.clt.shp.user.UserController;

public class HandlerMapping {
   private static HandlerMapping handler = new HandlerMapping();
   
   public static final String GOODS_LIST = "goods_list";
   public static final String USER_LOGIN = "user_login";
   public static final String USER_LOGIN_INSERT = "user_login_insert";
   public static final String USER_JOIN = "user_join";
   public static final String USER_JOIN_INSERT = "user_join_insert";
   public static final String USER_ID_CHECK = "user_id_check";
   public static final String USER_UPDATE = "user_update";

   private HandlerMapping() {
   }

   public static HandlerMapping getInstance() {
      return handler;
   }

   public Controller createController(String command) {
      Controller controller = null;
      if (command.equals(HandlerMapping.GOODS_LIST)) {
         controller = new GoodsController();
      }
      //user
      else if(command.equals(HandlerMapping.USER_LOGIN) || command.equals(HandlerMapping.USER_JOIN) || command.equals(HandlerMapping.USER_JOIN_INSERT)
    		  || command.equals(HandlerMapping.USER_LOGIN_INSERT) || command.equals(HandlerMapping.USER_ID_CHECK) || command.equals(HandlerMapping.USER_UPDATE)) {
         controller = new UserController(command);
      }
      return controller;
   }
}
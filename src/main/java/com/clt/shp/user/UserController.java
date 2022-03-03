package com.clt.shp.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class UserController implements Controller{
	
	private UserService userService;
	
	public UserController() {
		userService = new UserService(new UserDaoOracle());
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		UserVo param = new UserVo();
		
		List<UserVo> userList = userService.selectUserList(param);
		
		req.setAttribute("userList", userList);
		
		return new ModelAndView("/WEB-INF/jsp/shp/goods/goods_list.jsp");
	}

}

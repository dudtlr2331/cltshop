package com.clt.shp.dress;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.adm.user.AdmUserVO;
import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.dao.impl.GoodsDaoOracle;
import com.clt.shp.goods.service.GoodsService;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.impl.UserDaoOracle;
import com.clt.shp.user.service.UserService;

public class DressController implements Controller {
private String command = "";
	
	public DressController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		DressVo pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.DRESS_MAIN)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_main.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.DRESS_REGISTER)) {
			modelAndView.setPath("/WEB-INF/jsp/shp/dress/dress_register.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private DressVo parameterSetting(HttpServletRequest req) {
		DressVo pvo = new DressVo();
		return pvo;
	}
}

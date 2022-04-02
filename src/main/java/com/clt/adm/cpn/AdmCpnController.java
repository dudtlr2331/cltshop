package com.clt.adm.cpn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;

public class AdmCpnController implements Controller{
	private String command = "";
	
	public AdmCpnController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		GoodsVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_GOODS_LIST)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/goods/goods_list.jsp");
			modelAndView.setRedirect(false);
		}
				
		return modelAndView;
	}

	private GoodsVO parameterSetting(HttpServletRequest req) {
		GoodsVO pvo = new GoodsVO();
		return pvo;
	}
}

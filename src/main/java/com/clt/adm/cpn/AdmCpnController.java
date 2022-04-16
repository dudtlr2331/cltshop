package com.clt.adm.cpn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.goods.GoodsVO;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.service.UserService;

public class AdmCpnController implements Controller{
	private ModelAndView modelAndView;
	private AdmService AdmService;
	private String command = "";
	private AdmVo pvo;
	
	public AdmCpnController(String command) {
		this.command = command;
	}

	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		//파라미터 셋팅
		AdmCpnVO pvo = parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_COUPON)) {
			modelAndView.setPath("/WEB-INF/jsp/adm/coupon/coupon.jsp");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", HandlerMapping.ADM_GOODS_LIST);
		//화면 반환
		return modelAndView;
	}

	private AdmCpnVO parameterSetting(HttpServletRequest req) {
		pvo = new AdmVo();
	    // 파라미터 셋팅
		
	    String cou_name = req.getParameter("cou_name");
	    String cou_discount = req.getParameter("cou_discount");
	    String cou_time = req.getParameter("cou_time");
	    String cou_count = req.getParameter("cou_count");
	    
	    pvo.setCouN(cou_name);
	    pvo.setCouD(cou_discount);
	    pvo.setCouT(cou_time);
	    pvo.setCouC(cou_count);
	}
}

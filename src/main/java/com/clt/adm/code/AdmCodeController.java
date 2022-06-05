package com.clt.adm.code;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clt.cmm.controller.Controller;
import com.clt.cmm.servlet.HandlerMapping;
import com.clt.cmm.servlet.ModelAndView;
import com.clt.shp.cate.CateVO;
import com.clt.shp.code.CodeVO;
import com.clt.shp.code.dao.impl.CodeDaoOracle;
import com.clt.shp.code.service.CodeService;
import com.clt.shp.qna.QnaVO;

public class AdmCodeController implements Controller{
	private String command = "";
	private CodeService codeService;
	
	public AdmCodeController(String command) {
		codeService = new CodeService(new CodeDaoOracle());
		this.command = command;
	}
	
	@Override
	public ModelAndView execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		String leftMenuNav = HandlerMapping.ADM_CODE_LIST;
		
		//파라미터 셋팅
		CodeVO pvo = codeService.parameterSetting(req);
		
		//비즈니스 처리
		if(command.equals(HandlerMapping.ADM_CODE_LIST)){
			List<CodeVO> list = codeService.selectCodeList(pvo);
			req.setAttribute("list", list);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/code/code_list.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.ADM_CODE_LIST_AJAX)){
			String json = "{\"result\":\"success\", \"dataList\":[";
			try {
				List<CodeVO> list = null;
				
				if(req.getParameter("searchGradeUpperType").equals("user")) {
					list = codeService.selectUsrCdList(pvo);
				}else if(req.getParameter("searchGradeUpperType").equals("admin")) {
					list = codeService.selectAdmCdList(pvo);
				}
				if(list != null) {
					for(int i=0; i<list.size(); i++) {
						if(i>0) {
							json += ",";
						}
						json += "{\"codeNm\":\""+list.get(i).getCodeNm()+"\", \"codeVal\":\""+list.get(i).getCodeVal()+"\"}";
					}
					json += "]}";
				}else {
					json = "{\"result\":\"fail\"}";
				}
			} catch (Exception e) {
				json = "{\"result\":\"fail\"}";
				e.printStackTrace();
			}
			req.setAttribute("json", json);
			
			modelAndView.setPath("jsonView.jsp");
			modelAndView.setRedirect(false);
		}
		else if(command.equals(HandlerMapping.ADM_CODE_REGISTER)){
			modelAndView.setPath("/WEB-INF/jsp/adm/code/code_register.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.ADM_CODE_REGISTER_ACT)){
			int result = codeService.insertCode(pvo);
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_code_list");
			modelAndView.setRedirect(true);
		}else if(command.equals(HandlerMapping.ADM_CODE_EDIT)){
			CodeVO rvo = codeService.selectCodeOne(pvo);
			
			req.setAttribute("pvo", rvo);
			
			modelAndView.setPath("/WEB-INF/jsp/adm/code/code_edit.jsp");
			modelAndView.setRedirect(false);
		}else if(command.equals(HandlerMapping.ADM_CODE_EDIT_ACT)){
			int result = codeService.updateCode(pvo);
			
			req.setAttribute("pvo", pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_code_list");
			modelAndView.setRedirect(true);
		}else if(command.equals(HandlerMapping.ADM_CODE_REMOVE_ACT)){
			int result = codeService.deleteCode(pvo);
			
			modelAndView.setPath("/DispatcherServlet?command=adm_code_list");
			modelAndView.setRedirect(false);
		}
		
		//레프트 메뉴 네비게이션
		req.setAttribute("leftMenuNav", leftMenuNav);
		return modelAndView;
	}

}

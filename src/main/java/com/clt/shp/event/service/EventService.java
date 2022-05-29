package com.clt.shp.event.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.clt.shp.event.EventVO;
import com.clt.shp.event.dao.EventDao;

public class EventService {

	private EventDao dao;
	
	public EventService(EventDao dao) {
		this.dao = dao;
	}
	
	public EventVO parameterSetting(HttpServletRequest req) {
		long eventInfoSeq = req.getParameter("eventInfoSeq") == null? 0L : Long.parseLong(req.getParameter("eventInfoSeq"));
		long eventNum = req.getParameter("eventNum") == null? 0L : Long.parseLong(req.getParameter("eventNum"));
		String eventName = req.getParameter("eventName");
		String eventEndDate = req.getParameter("eventEndDate");

		EventVO pvo = new EventVO();
		pvo.setEventInfoSeq(eventInfoSeq);
		pvo.setEventNum(eventNum);
		pvo.setEventName(eventName);
		pvo.setEventEndDate(eventEndDate);
		
		//첨부파일 있으면 셋팅
		String imgPath = (String) req.getAttribute("imgPath");
		if(null == imgPath || "".equals(imgPath)) {
			imgPath = req.getParameter("imgPath");
		}
		String imgNm = (String) req.getAttribute("imgNm");
		if(null == imgNm || "".equals(imgNm)) {
			imgNm = req.getParameter("imgNm");
		}
			
		if(null != imgPath && !"".equals(imgPath)) {
			pvo.setImgPath(imgPath);
		}
		if(null != imgNm && !"".equals(imgNm)) {
			pvo.setImgNm(imgNm);
		}
		
		return pvo;
	}

	public EventVO selectEventOne(EventVO pvo) {
		return dao.selectEventOne(pvo);
	}

	public List<EventVO> selectEventList(EventVO pvo) {
		return dao.selectEventList(pvo);
	}
	
	public int insertEvent(EventVO pvo) {
		return dao.insertEvent(pvo);
	}
	
	public int updateEvent(EventVO pvo) {
		return dao.updateEvent(pvo);
	}
	
	public int deleteEvent(EventVO pvo) {
		return dao.deleteEvent(pvo);
	}
}

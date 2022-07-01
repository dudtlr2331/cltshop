package com.clt.shp.event.dao;

import java.util.List;

import com.clt.shp.event.EventVO;

public interface EventDao {
	int insertEvent(EventVO pvo);
	EventVO selectEventOne(EventVO pvo);
	List<EventVO> selectEventList(EventVO pvo);
	int updateEvent(EventVO pvo);
	int deleteEvent(EventVO pvo);
	int dropSeq();
	int createSeq();
	int deleteEventAll();
}
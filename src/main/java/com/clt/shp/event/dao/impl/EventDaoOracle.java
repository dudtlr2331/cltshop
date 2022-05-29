package com.clt.shp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.event.EventVO;
import com.clt.shp.event.dao.EventDao;
import com.clt.shp.event.sql.EventSql;
import com.clt.shp.goods.sql.GoodsSql;

public class EventDaoOracle implements EventDao{
	private CommonDao commonDao;
	
	public EventDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public int insertEvent(EventVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(EventSql.EVENT_INSERT);
			ps.setString(1, pvo.getEventName());
			ps.setString(2, pvo.getImgPath());
			ps.setString(3, pvo.getImgNm());
			ps.setString(4, pvo.getEventEndDate());

			row = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}
	
	@Override
	public EventVO selectEventOne(EventVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		EventVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(EventSql.EVENT_SELECT);
			ps.setLong(1, pvo.getEventInfoSeq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new EventVO(
					rs.getLong("EVENT_INFO_SEQ")
	                , rs.getLong("EVENT_NUM")
				    , rs.getString("EVENT_NAME")
				    , rs.getString("IMG_PATH")
				    , rs.getString("IMG_NM")
				    , rs.getString("EVENT_REGIST_DATE")
				    , rs.getString("EVENT_END_DATE")
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
	
	@Override
	public List<EventVO> selectEventList(EventVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<EventVO> list = new ArrayList<EventVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(EventSql.EVENT_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new EventVO(
					rs.getLong("EVENT_INFO_SEQ")
		            , rs.getLong("EVENT_NUM")
					, rs.getString("EVENT_NAME")
					, rs.getString("IMG_PATH")
					, rs.getString("IMG_NM")
					, rs.getString("EVENT_REGIST_DATE")
					, rs.getString("EVENT_END_DATE")
				));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	@Override
	public int updateEvent(EventVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(EventSql.EVENT_UPDATE);
			ps.setString(1, pvo.getEventName());
			ps.setString(2, pvo.getImgPath());
			ps.setString(3, pvo.getImgNm());
			ps.setString(4, pvo.getEventEndDate());
			ps.setLong(5, pvo.getEventInfoSeq());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	
	@Override
	public int deleteEvent(EventVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(EventSql.EVENT_DELETE);
			ps.setLong(1, pvo.getEventInfoSeq());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				commonDao.closeAll(ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return row;
	}
	

}

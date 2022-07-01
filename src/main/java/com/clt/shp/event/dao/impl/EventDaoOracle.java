package com.clt.shp.event.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
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
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		String sql = EventSql.EVENT_INSERT;
		
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getEventName());
			ps.setString(2, pvo.getImgPath());
			ps.setString(3, pvo.getImgNm());
			ps.setString(4, pvo.getEventEndDate());

			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		EventVO vo = null;
		String sql = EventSql.EVENT_SELECT;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getEventInfoSeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		List<EventVO> list = new ArrayList<EventVO>();
		String sql = EventSql.EVENT_LIST;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = EventSql.EVENT_UPDATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setString(1, pvo.getEventName());
			ps.setString(2, pvo.getImgPath());
			ps.setString(3, pvo.getImgNm());
			ps.setString(4, pvo.getEventEndDate());
			ps.setLong(5, pvo.getEventInfoSeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = EventSql.EVENT_DELETE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			ps.setLong(1, pvo.getEventInfoSeq());
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public int dropSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = EventSql.EVENT_SEQ_DROP;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public int createSeq() {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = EventSql.EVENT_SEQ_CREATE;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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
	public int deleteEventAll() {
		Connection conn = null;
		LogPreparedStatement ps = null;
		int row = 0;
		String sql = EventSql.EVENT_DELETE_ALL;
		try {
			conn = commonDao.getConnection();
			ps = new LogPreparedStatement(conn, sql);
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
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

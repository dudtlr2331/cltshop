package com.clt.shp.dress.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;
import com.clt.shp.dress.sql.DressSql;

public class DressDaoOracle implements DressDao{
	private CommonDao commonDao;
	
	public DressDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public int insertDress(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_INSERT); //DressSql
			ps.setInt(1, pvo.getTagId());
			ps.setInt(2, pvo.getUserId());
			ps.setString(3, pvo.getDressroomName());
			ps.setLong(4, pvo.getDressroomDescription());
			ps.setDate(5, pvo.getDressroomDate());
			ps.setInt(6, pvo.getDressroomLike());

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
	public DressVO selectDressOne(DressVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		DressVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_SELECT); //DressSql
			ps.setLong(1, pvo.getDressInfoSeq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new DressVO(
                      rs.setInt("DRESSROOM_INFO_SEQ");
                    , rs.setInt("DRESSROOM_ID");
			        , rs.setInt("TAG_ID");
                    , rs.setInt("USER_ID");
			        , rs.setString("DRESSROOM_NAME");
			        , rs.setLong("DRESSROOM_DESCRIPTION");
			        , rs.setDate("DRESSROOM_DATE");
			        , rs.setInt("DRESSROOM_LIKE");
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
	public List<DressVO> selectDressList(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<DressVO> list = new ArrayList<DressVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_LIST); //DressSql
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new DressVO(
                      rs.setInt("DRESSROOM_INFO_SEQ");
                    , rs.setInt("DRESSROOM_ID");
			        , rs.setInt("TAG_ID");
                    , rs.setInt("USER_ID");
			        , rs.setString("DRESSROOM_NAME");
			        , rs.setLong("DRESSROOM_DESCRIPTION");
			        , rs.setDate("DRESSROOM_DATE");
			        , rs.setInt("DRESSROOM_LIKE");
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

		return list;
	}
	
	@Override
	public int updateDress(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_UPDATE); //DressSql
			ps.setInt(1, pvo.getTagId());
			ps.setInt(2, pvo.getUserId());
			ps.setString(3, pvo.getDressroomName());
			ps.setLong(4, pvo.getDressroomDescription());
			ps.setDate(5, pvo.getDressroomDate());
			ps.setInt(6, pvo.getDressroomLike());

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
	public int deleteDress(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_DELETE); //DressSql
			ps.setLong(1, pvo.getDressInfoSeq());

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

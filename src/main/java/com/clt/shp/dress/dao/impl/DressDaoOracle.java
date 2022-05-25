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
			ps.setLong(2, pvo.getUserId());
			ps.setString(3, pvo.getDressroomName());
			ps.setString(4, pvo.getDressroomDescription());
			ps.setInt(5, pvo.getDressroomLike());

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
			ps.setLong(1, pvo.getDressroomInfoSEQ());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new DressVO(
                      rs.getLong("DRESSROOM_INFO_SEQ")
                    , rs.getLong("DRESSROOM_ID")
			        , rs.getInt("TAG_ID")
                    , rs.getLong("USER_ID")
			        , rs.getString("DRESSROOM_NAME")
			        , rs.getString("DRESSROOM_DESCRIPTION")
			        , rs.getDate("DRESSROOM_DATE")
			        , rs.getInt("DRESSROOM_LIKE")
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
						rs.getLong("DRESSROOM_INFO_SEQ")
					  , rs.getLong("DRESSROOM_ID")
				      , rs.getInt("TAG_ID")
	                  , rs.getLong("USER_ID")
				      , rs.getString("DRESSROOM_NAME")
				      , rs.getString("DRESSROOM_DESCRIPTION")
				      , rs.getDate("DRESSROOM_DATE")
				      , rs.getInt("DRESSROOM_LIKE")
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
	public int updateDress(DressVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(DressSql.DRESS_UPDATE); //DressSql
			ps.setString(1, pvo.getDressroomName());
			ps.setString(2, pvo.getDressroomDescription());
			ps.setLong(3, pvo.getDressroomInfoSEQ());

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
			ps.setLong(1, pvo.getDressroomInfoSEQ());

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
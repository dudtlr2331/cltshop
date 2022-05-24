package com.clt.shp.cpn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.cpn.CpnVO;
import com.clt.shp.cpn.dao.CpnDao;
import com.clt.shp.cpn.sql.CpnSql;

public class CpnDaoOracle implements CpnDao{
	private CommonDao commonDao;
	
	public CpnDaoOracle() {
		commonDao = new CommonDao();
	}

	@Override
	public int insertCpn(CpnVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(CpnSql.CPN_INSERT);
			ps.setString(1, pvo.getCouName());
			ps.setInt(2, pvo.getCouDiscount());
			ps.setString(3, pvo.getCouEndDate());
			ps.setInt(4, pvo.getCouCount());

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
	public CpnVO selectCpnOne(CpnVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CpnVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(CpnSql.CPN_SELECT);
			ps.setLong(1, pvo.getCouInfoSeq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new CpnVO(
					rs.getLong("COU_INFO_SEQ")
	                , rs.getLong("COU_NUM")
				    , rs.getString("COU_NAME")
	                , rs.getInt("COU_DISCOUNT")
				    , rs.getString("COU_REGIST_DATE")
				    , rs.getString("COU_END_DATE")
				    , rs.getInt("COU_COUNT")
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
	public List<CpnVO> selectCpnList(CpnVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CpnVO> list = new ArrayList<CpnVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(CpnSql.CPN_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new CpnVO(
					rs.getLong("COU_INFO_SEQ")
		            , rs.getLong("COU_NUM")
					, rs.getString("COU_NAME")
		            , rs.getInt("COU_DISCOUNT")
					, rs.getString("COU_REGIST_DATE")
					, rs.getString("COU_END_DATE")
					, rs.getInt("COU_COUNT")
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
	public int updateCpn(CpnVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps.setString(1, pvo.getCouName());
			ps.setInt(2, pvo.getCouDiscount());
			ps.setString(3, pvo.getCouEndDate());
			ps.setInt(4, pvo.getCouCount());
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
	public int deleteCpn(CpnVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(CpnSql.CPN_DELETE);
			ps.setLong(1, pvo.getCouInfoSeq());
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

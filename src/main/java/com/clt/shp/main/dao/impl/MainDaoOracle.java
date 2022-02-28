package com.clt.shp.main.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.main.MainVO;
import com.clt.shp.main.dao.MainDao;
import com.clt.shp.main.sql.MainSql;

public class MainDaoOracle implements MainDao{
	private CommonDao commonDao;
	
	public MainDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertMain(MainVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(MainSql.MAIN_INSERT);
			ps.setString(1, String.valueOf(pvo.getMainBoardSn()));
			ps.setString(2, pvo.getImgPath());

			row = ps.executeUpdate();
			
			System.out.println("dao..INSERT OK!!..No ::" + pvo.getMainBoardSn());
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
	public MainVO selectMain(MainVO pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MainVO vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(MainSql.MAIN_SELECT);
			ps.setLong(1, pvo.getMainBoardSn());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new MainVO(rs.getLong("MAIN_BOARD_SN"), rs.getString("IMG_PATH"));
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
	public List<MainVO> selectListMain(MainVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<MainVO> list = new ArrayList<MainVO>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(MainSql.MAIN_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new MainVO(rs.getLong("MAIN_BOARD_SN"), rs.getString("IMG_PATH")));
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
	public int updateMain(MainVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(MainSql.MAIN_UPDATE);
			ps.setString(1, pvo.getImgPath());
			ps.setLong(2, pvo.getMainBoardSn());
			row = ps.executeUpdate();
			System.out.println(row + "row UPDATE..updatePosting()..end");
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
	public int deleteMain(MainVO pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(MainSql.MAIN_DELETE);
			ps.setLong(1, pvo.getMainBoardSn());
			row = ps.executeUpdate();
			System.out.println(row + " row DELETE...deletePosting()...end...");
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

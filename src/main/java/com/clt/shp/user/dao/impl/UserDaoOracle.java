package com.clt.shp.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.cmm.dao.CommonDao;
import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.UserDao;
import com.clt.shp.user.sql.UserSql;

public class UserDaoOracle implements UserDao{
	private CommonDao commonDao;
	
	public UserDaoOracle() {
		commonDao = new CommonDao();
	}
	
	@Override
	public int insertUser(UserVo pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(UserSql.USER_INSERT);
			ps.setLong(1, pvo.getMember_seq());
			ps.setString(2, pvo.getMember_id());
			ps.setString(3, pvo.getMember_email());
			ps.setString(4, pvo.getMember_pwd());
			ps.setString(5, pvo.getTel_front());
			ps.setString(6, pvo.getTel_midle());
			ps.setString(7, pvo.getTel_back());
			ps.setString(8, pvo.getBirth_yy());
			ps.setString(9, pvo.getBirth_mm());
			ps.setString(10, pvo.getBirth_dd());

			row = ps.executeUpdate();
			
			System.out.println("INSERT OK.. Seq::" + pvo.getMember_seq());
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
	public UserVo selectUser(UserVo pvo){
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserVo vo = null;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(UserSql.USER_SELECT);
			ps.setLong(1, pvo.getMember_seq());
			rs = ps.executeQuery();
			if (rs.next()) {
				vo = new UserVo(rs.getLong("MEMBER_SEQ"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_EMAIL"), rs.getString("MEMBER_PWD"),
						rs.getString("TEL_FRONT"),rs.getString("TEL_MIDLE"),rs.getString("TEL_BACK"),rs.getString("BIRTH_YY"),
						rs.getString("BIRTH_MM"),rs.getString("BIRTH_DD"));
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
	public List<UserVo> selectListUser(UserVo pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<UserVo> list = new ArrayList<UserVo>();
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(UserSql.USER_LIST);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new UserVo(rs.getLong("MEMBER_SEQ"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_EMAIL"), rs.getString("MEMBER_PWD"),
						rs.getString("TEL_FRONT"),rs.getString("TEL_MIDLE"),rs.getString("TEL_BACK"),rs.getString("BIRTH_YY"),
						rs.getString("BIRTH_MM"),rs.getString("BIRTH_DD")));
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
	public int updateUser(UserVo pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(UserSql.USER_UPDATE);
			ps.setString(1, pvo.getMember_id());
			ps.setString(2, pvo.getMember_pwd());
			ps.setLong(3, pvo.getMember_seq());
			row = ps.executeUpdate();
			System.out.println("UPDATE OK.. Seq::" + pvo.getMember_seq());
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
	public int deleteUser(UserVo pvo) {
		Connection conn = null;
		PreparedStatement ps = null;
		int row = 0;
		try {
			conn = commonDao.getConnection();
			ps = conn.prepareStatement(UserSql.USER_DELETE);
			ps.setLong(1, pvo.getMember_seq());
			row = ps.executeUpdate();
			System.out.println("DELETE OK.. Seq::" + pvo.getMember_seq());
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

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
         ps.setString(1, pvo.getMemberId());
         ps.setString(2, pvo.getMemberName());
         ps.setString(3, pvo.getMemberPwd());
         ps.setString(4, pvo.getMemberTel());
         ps.setString(5, pvo.getBirth());
         ps.setString(6, pvo.getGender());
         ps.setString(7, pvo.getEmail());
         ps.setString(8, pvo.getCreatedAt());
         ps.setString(9, pvo.getGrade());
         ps.setString(10, pvo.getDelFlag());
         ps.setDate(11, pvo.getDelDate());
         ps.setString(12, pvo.getCoupon());
         ps.setLong(13, pvo.getAccumulatedMoney());

         row = ps.executeUpdate();
         
         System.out.println("INSERT OK.. Seq::" + pvo.getMemberSeq());
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
         ps.setLong(1, pvo.getMemberSeq());
         rs = ps.executeQuery();
         if (rs.next()) {
            vo = new UserVo(rs.getLong("MEMBER_SEQ"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_NAME"), rs.getString("MEMBER_PWD"),
                  rs.getString("MEMBER_TEL"), rs.getString("BIRTH"), rs.getString("GENDER"), rs.getString("EMAIL"), rs.getString("CREATED_AT")
                  , rs.getString("GRADE"), rs.getString("DEL_FLAG"), rs.getDate("DEL_DATE"), rs.getString("COUPON"), rs.getLong("ACCUMULATED_MONEY"));
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
            list.add(new UserVo(rs.getLong("MEMBER_SEQ"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_NAME"), rs.getString("MEMBER_PWD"),
                    rs.getString("MEMBER_TEL"), rs.getString("BIRTH"), rs.getString("GENDER"), rs.getString("EMAIL"), rs.getString("CREATED_AT")
                    , rs.getString("GRADE"), rs.getString("DEL_FLAG"), rs.getDate("DEL_DATE"), rs.getString("COUPON"), rs.getLong("ACCUMULATED_MONEY")));
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
         ps.setString(1, pvo.getMemberName());
         ps.setString(2, pvo.getMemberPwd());
         ps.setString(3, pvo.getMemberTel());
         ps.setString(4, pvo.getBirth());
         ps.setString(5, pvo.getGender());
         ps.setString(6, pvo.getEmail());
         ps.setString(7, pvo.getCreatedAt());
         ps.setString(8, pvo.getGrade());
         ps.setString(9, pvo.getDelFlag());
         ps.setDate(10, pvo.getDelDate());
         ps.setString(11, pvo.getCoupon());
         ps.setLong(12, pvo.getAccumulatedMoney());
         row = ps.executeUpdate();
         System.out.println("UPDATE OK.. Seq::" + pvo.getMemberSeq());
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
         ps.setLong(1, pvo.getMemberSeq());
         row = ps.executeUpdate();
         System.out.println("DELETE OK.. Seq::" + pvo.getMemberSeq());
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
   
   public UserVo userLogin(UserVo pvo) {
      Connection conn = null;
      PreparedStatement ps = null;
      ResultSet rs = null;
      UserVo vo = null;
      try {
         conn = commonDao.getConnection();
         ps = conn.prepareStatement(UserSql.USER_LOGIN);
         ps.setString(1, pvo.getMemberId());
         rs = ps.executeQuery();
         if (rs.next()) {
            vo = new UserVo(rs.getLong("MEMBER_SEQ"), rs.getString("MEMBER_ID"), rs.getString("MEMBER_NAME"), rs.getString("MEMBER_PWD"),
                    rs.getString("MEMBER_TEL"), rs.getString("BIRTH"), rs.getString("GENDER"), rs.getString("EMAIL"), rs.getString("CREATED_AT")
                    , rs.getString("GRADE"), rs.getString("DEL_FLAG"), rs.getDate("DEL_DATE"), rs.getString("COUPON"), rs.getLong("ACCUMULATED_MONEY"));
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


}
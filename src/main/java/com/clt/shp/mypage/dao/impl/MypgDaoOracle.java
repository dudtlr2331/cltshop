package com.clt.shp.mypage.dao.impl;

import com.clt.cmm.dao.CommonDao;
import com.clt.cmm.dao.LogPreparedStatement;
import com.clt.shp.mypage.MypgVO;
import com.clt.shp.mypage.dao.MypgDao;
import com.clt.shp.mypage.sql.MypgSql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MypgDaoOracle implements MypgDao {
    private CommonDao commonDao;

    public MypgDaoOracle(){
        commonDao = new CommonDao();
    }
    @Override
    public List<MypgVO> selectMypageList(MypgVO pvo) {
        Connection conn = null;
        LogPreparedStatement ps = null;
        ResultSet rs = null;
        List<MypgVO> list = new ArrayList<MypgVO>();
        MypgVO vo = null;
        String sql = MypgSql.SELECT_LIST_MYPG;
        try {
            conn = commonDao.getConnection();
            ps = new LogPreparedStatement(conn, sql);
            ps.setString(1, pvo.getUsrId());
            System.out.println("=SQL=======================================================");
            System.out.println(ps);
            System.out.println("===========================================================");
            rs = ps.executeQuery();
            while (rs.next()) {
                vo = new MypgVO(
                    rs.getString(1)
                    ,rs.getString(2)
                    ,rs.getString(3)
                    ,rs.getString(4)
                    ,rs.getString(5)
                    ,rs.getLong(6)
                    ,rs.getString(7)
                    ,rs.getString(8)
                    ,rs.getString(9)
                    ,rs.getInt(10)
                    ,rs.getLong(11)
                    ,rs.getString(12)
                    ,rs.getString(13)
                    ,rs.getString(14)
                    ,rs.getLong(15)
                    ,rs.getString(16)
                    ,rs.getString(17)
                    ,rs.getString(18)
                    ,rs.getString(19)
                    ,rs.getString(20)
                );
                list.add(vo);
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
}

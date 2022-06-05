package com.clt.shp.mypage.dao;

import com.clt.shp.mypage.MypgVO;

import java.util.List;

public interface MypgDao {
    List<MypgVO> selectMypageList(MypgVO pvo);
}
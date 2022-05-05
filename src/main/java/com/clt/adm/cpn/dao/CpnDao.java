package com.clt.adm.cpn.dao;

import java.util.List;

import com.clt.shp.dress.DressVO;

public interface CpnDao {
	int insertDress(AdmCpnVO pvo);
	AdmCpnVO selectDressOne(AdmCpnVO pvo);
	List<AdmCpnVO> selectDressList(AdmCpnVO pvo);
	int updateDress(AdmCpnVO pvo);
	int deleteDress(AdmCpnVO pvo);
}
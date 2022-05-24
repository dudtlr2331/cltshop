package com.clt.shp.cpn.dao;

import java.util.List;

import com.clt.shp.cpn.CpnVO;

public interface CpnDao {
	int insertCpn(CpnVO pvo);
	CpnVO selectCpnOne(CpnVO pvo);
	List<CpnVO> selectCpnList(CpnVO pvo);
	int updateCpn(CpnVO pvo);
	int deleteCpn(CpnVO pvo);
}
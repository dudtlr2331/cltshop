package com.clt.adm.cpn.service;

import java.util.List;

import com.clt.adm.cpn.*;
import com.clt.shp.dress.DressVO;
import com.clt.shp.dress.dao.DressDao;

public class AdmCpnService {

	private AdmCpnVO service;
	
	public AdmCpnService(AdmCpnVO service) {
		this.service = service;
	}

	public AdmCpnVO selectUserOne(AdmCpnVO pvo) {
		return service.selectUserOne(pvo);
	}

	public List<AdmCpnVO> selectUserList(AdmCpnVO param) {
		return service.selectUserList(param);
	}
	
	public int insertCpn(AdmCpnVO pvo) {
		return service.insertCpn(pvo);
	}
	
	public int updateCpn(AdmCpnVO pvo) {
		return service.updateCpn(pvo);
	}
	
	public int deleteCpn(AdmCpnVO pvo) {
		return service.deleteCpn(pvo);
	}
}
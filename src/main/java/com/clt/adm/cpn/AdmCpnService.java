package com.clt.adm.cpn;

import java.util.List;

import com.clt.adm.cpn.*;

public class AdmCpnService {

	private AdmCpnDao service;
	
	public AdmCpnService(AdmCpnVoDao service) {
		this.service = service;
	}

	public AdmCpnVo selectUserOne(AdmCpnVo pvo) {
		return service.selectUser(pvo);
	}

	public List<AdmCpnVo> selectUserList(AdmCpnVo param) {
		return service.selectListUser(param);
	}
}
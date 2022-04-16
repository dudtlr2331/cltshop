package com.clt.shp.user.service;

import java.util.List;

import com.clt.shp.user.UserVo;
import com.clt.shp.user.dao.UserDao;

public class UserService {

	private UserDao service;
	
	public UserService(UserDao service) {
		this.service = service;
	}

	public UserVo selectUserOne(UserVo pvo) {
		return service.selectUser(pvo);
	}

	public List<UserVo> selectUserList(UserVo param) {
		return service.selectListUser(param);
	}
	
	public int updateUser(UserVo pvo) {
		return service.updateUser(pvo);
	}
}

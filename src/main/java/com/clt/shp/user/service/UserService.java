package com.clt.shp.user.service;

import java.util.List;

import com.clt.shp.user.UserVO;
import com.clt.shp.user.dao.UserDao;

public class UserService {

	private UserDao service;
	
	public UserService(UserDao service) {
		this.service = service;
	}

	public UserVO selectUserOne(UserVO pvo) {
		return service.selectUser(pvo);
	}

	public List<UserVO> selectUserList(UserVO param) {
		return service.selectListUser(param);
	}
	
	public int updateUser(UserVO pvo) {
		return service.updateUser(pvo);
	}
}

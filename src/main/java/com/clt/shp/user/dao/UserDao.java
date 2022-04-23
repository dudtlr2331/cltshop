package com.clt.shp.user.dao;

import java.util.List;

import com.clt.shp.user.UserVO;

public interface UserDao {
	int insertUser(UserVO pvo);
	UserVO selectUser(UserVO pvo);
	List<UserVO> selectListUser(UserVO pvo);
	int updateUser(UserVO pvo);
	int deleteUser(UserVO pvo);
}

package com.clt.shp.user.dao;

import java.util.List;

import com.clt.shp.user.UserVo;

public interface UserDao {
	int insertUser(UserVo pvo);
	UserVo selectUser(UserVo pvo);
	List<UserVo> selectListUser(UserVo pvo);
	int updateUser(UserVo pvo);
	int deleteUser(UserVo pvo);
}

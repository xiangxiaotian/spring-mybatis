package org.study.spring_mybatis.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.study.spring_mybatis.usermag.beans.Pager;
import org.study.spring_mybatis.usermag.beans.UserInfo;

public interface UserMapper {
	public int saveUserInfo(UserInfo user);
	public int updateUserInfo(UserInfo user);
	public int deleteUserInfo(Long id);
	public UserInfo getUserInfoById(Long id);
	public int batchSaveUserInfo(@Param("users") List<UserInfo> users);
	public int countUserListByMapToPager(@Param("map")Map map);
	public List<UserInfo> getUserListByMapToPager(@Param("map")Map map);
}

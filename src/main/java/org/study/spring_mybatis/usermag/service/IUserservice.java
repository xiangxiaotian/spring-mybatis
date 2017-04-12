package org.study.spring_mybatis.usermag.service;

import java.util.List;
import java.util.Map;

import org.study.spring_mybatis.usermag.beans.Pager;
import org.study.spring_mybatis.usermag.beans.UserInfo;

public interface IUserservice {
	public int saveUserInfo(UserInfo user);
	public int updateUserInfo(UserInfo user);
	public int deleteUserInfo(Long id);
	public UserInfo getUserInfoById(Long id);
	public int batchSaveUserInfo(List<UserInfo> users);
	public int countUserListByMapToPager(Map map);
	public Pager getUserListByMapToPager(Map map);
}

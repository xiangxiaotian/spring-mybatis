package org.study.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.study.spring_mybatis.usermag.beans.Pager;
import org.study.spring_mybatis.usermag.beans.UserInfo;
import org.study.spring_mybatis.usermag.dao.IUserDao;
import org.study.spring_mybatis.usermag.service.IUserservice;
@Service
public class UserServiceImpl implements IUserservice {
	@Resource
	private IUserDao userdaoImpl;
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userdaoImpl.saveUserInfo(user);
	}

	public int updateUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userdaoImpl.updateUserInfo(user);
	}

	public int deleteUserInfo(Long id) {
		// TODO Auto-generated method stub
		return userdaoImpl.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userdaoImpl.getUserInfoById(id);
	}

	public int batchSaveUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return userdaoImpl.batchSaveUserInfo(users);
	}

	public int countUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return userdaoImpl.countUserListByMapToPager(map);
	}

	public Pager getUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return userdaoImpl.getUserListByMapToPager(map);
	}
	
}

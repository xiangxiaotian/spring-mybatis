package org.study.spring_mybatis.usermag.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.study.spring_mybatis.usermag.beans.Pager;
import org.study.spring_mybatis.usermag.beans.UserInfo;
import org.study.spring_mybatis.usermag.dao.IUserDao;
import org.study.spring_mybatis.usermag.mapper.UserMapper;
@Repository
public class UserDaoImpl implements IUserDao{
	private UserMapper um;
	public void getSession(SqlSession session){
		um = session.getMapper(UserMapper.class);//取得接口的实例
	}
	public int saveUserInfo(UserInfo user) {
		//获得会话连接对象
		return um.saveUserInfo(user);
	}

	public int updateUserInfo(UserInfo user) {
		return um.updateUserInfo(user);
	}

	public int deleteUserInfo(Long id) {
		return um.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(Long id) {
		return um.getUserInfoById(id);
	}
	public int batchSaveUserInfo(List<UserInfo> users) {
		return um.batchSaveUserInfo(users);
	}
	public int countUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		return um.countUserListByMapToPager(map);
	}
	public Pager getUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		Pager pager=new Pager();
		List<UserInfo> data=new ArrayList<UserInfo>();
		data=um.getUserListByMapToPager(map);
		pager.setData(data);
		pager.setRows(new Integer((Integer) map.get("rows")));
		pager.setTotalRows(um.countUserListByMapToPager(map));
		pager.setPage(new Integer((Integer) map.get("page")));
		return pager;
	}
}

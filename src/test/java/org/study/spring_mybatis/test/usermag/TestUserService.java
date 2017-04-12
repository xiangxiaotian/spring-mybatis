package org.study.spring_mybatis.test.usermag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.spring_mybatis.usermag.beans.Pager;
import org.study.spring_mybatis.usermag.beans.UserInfo;
import org.study.spring_mybatis.usermag.service.IUserservice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	@Resource
	private IUserservice userInfoServiceImpl;
	@Ignore
	public void tsetSaveUserInfo(){
		UserInfo user = new UserInfo(null, "小妹", "123456", 18);
		userInfoServiceImpl.saveUserInfo(user);
		System.out.println(user);
	}
	@Ignore
	public void testUpdateUserInfo(){
		UserInfo user = new UserInfo(4L, "长大了", "123456", 18);
		userInfoServiceImpl.updateUserInfo(user);
		System.out.println(user);
	}
	@Ignore
	public void testDeleteUserInfo(){
		UserInfo user = new UserInfo(4L, "长大了", "123456", 18);
		userInfoServiceImpl.deleteUserInfo(2l);
		System.out.println(user);
	}
	@Ignore
	public void testGetUserInfoById(){
		UserInfo user = userInfoServiceImpl.getUserInfoById(3l);
		System.out.println(user);
	}
	@Ignore
	public void testbatchSaveUserInfo(){
		List<UserInfo> users = new ArrayList<UserInfo>();
		UserInfo user = new UserInfo(null,"小马","d","13456",20);
		try {
			UserInfo user2 = (UserInfo) user.clone();
			user2.setLoginName("e");
			UserInfo user3 = (UserInfo) user.clone();
			user3.setLoginName("f");
			UserInfo user4 = (UserInfo) user.clone();
			user4.setLoginName("g");
			
			users.add(user4);
			users.add(user3);
			users.add(user2);
			users.add(user);
			
			int rows = userInfoServiceImpl.batchSaveUserInfo(users);
			Assert.assertEquals(4, rows);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetUserListByMapToPager(){
		int page=2;
		int rows=5;
		String userName = "小";
		String loginName = "a";
		int index = (page-1) * rows;
		Map map = new HashMap();
		map.put("page", page);
		map.put("index", index);
		map.put("rows", rows);
		map.put("userName", userName);
		map.put("loginName", loginName);
		Pager pager = userInfoServiceImpl.getUserListByMapToPager(map);
		System.out.println(pager);
	}
	
}

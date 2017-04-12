package org.study.spring_mybatis.usermag.beans;

import java.io.Serializable;

public class UserInfo implements Serializable,Cloneable{
	private Long id;
	private String userName;
	private String loginName;
	private String pwd;
	private int age;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(Long id, String userName, String pwd, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
		this.age = age;
	}
	
	public UserInfo(Long id, String userName, String loginName, String pwd, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.loginName = loginName;
		this.pwd = pwd;
		this.age = age;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", loginName=" + loginName + ", pwd=" + pwd + ", age="
				+ age + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

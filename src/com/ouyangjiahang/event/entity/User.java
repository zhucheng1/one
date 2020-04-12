package com.ouyangjiahang.event.entity;
/**
 * 用户实体
 * @author 欧阳佳航
 *
 */
public class User {
	private int id;//用户名
	private String userName;//用户名
	private String password;//用户密码
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	 
	
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}

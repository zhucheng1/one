package com.ouyangjiahang.event.entity;
/**
 * �û�ʵ��
 * @author ŷ���Ѻ�
 *
 */
public class User {
	private int id;//�û���
	private String userName;//�û���
	private String password;//�û�����
	
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

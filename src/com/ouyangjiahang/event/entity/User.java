package com.ouyangjiahang.event.entity;
/**
 * �����û�ʵ��
 * @author ŷ���Ѻ�
 *
 */
public class User {
	
	//�û�����
	private int id;
	
	
	//�û���
	private String userName;
	
	//�û�����
	private String password;
	
	//�û�����
	private String email;
	
	//�û��ֻ�
	private String phone;
	


	public User() {
		super();
		
	}
	
	public User(String userName, String password,String email,String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.email=email;
		this.phone=phone;
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	 
	public User(String userName) {
		super();
		this.userName = userName;
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
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

package com.ouyangjiahang.event.controller;

import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.service.LoginService;
import com.ouyangjiahang.event.view.LoginInterface;
/**
 * ��ͨ�û���¼
 * @author ŷ���Ѻ�
 *
 */
public class LoginControl {
	
	LoginService l=new LoginService();
	public void loginControl(){
		String userName=LoginInterface.userName;
		String password=LoginInterface.password;
		
		//��װһ������������ѯ
		User user=new User(userName,password);
		
	l.login(user,userName,password);
	
	}
	
	/**
	 * ����Ա��¼
	 */
	public void loginControl2(){
		String userName=LoginInterface.userName;
		String password=LoginInterface.password;
		
		//��װһ������������ѯ
		User user=new User(userName,password);
		
	l.login2(user,userName,password);
	
	}
	public static void main(String[] agrs) {
		
		  //����һ��ʵ��������
		  new LoginControl();  
	  }
}

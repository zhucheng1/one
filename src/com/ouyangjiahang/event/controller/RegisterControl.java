package com.ouyangjiahang.event.controller;

import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.service.RegisterService;
import com.ouyangjiahang.event.view.RegisterInterface;
/**
 * ע�ᴦ�����
 * @author ŷ���Ѻ�
 *
 */
public class RegisterControl {
	RegisterService r=new RegisterService();
	public void registerControl(){
		String userName=RegisterInterface.userName;
		String password=RegisterInterface.password;
		String email=RegisterInterface.email;
		String phone=RegisterInterface.phone;
		
		//��װһ������������ѯ�û��Ƿ��ѱ�ע��
		User user1=new User(userName);
		
		//��װһ�����������洢
		User user=new User(userName,password,email,phone);
		
	r.register(user,user1,userName,password,email, phone);
	
	}
	public static void main(String[] agrs) {
		
		  //����һ��ʵ��������
		  new RegisterControl();  
	  }
}

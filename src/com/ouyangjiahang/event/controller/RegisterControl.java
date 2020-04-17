package com.ouyangjiahang.event.controller;

import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.service.RegisterService;
import com.ouyangjiahang.event.view.RegisterInterface;
/**
 * 注册处理控制
 * @author 欧阳佳航
 *
 */
public class RegisterControl {
	RegisterService r=new RegisterService();
	public void registerControl(){
		String userName=RegisterInterface.userName;
		String password=RegisterInterface.password;
		String email=RegisterInterface.email;
		String phone=RegisterInterface.phone;
		
		//封装一个对象用来查询用户是否已被注册
		User user1=new User(userName);
		
		//封装一个对象用来存储
		User user=new User(userName,password,email,phone);
		
	r.register(user,user1,userName,password,email, phone);
	
	}
	public static void main(String[] agrs) {
		
		  //创建一个实例化对象
		  new RegisterControl();  
	  }
}

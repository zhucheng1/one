package com.ouyangjiahang.event.controller;

import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.service.LoginService;
import com.ouyangjiahang.event.view.LoginInterface;
/**
 * 普通用户登录
 * @author 欧阳佳航
 *
 */
public class LoginControl {
	
	LoginService l=new LoginService();
	public void loginControl(){
		String userName=LoginInterface.userName;
		String password=LoginInterface.password;
		
		//封装一个对象用来查询
		User user=new User(userName,password);
		
	l.login(user,userName,password);
	
	}
	
	/**
	 * 管理员登录
	 */
	public void loginControl2(){
		String userName=LoginInterface.userName;
		String password=LoginInterface.password;
		
		//封装一个对象用来查询
		User user=new User(userName,password);
		
	l.login2(user,userName,password);
	
	}
	public static void main(String[] agrs) {
		
		  //创建一个实例化对象
		  new LoginControl();  
	  }
}

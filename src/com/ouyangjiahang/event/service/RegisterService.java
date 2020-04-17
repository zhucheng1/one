package com.ouyangjiahang.event.service;

import java.awt.event.ActionEvent;
import java.sql.Connection;

import javax.swing.JOptionPane;

import com.ouyangjiahang.event.dao.UserDao;
import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.util.DbUtil;
import com.ouyangjiahang.event.util.StringUtil;

public class RegisterService {
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();

	 /**
	   * 注册事件处理方法
	   */
	public void register(User user,User user1,String userName,String password,String email,String phone){
		  
		
			
			//判断输入是否为空
			if(StringUtil.isEmpty(userName)) {
				JOptionPane.showMessageDialog(null,"用户名不能为空！");
				return;
			}
			if(StringUtil.isEmpty(password)) {
				JOptionPane.showMessageDialog(null,"密码不能为空！");
				return;
			}
			if(StringUtil.isEmpty(email)) {
				JOptionPane.showMessageDialog(null,"邮箱不能为空！");
				return;
			}
				if(StringUtil.isEmpty(phone)) {
					JOptionPane.showMessageDialog(null,"手机号不能为空！");
					return;
				}
				Connection con=null;
				try {
					
					//获得一个数据库的连接
					con=dbUtil.getCon();
					
					//判断该用户名是否存在
					User currentUser=userDao.register1(con, user1);
					if(currentUser!=null) {
						JOptionPane.showMessageDialog(null,"该用户名已存在");
					}else {
						userDao.register2(con, user);
						JOptionPane.showMessageDialog(null,"注册成功！");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
}
}
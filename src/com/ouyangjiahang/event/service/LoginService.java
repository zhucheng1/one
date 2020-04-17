package com.ouyangjiahang.event.service;

import java.sql.Connection;

import javax.swing.JOptionPane;

import com.ouyangjiahang.event.dao.UserDao;
import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.util.DbUtil;
import com.ouyangjiahang.event.util.StringUtil;
import com.ouyangjiahang.event.view.MainInterface;
import com.ouyangjiahang.event.view.RegisterInterface;
/**
 * 登录事件处理方法
 * @author 欧阳佳航
 *
 */

//普通用户登录
public class LoginService {
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
     public void login(User user,String userName,String password){
    	 if(StringUtil.isEmpty(userName)) {
 			JOptionPane.showMessageDialog(null,"用户名不能为空！");
 			return;
 		}
 		if(StringUtil.isEmpty(password)) {
 			JOptionPane.showMessageDialog(null,"密码不能为空！");
 			return;
     }
 
		Connection con=null;
		try {
			
			//获得一个数据库的连接
			con=dbUtil.getCon();
			
			User currentUser=userDao.login(con, user);
			if(currentUser!=null) {
				JOptionPane.showMessageDialog(null,"登录成功");
				 dispose();
				new MainInterface().setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"用户名或者密码错误！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
     
     private void dispose() {
		// TODO Auto-generated method stub
		
	}

	//管理员登录
     public void login2(User user,String userName,String password){
    	 if(StringUtil.isEmpty(userName)) {
 			JOptionPane.showMessageDialog(null,"用户名不能为空！");
 			return;
 		}
 		if(StringUtil.isEmpty(password)) {
 			JOptionPane.showMessageDialog(null,"密码不能为空！");
 			return;
     }
 
		Connection con=null;
		try {
			
			//获得一个数据库的连接
			con=dbUtil.getCon();
			
			User currentUser=userDao.login2(con, user);
			if(currentUser!=null) {
				JOptionPane.showMessageDialog(null,"登录成功");
			}else {
				JOptionPane.showMessageDialog(null,"用户名或者密码错误！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
}
package com.ouyangjiahang.event.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ouyangjiahang.event.entity.User;


public class UserDao{
	/**
	 * 登录验证方法
	 * @param con
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User login(Connection con,User user)throws Exception{
		User resultUser=null;
		String sql="select * form t_user where userName=? and password=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			resultUser=new User();
			resultUser.setId(rs.getInt("id"));
			resultUser.setUsername(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		
		
		return resultUser;
	
	}
}

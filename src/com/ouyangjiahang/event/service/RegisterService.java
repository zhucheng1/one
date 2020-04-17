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
	   * ע���¼�������
	   */
	public void register(User user,User user1,String userName,String password,String email,String phone){
		  
		
			
			//�ж������Ƿ�Ϊ��
			if(StringUtil.isEmpty(userName)) {
				JOptionPane.showMessageDialog(null,"�û�������Ϊ�գ�");
				return;
			}
			if(StringUtil.isEmpty(password)) {
				JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�");
				return;
			}
			if(StringUtil.isEmpty(email)) {
				JOptionPane.showMessageDialog(null,"���䲻��Ϊ�գ�");
				return;
			}
				if(StringUtil.isEmpty(phone)) {
					JOptionPane.showMessageDialog(null,"�ֻ��Ų���Ϊ�գ�");
					return;
				}
				Connection con=null;
				try {
					
					//���һ�����ݿ������
					con=dbUtil.getCon();
					
					//�жϸ��û����Ƿ����
					User currentUser=userDao.register1(con, user1);
					if(currentUser!=null) {
						JOptionPane.showMessageDialog(null,"���û����Ѵ���");
					}else {
						userDao.register2(con, user);
						JOptionPane.showMessageDialog(null,"ע��ɹ���");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
}
}
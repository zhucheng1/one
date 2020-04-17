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
 * ��¼�¼�������
 * @author ŷ���Ѻ�
 *
 */

//��ͨ�û���¼
public class LoginService {
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
     public void login(User user,String userName,String password){
    	 if(StringUtil.isEmpty(userName)) {
 			JOptionPane.showMessageDialog(null,"�û�������Ϊ�գ�");
 			return;
 		}
 		if(StringUtil.isEmpty(password)) {
 			JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�");
 			return;
     }
 
		Connection con=null;
		try {
			
			//���һ�����ݿ������
			con=dbUtil.getCon();
			
			User currentUser=userDao.login(con, user);
			if(currentUser!=null) {
				JOptionPane.showMessageDialog(null,"��¼�ɹ�");
				 dispose();
				new MainInterface().setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null,"�û��������������");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
     
     private void dispose() {
		// TODO Auto-generated method stub
		
	}

	//����Ա��¼
     public void login2(User user,String userName,String password){
    	 if(StringUtil.isEmpty(userName)) {
 			JOptionPane.showMessageDialog(null,"�û�������Ϊ�գ�");
 			return;
 		}
 		if(StringUtil.isEmpty(password)) {
 			JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�");
 			return;
     }
 
		Connection con=null;
		try {
			
			//���һ�����ݿ������
			con=dbUtil.getCon();
			
			User currentUser=userDao.login2(con, user);
			if(currentUser!=null) {
				JOptionPane.showMessageDialog(null,"��¼�ɹ�");
			}else {
				JOptionPane.showMessageDialog(null,"�û��������������");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
}
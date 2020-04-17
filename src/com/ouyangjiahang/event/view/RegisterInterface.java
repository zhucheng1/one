package com.ouyangjiahang.event.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.ouyangjiahang.event.controller.LoginControl;
import com.ouyangjiahang.event.controller.RegisterControl;
import com.ouyangjiahang.event.dao.UserDao;
import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.service.RegisterService;
import com.ouyangjiahang.event.util.DbUtil;
import com.ouyangjiahang.event.util.StringUtil;

public class RegisterInterface extends JFrame {
	JTextField userNameTxt,emailTxt,phoneTxt;
	JPasswordField passwordTxt;
	Connection con;
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
	public static String userName,password,email,phone;
	RegisterService r=new RegisterService();
	public RegisterInterface() {
		//���ô��ڵı���
		  setTitle("ע�����"); 
		 
		  //���ô��ڵĳߴ�
		  setSize(550,500); 
		  
		  //���ô��ڿɼ�
		  setVisible(true);
		  
		  //���ô�������Ļ����
		  setLocationRelativeTo(null);
		  
		  //���õ��X��ʱ���رճ���
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		    //����һ�����
		    JPanel panel = new JPanel();
		    
		    //����Ϊ���Բ���
			panel.setLayout(null);
			
			//������ͼ�ɼ�
			this.setVisible(true);
			
			//�����û�����ǩ
			JLabel label1 = new JLabel("�û���");  
			JLabel label3 = new JLabel("�� ��");
			JLabel label4 = new JLabel("�ֻ���");
			//�����û�����ǩ��λ�ô�С
			label1.setBounds(100, 65, 50, 50); 
			label3.setBounds(100, 165, 50, 50);
			label4.setBounds(100, 215, 50, 50);
			//�����ı�����
			label1.setFont(new Font("����", Font.BOLD, 15));
			label3.setFont(new Font("����", Font.BOLD, 15));
			label4.setFont(new Font("����", Font.BOLD, 15));
			
			JLabel label2 = new JLabel("�� ��");     
			label2.setBounds(100, 115, 50, 50);   
			label2.setFont(new Font("����", Font.BOLD, 15));
			
			//�����û����ı����䳤��
			 userNameTxt = new JTextField(16);
			 emailTxt = new JTextField(16);
			 phoneTxt = new JTextField(16);
			
			userNameTxt.setBounds(150, 80, 250, 20);
		    passwordTxt = new JPasswordField(16);
			passwordTxt.setBounds(150, 130, 250, 20);
			emailTxt.setBounds(150, 180, 250, 20);
			phoneTxt.setBounds(150, 230, 250, 20);
			
			JButton registerButton = new JButton("ע ��"); 
			registerButton.setBounds(100, 320, 120, 50);
			registerButton.setFont(new Font("����", Font.BOLD, 15));
			JButton cancelButton = new JButton("�� ��"); 
			cancelButton.setBounds(280, 320, 120, 50);
			cancelButton.setFont(new Font("����", Font.BOLD, 15));
			
			
			//�������ӵ����panel
			panel.add(label1);
			panel.add(userNameTxt);
			panel.add(passwordTxt);
			panel.add(emailTxt);
			panel.add(phoneTxt);
			panel.add(label2);
			panel.add(label3);
			panel.add(label4);
			panel.add(registerButton);
			panel.add(cancelButton);
			
			//ʵ�����panel
			this.add(panel);
			
			//������ͼ�ɼ�
			this.setVisible(true);
			
			//����ע�ᰴť�ļ����¼�
			registerButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					registerActionPerformed(e);
				}
			});
			//ȡ����ť�ļ����¼�
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

                    dispose();

           }
			});
	}
	 /**
	   * ע���¼�������
	   */
	private void registerActionPerformed(ActionEvent evt) {
		  
		  //��ȡ�ı����������
		   userName=this.userNameTxt.getText();
		   email=this.emailTxt.getText();
		   phone=this.phoneTxt.getText();
		  password=new String(this.passwordTxt.getPassword());
		  
		  RegisterControl r=new RegisterControl();
		   r.registerControl();
	}
	
	public static void main(String[] agrs) {
		
		  //����һ��ʵ��������
		  new RegisterInterface();  
	  }
}




package com.ouyangjiahang.event.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.ouyangjiahang.event.controller.LoginControl;
import com.ouyangjiahang.event.dao.UserDao;
import com.ouyangjiahang.event.util.DbUtil;
/**
 * ��¼�������ͼ
 * @author ŷ���Ѻ�
 *
 */
public class LoginInterface extends JFrame {
	JPanel panel;
	JLabel label1,label2,label3;
	JButton loginButton1,loginButton2,registerButton;
	JTextField userNameTxt;
	JPasswordField passwordTxt;
	public static String userName;
	public static String password;
	LoginControl l=new LoginControl();
  public LoginInterface()
  {
	  //���ô��ڵı���
	  setTitle("��¼����"); 
	 
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
		
		//�����û�����ǩ
		label1 = new JLabel("�û���");  
		
		//�����û�����ǩ��λ�ô�С
		label1.setBounds(100, 105, 50, 50);  
		
		//�����ı�����
		label1.setFont(new Font("����", Font.BOLD, 15));
		
		label2 = new JLabel("�� ��");     
		label2.setBounds(100, 155, 50, 50);     
		label2.setFont(new Font("����", Font.BOLD, 15));
		label3 = new JLabel("Ӣ������������Ʊ����");     
		label3.setBounds(150, 48, 300, 60);  
		label3.setFont(new Font("����", Font.BOLD, 20));
		
		
		
	/*	//�����������б��ѡ��
        cmb.addItem("-��ѡ��-");    
        cmb.addItem("��ͨ�û�");     
        cmb.addItem("����Ա");      
        
        cmb.setBounds(160, 65, 75, 25);*/
        
        //���õ�¼��ť
		loginButton1 = new JButton("�û���¼");   
		loginButton1.setBounds(90, 300, 100, 50);  
		
		//���õ�¼��ť�ļ����¼�
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});
		
		
		loginButton2 = new JButton("����Ա��¼");   
	    loginButton2.setBounds(205, 300, 100, 50);  
				
		//���õ�¼��ť�ļ����¼�
		loginButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		loginActionPerformed2(e);
					}
				});
		
		registerButton = new JButton("ע���˺�"); 
		registerButton.setBounds(320, 300, 100, 50); 
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//registerButtonPerformed(e);
			}
		});
		
		//�����û����ı����䳤��
		userNameTxt = new JTextField(16);
		
		userNameTxt.setBounds(150, 120, 250, 20);
		passwordTxt = new JPasswordField(16);
		passwordTxt.setBounds(150, 170, 250, 20);
		
		//�������ӵ����panel
		panel.add(label1);
		panel.add(userNameTxt);
		panel.add(label2);
		panel.add(label3);
		panel.add(passwordTxt);
		panel.add(loginButton1);
		panel.add(loginButton2);
		panel.add(registerButton);
		
		
		//ʵ�����panel
		this.add(panel);
		
		//������ͼ�ɼ�
		this.setVisible(true);
		
		//���ע�ᵯ��ע�����
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterInterface().setVisible(true);
			}
		});
  }

  
  private void loginActionPerformed(ActionEvent evt) {
	     
	     //��ȡ�ı����������
	     userName=this.userNameTxt.getText();
		 password=new String(this.passwordTxt.getPassword());
		 	
	   LoginControl l=new LoginControl();
	   l.loginControl();
  }
		
  private void loginActionPerformed2(ActionEvent evt) {
	     
	     //��ȡ�ı����������
	     userName=this.userNameTxt.getText();
		 password=new String(this.passwordTxt.getPassword());
		 		
	   LoginControl l=new LoginControl();
	   l.loginControl2();
}
  
public static void main(String[] agrs) {
	
	  //����һ��ʵ��������
	  new LoginInterface();  
  }
}

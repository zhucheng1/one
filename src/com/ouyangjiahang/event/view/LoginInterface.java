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
 * 登录界面的视图
 * @author 欧阳佳航
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
	  //设置窗口的标题
	  setTitle("登录界面"); 
	 
	  //设置窗口的尺寸
	  setSize(550,500); 
	  
	  //设置窗口可见
	  setVisible(true);
	  
	  //设置窗口在屏幕中央
	  setLocationRelativeTo(null);
	  
	  //设置点击X的时候会关闭程序
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	    //建立一个面板
	    JPanel panel = new JPanel();
	    
	    //设置为绝对布局
		panel.setLayout(null);
		
		//设置用户名标签
		label1 = new JLabel("用户名");  
		
		//设置用户名标签的位置大小
		label1.setBounds(100, 105, 50, 50);  
		
		//设置文本字体
		label1.setFont(new Font("宋体", Font.BOLD, 15));
		
		label2 = new JLabel("密 码");     
		label2.setBounds(100, 155, 50, 50);     
		label2.setFont(new Font("宋体", Font.BOLD, 15));
		label3 = new JLabel("英雄联盟赛事售票程序");     
		label3.setBounds(150, 48, 300, 60);  
		label3.setFont(new Font("宋体", Font.BOLD, 20));
		
		
		
	/*	//设置向下拉列表的选项
        cmb.addItem("-请选择-");    
        cmb.addItem("普通用户");     
        cmb.addItem("管理员");      
        
        cmb.setBounds(160, 65, 75, 25);*/
        
        //设置登录按钮
		loginButton1 = new JButton("用户登录");   
		loginButton1.setBounds(90, 300, 100, 50);  
		
		//设置登录按钮的监听事件
		loginButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});
		
		
		loginButton2 = new JButton("管理员登录");   
	    loginButton2.setBounds(205, 300, 100, 50);  
				
		//设置登录按钮的监听事件
		loginButton2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		loginActionPerformed2(e);
					}
				});
		
		registerButton = new JButton("注册账号"); 
		registerButton.setBounds(320, 300, 100, 50); 
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//registerButtonPerformed(e);
			}
		});
		
		//设置用户名文本框及其长度
		userNameTxt = new JTextField(16);
		
		userNameTxt.setBounds(150, 120, 250, 20);
		passwordTxt = new JPasswordField(16);
		passwordTxt.setBounds(150, 170, 250, 20);
		
		//把组件添加到面板panel
		panel.add(label1);
		panel.add(userNameTxt);
		panel.add(label2);
		panel.add(label3);
		panel.add(passwordTxt);
		panel.add(loginButton1);
		panel.add(loginButton2);
		panel.add(registerButton);
		
		
		//实现面板panel
		this.add(panel);
		
		//设置视图可见
		this.setVisible(true);
		
		//点击注册弹出注册界面
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RegisterInterface().setVisible(true);
			}
		});
  }

  
  private void loginActionPerformed(ActionEvent evt) {
	     
	     //获取文本框里的内容
	     userName=this.userNameTxt.getText();
		 password=new String(this.passwordTxt.getPassword());
		 	
	   LoginControl l=new LoginControl();
	   l.loginControl();
  }
		
  private void loginActionPerformed2(ActionEvent evt) {
	     
	     //获取文本框里的内容
	     userName=this.userNameTxt.getText();
		 password=new String(this.passwordTxt.getPassword());
		 		
	   LoginControl l=new LoginControl();
	   l.loginControl2();
}
  
public static void main(String[] agrs) {
	
	  //创建一个实例化对象
	  new LoginInterface();  
  }
}

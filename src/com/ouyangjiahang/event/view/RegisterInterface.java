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
		//设置窗口的标题
		  setTitle("注册界面"); 
		 
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
			
			//设置视图可见
			this.setVisible(true);
			
			//设置用户名标签
			JLabel label1 = new JLabel("用户名");  
			JLabel label3 = new JLabel("邮 箱");
			JLabel label4 = new JLabel("手机号");
			//设置用户名标签的位置大小
			label1.setBounds(100, 65, 50, 50); 
			label3.setBounds(100, 165, 50, 50);
			label4.setBounds(100, 215, 50, 50);
			//设置文本字体
			label1.setFont(new Font("宋体", Font.BOLD, 15));
			label3.setFont(new Font("宋体", Font.BOLD, 15));
			label4.setFont(new Font("宋体", Font.BOLD, 15));
			
			JLabel label2 = new JLabel("密 码");     
			label2.setBounds(100, 115, 50, 50);   
			label2.setFont(new Font("宋体", Font.BOLD, 15));
			
			//设置用户名文本框及其长度
			 userNameTxt = new JTextField(16);
			 emailTxt = new JTextField(16);
			 phoneTxt = new JTextField(16);
			
			userNameTxt.setBounds(150, 80, 250, 20);
		    passwordTxt = new JPasswordField(16);
			passwordTxt.setBounds(150, 130, 250, 20);
			emailTxt.setBounds(150, 180, 250, 20);
			phoneTxt.setBounds(150, 230, 250, 20);
			
			JButton registerButton = new JButton("注 册"); 
			registerButton.setBounds(100, 320, 120, 50);
			registerButton.setFont(new Font("宋体", Font.BOLD, 15));
			JButton cancelButton = new JButton("返 回"); 
			cancelButton.setBounds(280, 320, 120, 50);
			cancelButton.setFont(new Font("宋体", Font.BOLD, 15));
			
			
			//把组件添加到面板panel
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
			
			//实现面板panel
			this.add(panel);
			
			//设置视图可见
			this.setVisible(true);
			
			//设置注册按钮的监听事件
			registerButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					registerActionPerformed(e);
				}
			});
			//取消按钮的监听事件
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

                    dispose();

           }
			});
	}
	 /**
	   * 注册事件处理方法
	   */
	private void registerActionPerformed(ActionEvent evt) {
		  
		  //获取文本框里的内容
		   userName=this.userNameTxt.getText();
		   email=this.emailTxt.getText();
		   phone=this.phoneTxt.getText();
		  password=new String(this.passwordTxt.getPassword());
		  
		  RegisterControl r=new RegisterControl();
		   r.registerControl();
	}
	
	public static void main(String[] agrs) {
		
		  //创建一个实例化对象
		  new RegisterInterface();  
	  }
}




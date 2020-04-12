package com.ouyangjiahang.event.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.ouyangjiahang.event.dao.UserDao;
import com.ouyangjiahang.event.entity.User;
import com.ouyangjiahang.event.util.DbUtil;
import com.ouyangjiahang.event.util.StringUtil;
/**
 * 登录界面的视图
 * @author 欧阳佳航
 *
 */
public class LoginInterface extends JFrame {
	JPanel panel;
	JLabel label1,label2,label3;
	JButton loginButton,registerButton;
	JTextField userNameTxt;
	JPasswordField passwordTxt;
	private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();	
	
  public LoginInterface()
  {
	  
	  setTitle("登录界面");   //设置窗口的标题
	  setSize(550,500);     //设置窗口的尺寸
	  setVisible(true);    //设置窗口可见
	  setLocationRelativeTo(null);//设置窗口在屏幕中央
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击X的时候会关闭程序
	  
	    JPanel panel = new JPanel();//建立一个面板
		panel.setLayout(null);//设置为绝对布局
		label1 = new JLabel("用户名");   //设置用户名标签
		label1.setBounds(100, 100, 50, 50);  //设置用户名标签的位置大小
		label2 = new JLabel("密   码");     //设置密码标签
		label2.setBounds(100, 150, 50, 50);     //设置密码标签的位置大小
		label3 = new JLabel("用户类型");     //设置用户类型标签
		label3.setBounds(100, 50, 75, 50);  //设置用户类型标签的位置大小
		JComboBox cmb=new JComboBox();    //创建下拉列表
		
        cmb.addItem("-请选择-");    //设置向下拉列表的选项
        cmb.addItem("普通用户");     
        cmb.addItem("管理员");      
        cmb.setBounds(160, 65, 75, 25);//设置下拉列表的位置大小
		loginButton = new JButton("登录");   //设置登录按钮
		loginButton.setBounds(100, 300, 120, 50);  //设置登录按钮的位置大小
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});//设置登录按钮的监听事件
		
		registerButton = new JButton("注册账号"); //设置注册账号按钮
		registerButton.setBounds(300, 300, 120, 50); //设置注册账号按钮的位置大小
		//registerButton.addActionListener(this);//“设置注册账号”按钮的监听事件
		
		userNameTxt = new JTextField(16);//设置用户名文本框的长度
		userNameTxt.setBounds(150, 120, 250, 20);//设置用户名文本框的位置和大小
		passwordTxt = new JPasswordField(16);//设置密码框
		passwordTxt.setBounds(150, 170, 250, 20);//设置密码框的位置大小
		
		panel.add(label1);//把组件添加到面板panel
		panel.add(userNameTxt);
		panel.add(label2);
		panel.add(label3);
		panel.add(passwordTxt);
		panel.add(loginButton);
		panel.add(registerButton);
		panel.add(cmb);
		
		this.add(panel);//实现面板panel		
		this.setVisible(true);//设置视图可见
  }
  /**
   * 登录事件处理
   */
  private void loginActionPerformed(ActionEvent evt) {
	  
	    String userName=this.userNameTxt.getText();//获取文本框里的内容
		String password=new String(this.passwordTxt.getPassword());
		
		if(StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null,"用户名不能为空！");
			return;
		}
		if(StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null,"密码不能为空！");
			return;
		}
		
		User user=new User(userName,password);//封装一个对象用来查询
		Connection con=null;
		try {
			con=(Connection)dbUtil.getCon();//获得一个数据库的连接
			User currentUser=userDao.login(con, user);
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
  
public static void main(String[] agrs) {
	  new LoginInterface();  //创建一个实例化对象
  }
}

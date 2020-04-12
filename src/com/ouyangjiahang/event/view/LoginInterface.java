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
 * ��¼�������ͼ
 * @author ŷ���Ѻ�
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
	  
	  setTitle("��¼����");   //���ô��ڵı���
	  setSize(550,500);     //���ô��ڵĳߴ�
	  setVisible(true);    //���ô��ڿɼ�
	  setLocationRelativeTo(null);//���ô�������Ļ����
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���õ��X��ʱ���رճ���
	  
	    JPanel panel = new JPanel();//����һ�����
		panel.setLayout(null);//����Ϊ���Բ���
		label1 = new JLabel("�û���");   //�����û�����ǩ
		label1.setBounds(100, 100, 50, 50);  //�����û�����ǩ��λ�ô�С
		label2 = new JLabel("��   ��");     //���������ǩ
		label2.setBounds(100, 150, 50, 50);     //���������ǩ��λ�ô�С
		label3 = new JLabel("�û�����");     //�����û����ͱ�ǩ
		label3.setBounds(100, 50, 75, 50);  //�����û����ͱ�ǩ��λ�ô�С
		JComboBox cmb=new JComboBox();    //���������б�
		
        cmb.addItem("-��ѡ��-");    //�����������б��ѡ��
        cmb.addItem("��ͨ�û�");     
        cmb.addItem("����Ա");      
        cmb.setBounds(160, 65, 75, 25);//���������б��λ�ô�С
		loginButton = new JButton("��¼");   //���õ�¼��ť
		loginButton.setBounds(100, 300, 120, 50);  //���õ�¼��ť��λ�ô�С
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginActionPerformed(e);
			}
		});//���õ�¼��ť�ļ����¼�
		
		registerButton = new JButton("ע���˺�"); //����ע���˺Ű�ť
		registerButton.setBounds(300, 300, 120, 50); //����ע���˺Ű�ť��λ�ô�С
		//registerButton.addActionListener(this);//������ע���˺š���ť�ļ����¼�
		
		userNameTxt = new JTextField(16);//�����û����ı���ĳ���
		userNameTxt.setBounds(150, 120, 250, 20);//�����û����ı����λ�úʹ�С
		passwordTxt = new JPasswordField(16);//���������
		passwordTxt.setBounds(150, 170, 250, 20);//����������λ�ô�С
		
		panel.add(label1);//�������ӵ����panel
		panel.add(userNameTxt);
		panel.add(label2);
		panel.add(label3);
		panel.add(passwordTxt);
		panel.add(loginButton);
		panel.add(registerButton);
		panel.add(cmb);
		
		this.add(panel);//ʵ�����panel		
		this.setVisible(true);//������ͼ�ɼ�
  }
  /**
   * ��¼�¼�����
   */
  private void loginActionPerformed(ActionEvent evt) {
	  
	    String userName=this.userNameTxt.getText();//��ȡ�ı����������
		String password=new String(this.passwordTxt.getPassword());
		
		if(StringUtil.isEmpty(userName)) {
			JOptionPane.showMessageDialog(null,"�û�������Ϊ�գ�");
			return;
		}
		if(StringUtil.isEmpty(password)) {
			JOptionPane.showMessageDialog(null,"���벻��Ϊ�գ�");
			return;
		}
		
		User user=new User(userName,password);//��װһ������������ѯ
		Connection con=null;
		try {
			con=(Connection)dbUtil.getCon();//���һ�����ݿ������
			User currentUser=userDao.login(con, user);
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
  
public static void main(String[] agrs) {
	  new LoginInterface();  //����һ��ʵ��������
  }
}

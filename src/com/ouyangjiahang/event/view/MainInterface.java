package com.ouyangjiahang.event.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.ouyangjiahang.event.dao.CompetitionDao;

public class MainInterface extends JFrame {
	JLabel label1,label2,label3;
	JPanel panel;
	JButton searchButton;
	JButton Button1,Button2,referButton;
	JTextField competitionTxt;
	public MainInterface(){
		
	
	//设置窗口的标题
		  setTitle("主界面");
		  
		//设置窗口的尺寸
		  setSize(750,700);
		  
		//设置窗口可见
		  setVisible(true);
		  
		//设置窗口在屏幕中央
		  setLocationRelativeTo(null);
		  
		//设置点击X的时候会关闭程序
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  panel = new JPanel();
		  //设置为绝对布局
			panel.setLayout(null);
		  
		    //实现面板panel
			this.add(panel);
			
			//设置视图可见
			this.setVisible(true);
			
			
			
			label1 = new JLabel("赛事大厅");     
			label1.setBounds(300, 55, 150, 60);  
			label1.setFont(new Font("宋体", Font.BOLD, 30));
			
			//设置用户名文本框及其长度
			competitionTxt = new JTextField(16);			
			competitionTxt.setBounds(140, 120, 350, 33);
			
			Button1 = new JButton("余 额");   
			Button1.setBounds(20, 10, 90, 45);  
			Button1.setFont(new Font("宋体", Font.BOLD, 20));
			
			//设置按钮的监听事件
			Button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			Button2 = new JButton("充 值");   
			Button2.setBounds(120, 10, 90, 45);  
			Button2.setFont(new Font("宋体", Font.BOLD, 20));
			//设置登录按钮的监听事件
			Button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			referButton = new JButton("查 询");   
			referButton.setBounds(500, 120, 90, 32);  
			referButton.setFont(new Font("宋体", Font.BOLD, 20));
			JTable competitionTable=new JTable(5,6);
			
			competitionTable=null;
			CompetitionDao c=new CompetitionDao();
			Vector columnNames=new Vector();  
	        //设置列名  
	        columnNames.add("序号");  
	        columnNames.add("日期");  
	        columnNames.add("主场队");  
	        columnNames.add("客场队");  
	        columnNames.add("价格"); 
			Vector rowData = new Vector(); ;
			c.competitionDao(rowData);
			
			//初始化Jtable  
			competitionTable = new JTable(rowData,columnNames); 
			
			JScrollPane pane=new JScrollPane();
			pane=null;
			 pane=new JScrollPane(competitionTable);
			
			pane.setBounds(140, 190, 430, 150);
			
			
			
			//设置查询按钮的监听事件
			referButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			//把组件添加到面板panel
			panel.add(competitionTxt);
			panel.add(label1);
			panel.add(Button1);
			panel.add(Button2);
			panel.add(referButton);
			panel.add(pane);
			this.validate();
			this.repaint();
			
	}
	public static void main(String[] agrs) {
		
		  //创建一个实例化对象
		  new MainInterface();  
	  }
	}



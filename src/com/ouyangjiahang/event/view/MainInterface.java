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
		
	
	//���ô��ڵı���
		  setTitle("������");
		  
		//���ô��ڵĳߴ�
		  setSize(750,700);
		  
		//���ô��ڿɼ�
		  setVisible(true);
		  
		//���ô�������Ļ����
		  setLocationRelativeTo(null);
		  
		//���õ��X��ʱ���رճ���
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  panel = new JPanel();
		  //����Ϊ���Բ���
			panel.setLayout(null);
		  
		    //ʵ�����panel
			this.add(panel);
			
			//������ͼ�ɼ�
			this.setVisible(true);
			
			
			
			label1 = new JLabel("���´���");     
			label1.setBounds(300, 55, 150, 60);  
			label1.setFont(new Font("����", Font.BOLD, 30));
			
			//�����û����ı����䳤��
			competitionTxt = new JTextField(16);			
			competitionTxt.setBounds(140, 120, 350, 33);
			
			Button1 = new JButton("�� ��");   
			Button1.setBounds(20, 10, 90, 45);  
			Button1.setFont(new Font("����", Font.BOLD, 20));
			
			//���ð�ť�ļ����¼�
			Button1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			Button2 = new JButton("�� ֵ");   
			Button2.setBounds(120, 10, 90, 45);  
			Button2.setFont(new Font("����", Font.BOLD, 20));
			//���õ�¼��ť�ļ����¼�
			Button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			referButton = new JButton("�� ѯ");   
			referButton.setBounds(500, 120, 90, 32);  
			referButton.setFont(new Font("����", Font.BOLD, 20));
			JTable competitionTable=new JTable(5,6);
			
			competitionTable=null;
			CompetitionDao c=new CompetitionDao();
			Vector columnNames=new Vector();  
	        //��������  
	        columnNames.add("���");  
	        columnNames.add("����");  
	        columnNames.add("������");  
	        columnNames.add("�ͳ���");  
	        columnNames.add("�۸�"); 
			Vector rowData = new Vector(); ;
			c.competitionDao(rowData);
			
			//��ʼ��Jtable  
			competitionTable = new JTable(rowData,columnNames); 
			
			JScrollPane pane=new JScrollPane();
			pane=null;
			 pane=new JScrollPane(competitionTable);
			
			pane.setBounds(140, 190, 430, 150);
			
			
			
			//���ò�ѯ��ť�ļ����¼�
			referButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//loginActionPerformed(e);
				}
			});
			//�������ӵ����panel
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
		
		  //����һ��ʵ��������
		  new MainInterface();  
	  }
	}



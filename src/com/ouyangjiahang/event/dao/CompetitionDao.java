package com.ouyangjiahang.event.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.ouyangjiahang.event.util.DbUtil;

public class CompetitionDao {
	 //�����ݿ���ȡ����Ϣ  
    //rowData�������������  
    //columnNames�������  
    Vector rowData;
    
    //�������ݿ���Ҫ��ȫ�ֱ���  
    PreparedStatement ps=null;    
    ResultSet rs=null;  
    private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
	Connection con=null;
    public static void main(String[] args) {  
        
    	CompetitionDao competitionDao=new CompetitionDao();  
  
    }  
    
    //���캯��  
    public Vector competitionDao(Vector<Vector<Comparable>> rowData){  
          
         
          
          
       // rowData = new Vector();  
        //rowData���Դ�Ŷ���,��ʼ�����ݿ���ȡ  
          
        try {  
        	//���һ�����ݿ������
			con=dbUtil.getCon();
            ps=con.prepareStatement("select * from t_competition");  
              
            rs=ps.executeQuery();  
              
            while(rs.next()){  
                //rowData���Դ�Ŷ���  
                Vector hang=new Vector();  
                hang.add(rs.getInt(1));  
                hang.add(rs.getString(2));  
                hang.add(rs.getString(3));  
                hang.add(rs.getString(4));  
                hang.add(rs.getInt(5));  
             
                  
                //���뵽rowData  
                rowData.add(hang);  
                
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally{  
              
                try {  
                    if(rs!=null){  
                    rs.close();  
                    }  
                    if(ps!=null){  
                        ps.close();  
                    }  
                    if(con!=null){  
                        con.close();  
                    }  
                } catch (SQLException e) {  
                    e.printStackTrace();  
                }  
        }
		return rowData;  
        
}
}

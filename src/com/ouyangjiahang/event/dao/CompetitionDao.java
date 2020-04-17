package com.ouyangjiahang.event.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.ouyangjiahang.event.util.DbUtil;

public class CompetitionDao {
	 //从数据库中取出信息  
    //rowData用来存放行数据  
    //columnNames存放列名  
    Vector rowData;
    
    //定义数据库需要的全局变量  
    PreparedStatement ps=null;    
    ResultSet rs=null;  
    private DbUtil dbUtil=new DbUtil();
	private UserDao userDao=new UserDao();
	Connection con=null;
    public static void main(String[] args) {  
        
    	CompetitionDao competitionDao=new CompetitionDao();  
  
    }  
    
    //构造函数  
    public Vector competitionDao(Vector<Vector<Comparable>> rowData){  
          
         
          
          
       // rowData = new Vector();  
        //rowData可以存放多行,开始从数据库里取  
          
        try {  
        	//获得一个数据库的连接
			con=dbUtil.getCon();
            ps=con.prepareStatement("select * from t_competition");  
              
            rs=ps.executeQuery();  
              
            while(rs.next()){  
                //rowData可以存放多行  
                Vector hang=new Vector();  
                hang.add(rs.getInt(1));  
                hang.add(rs.getString(2));  
                hang.add(rs.getString(3));  
                hang.add(rs.getString(4));  
                hang.add(rs.getInt(5));  
             
                  
                //加入到rowData  
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

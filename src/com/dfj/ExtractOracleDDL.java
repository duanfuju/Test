package com.dfj;

import java.sql.*;
import java.io.*;


public class ExtractOracleDDL {
	//数据库连接
	//private static final String URL ="jdbc:mysql://127.0.0.1:3306/imslean";
	private static final String URL ="jdbc:oracle:thin:@172.16.210.10:21521:imsdb";
	private static final String NAME = "root";
	private static final String PASS = "root";
	//private static final String DRIVER ="com.mysql.jdbc.Driver";
	//private static final String DRIVER ="com.microsoft.jdbc.sqlserver.SQLServerDriver";
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	
	
	//数据库表
	private static String[] tableArray;
	//用户名称
	private static String userName="I6000_RES";
	
	public static void main(String[] args) {
		
		tableArray=new String[]{};
		
		for (int i = 0; i < tableArray.length; i++) {
			String tablename=tableArray[i].toUpperCase();
			GetTable(tablename,userName);
		}
		
	}
	
	public static void GetTable(String tableName,String userName){
		Connection conn = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    String sql="select DBMS_METADATA.GET_DDL('TABLE','"+tableName+"','"+userName+"') FROM DUAL"; 
	    try{
	    	Class.forName(DRIVER);
	        conn=DriverManager.getConnection(URL,NAME,PASS);
	        stmt=conn.prepareStatement(sql);
	        rs=stmt.executeQuery();
	        rs.next();  
	        byte[] bytes=rs.getBytes(0);
	        InputStream in =  new ByteArrayInputStream(bytes); 
	        InputStreamReader isr = new InputStreamReader(in);// 字符流
	        BufferedReader br = new BufferedReader(isr); // 缓冲
	        String line = null;
	        //输出流
	        File file = new File("D:\\南瑞项目\\getDDL\\"+tableName+".txt");
	      	file.createNewFile();
	        FileOutputStream output=new FileOutputStream(file);
	        while ((line = br.readLine()) != null) {// 字符不等于空
	        	
	        	line=line.replaceAll("0", "");
	        	 byte [] buff=new byte[]{};
	             buff=line.getBytes();
	             output.write(buff, 0, buff.length);
	        }
	        br.close();// 关闭文件
	      
	    }catch(Exception e){
	       e.printStackTrace();
	    }finally{
	    	 try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			} 
	    }
	}
	 	
}

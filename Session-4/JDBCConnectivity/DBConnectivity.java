package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectivity {
	
	public static void main(String[] args) {
		
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce3";
		String user="root";
		String password="Nikunj@123";
		
			try {
				Class.forName(driver);
				Connection conn=DriverManager.getConnection(url,user,password);
				if(conn!=null)
					System.out.println("Connected");
				else
					System.out.println("Error Connecting to DB");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		 
		
	}

}

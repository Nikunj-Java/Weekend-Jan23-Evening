package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StaticInsertion {
	
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/ecommerce3";
		String user="root";
		String password="Nikunj@123";
		
		Connection conn=null;
		
		
		//load driver
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			
			if(conn!=null) {
				System.out.println("Connected");
				
				String query="insert into product (name,price) value ('ABCD-demo',60000);";
				
			
				Statement stmt=conn.createStatement();
				int x=stmt.executeUpdate(query);
				
				if(x>0) {
					System.out.println("Data Inserted Successfully");
				}
				else {
					System.out.println("Data Not Inserted");
				}
			}
			else {
				System.out.println("Error Ehile Connecting To Database");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

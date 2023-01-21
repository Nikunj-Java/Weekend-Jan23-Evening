package com.simplilearn.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class StoredProcedureExample {
	
	
	/*
	 Stored procedure Query to be written in database
	 
	 create procedure add_product(IN pname varchar(100),IN pprice int) insert into product (name,price) values(pname,pprice);
	 
	 //call add_product('demolaptop',45000);
	 */
	
	public static void main(String[] args) {
		Connection conn=DBConfig.getConnection();
		
		CallableStatement stmt;
		try {
			stmt=conn.prepareCall("call add_product(?,?)");
			stmt.setString(1, "Thinkpad-Lenovo");
			stmt.setInt(2, 86000);
			
			int x=stmt.executeUpdate();
			
			if(x>0)
				System.out.println("DATA INSERTED");
			else
				System.out.println("ERROR WHILE INSERTING A DATA");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Error Message: "+e.getMessage());
		}
		
	}
	

}

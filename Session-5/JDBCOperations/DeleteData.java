package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn=DBConfig.getConnection();
		String sql="delete from product where id=?";
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setInt(1, 3);
		int x=stmt.executeUpdate();
		if(x>0) 

			System.out.println("Record Deleted Successfully");
		else
			System.out.println("No record Available to delete");
		stmt.close();
		conn.close();
	}

}

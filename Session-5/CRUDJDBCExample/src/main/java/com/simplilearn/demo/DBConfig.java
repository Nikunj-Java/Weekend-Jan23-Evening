package com.simplilearn.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
	
public static Connection getConnection(Properties props) {
	
	Connection connection=null;
	String driver=props.getProperty("driver");
	String url=props.getProperty("url");
	String username=props.getProperty("username");
	String password=props.getProperty("password");
	
	//load driver
	try {
		Class.forName(driver);
		
		connection=DriverManager.getConnection(url,username,password);
		
	} catch (ClassNotFoundException e) {
		// TODO: handle exception
	} catch (SQLException e) {
		// TODO: handle exception
	}
	return connection;
}
		 
		
		 

}

package com.simplilearn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/list")
public class FetchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		Properties props=new  Properties();
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
		
		Connection conn=DBConfig.getConnection(props);
		
		if(conn!=null) {
			out.print("Connection Established");
			
			Statement stmt;
			
			try {
				
				stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery("select * from product");
				
				while(rs.next()) {
					out.print("<br>"+rs.getInt(1)+", "+rs.getString(2)+","+rs.getBigDecimal(3)+","+rs.getTimestamp(4)+"<br>");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		else {
			out.println("Error While Connecting");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	 
}

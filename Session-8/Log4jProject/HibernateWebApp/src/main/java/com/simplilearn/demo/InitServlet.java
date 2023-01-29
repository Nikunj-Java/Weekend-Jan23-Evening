package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


@WebServlet("/init")
public class InitServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		
		
		//connection pool
		 SessionFactory factory=HibernateUtil.getSessionfactory();
		 
		 
		 //connection
		 Session session=factory.openSession();
		 out.print("Session is opened For DB operation");
		 
		 //session.close();
		 //out.print("Session is Closed For DB operation");
		 
		 Student s1=new Student();
		 s1.setName("Nikunj Soni");
		 s1.setEmail("Nikunj@gmail.com");
		 s1.setPassword("Nikunj@12345");
		 
		 Transaction tx=session.beginTransaction();
		 session.save(s1);
		 
		 tx.commit();
		 
		 
		 
		session.close();
		factory.close();
		System.out.println("Hibernate Session Closed");
		System.out.println("Data inserted Successfully");
		 
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}

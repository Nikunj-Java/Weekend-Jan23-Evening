package com.simplilearn.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet("/list")
public class ListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		SessionFactory factory= HibernateUtil.getSessionfactory();
		Session session= factory.openSession();
		
		List<Product> list=session.createQuery("from Product").list();
		
		PrintWriter out=resp.getWriter();
		out.print("<h1>Product List</h1>");
		
		for(Product p:list) {
			out.print("<b>"+p.getId()+". "+p.getName()+" "+p.getPrice()+"</b><br>");
			
			ProductParts part=p.getParts();
			out.print("HDD: "+part.getHdd()+"<br>");
			out.print("CPU: "+part.getCpu()+"<br>");
			out.print("RAM: "+part.getRam()+"<br>");
			out.print("-------------------------------------<br>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}

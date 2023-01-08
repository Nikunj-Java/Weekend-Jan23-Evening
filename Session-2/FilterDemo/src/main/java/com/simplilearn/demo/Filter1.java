package com.simplilearn.demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter1 implements Filter {
	
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		
		//method
		String name=req.getParameter("username");
		
		if(name!=null)
			chain.doFilter(req, res);
		else
			res.getWriter().print("user is invalid");
		
		
	}
	
	public void init (FilterConfig config)throws ServletException{
		
	}

}

package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/Welcome")
public class MyFilterValidation implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init: ");
	}
	@Override
	public void doFilter(ServletRequest req, ServletResponse response,
			FilterChain chain)
			throws IOException, ServletException 
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String name=req.getParameter("name");
			if(name.equals("vikas")) {
				//forward the request to Welcome Servlet 
				chain.doFilter(req, response);
			}else {
				out.print("Enter your correct name!!");
			}
			
	}
	@Override
	public void destroy() {
		System.out.println("destroy:");
	}

}

package com.javahub.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			String name=request.getParameter("userName");
			String email=request.getParameter("email");
			
			response.setContentType("text/html");//browser
			PrintWriter out=response.getWriter();//to create the object of PrintWriter is used for create teh dynamic page and response to the cleint
			
			//creating the object of servlet contect
			ServletContext servletContext = getServletContext();//
			//
			
			Class.forName(servletContext.getInitParameter("driver"));//
			Connection con=DriverManager.getConnection(servletContext.getInitParameter("url"),servletContext.getInitParameter("user"),servletContext.getInitParameter("password"));
			PreparedStatement ps=con.prepareStatement("select * from students where firstname = ? and email = ? ");
			ps.setString(1, name);
			ps.setString(2, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				out.println("<html><body bgcolor=cyan>");
				out.println("Welcome: "+ name +" sucessfully login");
				out.print("<a href='index.html'>back</a><br/>");
				out.println("</body></html>");
			} else {
				out.println("<html><body bgcolor=cyan>");
				out.println("Invalid user name or password!!!");
				out.print("<a href='index.html'>back</a><br/>");
				out.println("</body></html>");
			}
			
			
			}catch(Exception ex) {
				ex.printStackTrace();
			}
	}

}

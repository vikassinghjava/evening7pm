package com.javahub.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String student_id = request.getParameter("student_id");
			String student_fname = request.getParameter("student_fname");
			String student_lname = request.getParameter("student_lname");
			String student_email = request.getParameter("student_email");
			
			ServletContext context=getServletContext();
			Class.forName(context.getInitParameter("driver"));
			Connection con=DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("user"),context.getInitParameter("password"));
			PreparedStatement ps=con.prepareStatement("insert into students values(?,?,?,?)");
			ps.setInt(1, Integer.parseInt(student_id));
			ps.setString(2, student_fname);
			ps.setString(3, student_lname);
			ps.setString(4, student_email);
			
			int i=ps.executeUpdate();
			
			if(i>0) {
				out.print("Sucessfully updateDD <br/>");
				out.print("<a href='signup.html'>Home</a><br/>");
			} else {
				out.print("Value not updated contact to admin!!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
		  
		 String name=request.getParameter("user");
		 out.print("Welcome: "+name);
		 
		 out.print("<a href='SecondServlet?userName="+name+"'>Second Servlet</a>");
		 
		 /*out.print("<form action='SecondServlet'>");
		 out.print("<input type='hidden' name='userName' value='"+name+"'><br/>");
		 out.print("<input type='submit' value='take a tour'><br/>");
		 out.print("</form>");*/
		 
		
	}


}

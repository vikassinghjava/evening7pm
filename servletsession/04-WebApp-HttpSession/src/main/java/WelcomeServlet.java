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
		 
		 
		 //create the http session object
		 HttpSession session = request.getSession(true);
		 //saving string data
		 session.setAttribute("userName", name);
		 //saving object type data
		  Employee empObject = new Employee(1, "alan", "manager", 10000);
		  session.setAttribute("employee", empObject);
		  
		  out.println("<a href='SecondServlet'>Second Servlet</a>");
		  
		
	}


}

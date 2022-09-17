import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		
		HttpSession httpSession=request.getSession(false);
		
		String name = (String)httpSession.getAttribute("userName"); 
		Employee emp = (Employee)httpSession.getAttribute("employee");
		
		out.print("thanks for visit: "+name);
		out.print("Employee: "+emp.getId()+" "+emp.getName()+" "+emp.getJob()+" "+emp.getSalary());
	}
	

}

import java.sql.*;
import java.util.*;
class  Test2{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
                                       
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.
		getConnection("jdbc:mysql://localhost:3306/students_db","root","");
		
		Statement stmt=con.createStatement();
		System.out.println("Enter email id");
		String userEmail = sc.next();
		ResultSet rs=stmt.executeQuery("select * from students where email= '"+userEmail +"'  ");

		    while(rs.next()){
				System.out.println(rs.getInt("student_id")+" "+rs.getString("firstname")+" "+rs.getString("lastname")+" "+rs.getString("email"));
				
			}
		con.close();
		
		
		
	}
}
///


import java.sql.*;
import java.util.*;
class  Test3{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
                                       
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.
		getConnection("jdbc:mysql://localhost:3306/students_db","root","");
		
		Statement stmt=con.createStatement();

		System.out.println("Enter user id");
		int userID = sc.nextInt();

		System.out.println("Enter first name");
		String userFN = sc.next();

		System.out.println("Enter Last name");
		String userLN = sc.next();


		System.out.println("Enter email id");
		String userEmail = sc.next();


		int i=stmt.executeUpdate("insert into students values( '"+userID +"','"+userFN  +"','"+userLN +"','"+userEmail  +"' ) ");
		if(i>0){
			System.out.println("sucessfulyy inserted!!");
		}else{
			System.out.println("Something went wrong!!");
                                       }
		    
		con.close();
		
		
		
	}
}
///


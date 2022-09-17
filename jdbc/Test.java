import java.sql.*;
class  Test{
	public static void main(String args[])
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.
		getConnection("jdbc:mysql://localhost:3006:students_db","root","");
		
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from students");
		    while(rs.next()){
				System.out.println(rs.getInt("student_id")+" "+rs.getString("firstname")+" "+rs.getString("lastname")+" "+rs.getString("email"));
				
			}
		con.close();
		
		
		
	}
}
///


import java.io.*;
class Employee implements Serializable{
		
	int id;
	String name;
	transient int salary;
	static String password;

	public Employee(int id, String name, int salary, String password) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password = password;
	}

}
/*
class Manager extends Employee
{
   int x=10;
	Manager()
	{
		super(1, "ram", 10000, "abcd");//default cons
	}
	
}
*/

public class Main {
	public static void main(String[] args)throws Exception {
			ObjectOutputStream out=new ObjectOutputStream
					(new FileOutputStream("d:\\emp.txt"));
			
			out.writeObject(new Employee(1, "ram", 10000, "abcd"));
			out.close();
			System.out.println("Successfully serialized!!!");
			
	}
}

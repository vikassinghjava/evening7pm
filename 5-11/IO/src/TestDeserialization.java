import java.io.*;

public class TestDeserialization {
	public static void main(String[] args) throws Exception {
			ObjectInputStream obj=new ObjectInputStream(new FileInputStream("d:\\emp.txt"));
			Employee emp=(Employee)obj.readObject();
			System.out.println(emp.id+" "+emp.name+" "+emp.salary+" "+emp.password);
	}
}

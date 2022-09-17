import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		
		//Supplier<String> sup=()->  "hello";
		//System.out.println(sup.get());
		Supplier<Employee> sup=()->{
			Employee e1=new Employee("vikas", "haipur", "developer", 1000);
			return e1;
			 
		};
		System.out.println(sup.get());
		
		BiConsumer<Integer, Integer> con;
		con=(n1,n2)-> System.out.println(n1+n2);
		con.accept(10, 20);
		
	}

}

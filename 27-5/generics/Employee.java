package generics;
//class level generics
public class Employee<T> {
	T t;

	public Employee(T t) {
		this.t=t;
	}
	
	T getValue() {
		return t;
	}

	public static void main(String[] args) {
		//Employee<Integer> e=new Employee<Integer>("hello");
		Employee<Integer> e=new Employee<Integer>(10);
		int id=e.getValue();//automatic type conversion
		System.out.println(id);
		
		Employee<String> e2=new Employee<>("hello");//type inference means anuman
		String str=e2.getValue();//automatic type conversion
		System.out.println(str);
	}

}

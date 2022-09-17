package generics;
//method level generics
public class Employee2 {
	
	static <T>  void show(T t[]) {
		for(T t1:t) {
			System.out.println(t1);
		}
	}

	public static void main(String[] args) {
		show(new Integer[] {1,2,3,4,5,6,7,7,9});
		show(new String[] {"hello","hello","hello","hello","hello"});
		show(new Float[] {1.0f,2.0f});
	}

}

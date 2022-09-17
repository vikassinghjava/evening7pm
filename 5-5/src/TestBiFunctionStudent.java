import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestBiFunctionStudent {
	
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		
		BiFunction<String,Integer, Student> bif=(name,roll)->  new Student(name, roll);
		al.add(bif.apply("ravi", 1));
		al.add(bif.apply("kavi", 2));
		al.add(bif.apply("savi", 3));
		al.add(bif.apply("tavi", 4));
		
		for(Student s:al) {
			System.out.println(s.getName()+": "+s.getRollNo());
		}
		
	}

}

import java.util.function.Predicate;

public class TestPredicate2 {
 public static void main(String[] args) {
	Predicate<String> p=s->s.length()>5;
	System.out.println(p.test("vikas"));//true
	System.out.println(p.test("javahub"));//false
	
	
}
}

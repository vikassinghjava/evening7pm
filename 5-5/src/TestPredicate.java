import java.util.function.Predicate;

public class TestPredicate {
 public static void main(String[] args) {
	Predicate<Integer> p=i->i>10;
	System.out.println(p.test(20));//true
	System.out.println(p.test(5));//false
	
}
}

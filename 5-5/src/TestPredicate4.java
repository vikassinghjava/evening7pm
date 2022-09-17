import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate4 {
 public static void main(String[] args) {
	int arr[] ={12,2,3,4,50,60};
	Predicate<Integer> p1=i->i>10;
	Predicate<Integer> p2=i->i%2==0;
	System.out.println("No are greater than 10");
	check(p1, arr);
	System.out.println("Even no");
	check(p2, arr);
	
	System.out.println("No not greater than 10");
	check(p1.negate(), arr);
	
	System.out.println("no are not even");
	check(p2.negate(), arr);
	
	System.out.println("greater than 10 or even");
	check(p1.or(p2), arr);
	
	System.out.println("no are greater than 10 and even");
	check(p1.and(p2), arr);
	
	
  }
 
 public static void check(Predicate<Integer> p,int x[]) {
	 for(int x1:x) {
		 if(p.test(x1))
			 System.out.println(x1);
	 }
	 
 }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate5 {
 public static void main(String[] args) {
	String names[]= {"vikas","kamla","kapil","ravi","vijay"};
	Predicate<String> p=name->name.startsWith("k")==true;
	check(p, names);
  }
 
 public static  void check(Predicate<String> p,String arr[]) {
	 for(String str:arr) {
		 if(p.test(str)) 
			 System.out.println(str);
	 }
	 
 }
}

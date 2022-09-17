import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate3 {
 public static void main(String[] args) {
	Predicate<Collection> p=c->c.isEmpty()==true;
	ArrayList<String> ar=new ArrayList<>();
	ar.add("java1");
	ar.add("java2");
	
	ArrayList<String> ar2=new ArrayList<>();
	System.out.println(p.test(ar));//false
	System.out.println(p.test(ar2));//true
	
  }
}

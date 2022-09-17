import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate6 {
 public static void main(String[] args) {
	String names[]= {"vikas","kamla",null,"kapil","","ravi","vijay","",null};
	Predicate<String> p=name->name!=null && name.length()!=0;
	ArrayList<String> ar=new ArrayList<>();
	for(String name:names) {
		if(p.test(name)) {
			ar.add(name);
		}
	}
	System.out.println("valid names are!!");
	System.out.println(ar);
 }
 
}

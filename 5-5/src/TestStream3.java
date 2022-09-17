import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class TestStream3 {
 public static void main(String[] args) {
	 	
	 ArrayList<Integer> ar=new ArrayList<>();
	 ar.add(0);
	 ar.add(10);
	 ar.add(20);
	 ar.add(5);
	 ar.add(15);
	 ar.add(25);
	 System.out.println(ar);
	 
	 ar.forEach(s->System.out.println(s));
 }

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class TestStream2 {
 public static void main(String[] args) {
	 	
	 ArrayList<Integer> ar=new ArrayList<>();
	 ar.add(0);
	 ar.add(10);
	 ar.add(20);
	 ar.add(5);
	 ar.add(15);
	 ar.add(25);
	 System.out.println(ar);
	 
	Integer i= ar.stream().min((i1,i2)->i1.compareTo(i2)).get();
	 System.out.println(i);      
	 
	 Integer ii= ar.stream().max((i1,i2)->i1.compareTo(i2)).get();
	 System.out.println(ii);
	 
	 Long il= ar.stream().count();
	 System.out.println(il);
	 
	 ar.forEach(s->System.out.println(s));
	 System.out.println("============================");
	 ar.stream().forEach(s->System.out.println(s));
	 System.out.println("===========================");
	 ar.forEach(System.out::println);
 }

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class TestStream4 {
 public static void main(String[] args) {
	 	
	 ArrayList<Integer> ar=new ArrayList<>();
	 ar.add(10);
	 ar.add(120);
	 ar.add(0);
	 ar.add(5);
	 ar.add(15);
	 ar.add(14);
	 Integer aa[]=ar.stream().toArray(Integer[] :: new);
	 for(Integer i :aa) {
		 System.out.println(i);
	 }
 }

}

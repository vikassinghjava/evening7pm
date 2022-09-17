import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test22 {
	public static void main(String[] args) {
		
		      ArrayList<String> ar=new ArrayList<>();
		      ar.add("ravi");
		      ar.add("savi");
		      ar.add("kavi");
		      ar.add("cavi");
		      ar.add("tavi");
		      System.out.println(ar);
		      
		     Set<ArrayList<String>> set =Collections.singleton(ar);
		      
		     ArrayList<String> ar2=new ArrayList<>();
		     ar2.add("newdata");
		     set.add(ar2);
		      
		      System.out.println(ar);
		      
		      
		      
	}
	
}





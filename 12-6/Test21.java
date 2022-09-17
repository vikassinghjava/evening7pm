import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test21 {
	public static void main(String[] args) {
		
		      ArrayList<String> ar=new ArrayList<>();
		      ar.add("ravi");
		      ar.add("savi");
		      ar.add("kavi");
		      ar.add("cavi");
		      ar.add("tavi");
		      System.out.println(ar);
		      //ArrayList is not synchronized
		      Collections.synchronizedList(ar);//synchronized
		      Collections.sort(ar);//sorting
		      
		      System.out.println(ar);
		      
		      
		      
	}
	
}





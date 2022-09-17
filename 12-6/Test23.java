import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test23 {
	public static void main(String[] args) {
		
		      ArrayList<String> ar=new ArrayList<>();
		      ar.add("ravi");
		      ar.add("savi");
		      ar.add("kavi");
		      ar.add("cavi");
		      ar.add("tavi");
		      System.out.println(ar);
		      
		      List<String> unModifibaleList= Collections.unmodifiableList(ar);
		      unModifibaleList.add("new element");
		      
		      System.out.println(ar);
		      
		      
		      
	}
	
}





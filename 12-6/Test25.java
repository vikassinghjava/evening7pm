import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test25 {
	public static void main(String[] args) {
		
		      ArrayList<String> ar=new ArrayList<>();
		      ar.add("ravi");
		      ar.add("ravi");
		      ar.add("ravi");
		      ar.add("savi");
		      ar.add("kavi");
		      ar.add("kavi");
		      ar.add("cavi");
		      ar.add("cavi");
		      ar.add("tavi");
		      System.out.println(ar);
		      //int count=Collections.frequency(ar, "ravi");
		      //System.out.println(count);
		     
		      for (Iterator iterator = ar.iterator(); iterator.hasNext()==true; )     {
		    	  
				String str = (String) iterator.next();
				System.out.println(str +"\t"+ Collections.frequency(ar, str));
				
			}
	}
	
}





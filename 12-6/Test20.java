import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test20 {
	public static void main(String[] args) {
		
		       Hashtable<String, String> hashtable=new Hashtable<>();
		       hashtable.put("ravi1", "ravi1");
		       hashtable.put("kav1", "kavi1");
		       hashtable.put("sav1", "savi1");
		       hashtable.put("tav1", "tavi1");
		       //hashtable.put("tav3", null);
		       //hashtable.put(null, "newvalue");//null key is not allowed
		       
		      // System.out.println(hashtable);
		       
		      /*Enumeration<String> enm=hashtable.keys();
		      while(enm.hasMoreElements()) {
		    	  String str=enm.nextElement();
		    	  System.out.println(str);
		    	  if(str.equals("ravi1")) {
		    		  hashtable.put("anotherkey", "anothervalue");
		    	  }
		      }
		      */
		       
		         Set<String> set=hashtable.keySet();
			      Iterator<String> itr=set.iterator();
			      while(itr.hasNext()) {
			    	  String str=itr.next();
			    	  System.out.println(str);
			    	  if(str.contains("ravi1")) {
			    		  hashtable.put("anotherkey", "anothervalue");
			    	  }
			      }
		       
		      /*
		      Set set=hashtable.entrySet();
		      Iterator itr=set.iterator();
		      while(itr.hasNext()) {
		    	  String str=(String)itr.next();
		    	  System.out.println(str);
		    	  if(str.contains("ravi1")) {
		    		  hashtable.put("anotherkey", "anothervalue");
		    	  }
		      }*/
		       
	}
	
}





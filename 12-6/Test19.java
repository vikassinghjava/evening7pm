import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Test19 {
	public static void main(String[] args) {
		
		       //solution for fail-fast classes: ConcurrentHashMap fail-safe class
				ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
				map.put("ravi", 10);
				map.put("kavi", 12);
				map.put("savi", 13);
				map.put("tavi", 14);
				map.put("navi", 15);
				
				Set set=map.entrySet();
				Iterator itr=set.iterator();
				while(itr.hasNext()) {
					Map.Entry entry=(Map.Entry)itr.next();
					System.out.println(entry.getKey()+" "+entry.getValue());
					
					if(entry.getKey().equals("ravi")) {
						map.put("taki",16);
						
					}
					
				}
				
	}
	
}





import java.util.*;
public class Test12 {
	public static void main(String[] args) {
		
		Map<String, Integer> hm=new HashMap<>();
		hm.put("ravi", 10);//hm.put("ravi", new Integer(10));
		hm.put("kavi", 11);
		hm.put("savi", 12);
		hm.put("tavi", 131);
		hm.put("tavi", 132);
		hm.put("tavi", 133);
		hm.put("cavi", 14);
		//hm.put(null, 14);
		//hm.put(null, 15);
		hm.put("kunal", null);
		hm.put("kunal", null);
		hm.put("kunali", null);
		//hm.put(null, null);
		//hm.put(null, null);
		//hm.put(null, 14);
		
		System.out.println(hm.containsKey("ravi")+" "+hm.containsValue(12));
		//hm.remove("ravi");
		//hm.remove("ravi",10);
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		/*while(itr.hasNext()) 
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}*/

		while(itr.hasNext()) 
		{
			Map.Entry entry=(Map.Entry)itr.next();
			//System.out.println(entry.getKey()+" : "+entry.getValue());
			if(entry.getKey().equals("kavi")) 
			{
				hm.remove(entry.getKey(), entry.getValue());
			}
		}
		
		
	}
	
}





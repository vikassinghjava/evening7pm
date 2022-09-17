import java.util.*;
public class Test9 {
	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<>();
		hs.add("ravi");
		hs.add("kavi");
		hs.add("savi");
		hs.add("tavi");
		hs.add("tavi");
		hs.add("tavi");
		System.out.println("Total no of elemnts :"+hs.size());
		System.out.println("Search: "+hs.contains("ravi"));
		System.out.println("Remove: "+hs.remove("ravi"));
		
		System.out.println(hs);
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) 
		{
			String data=itr.next();
			System.out.println(data);
			/*if(data.equals("ravi")) 
			{
				System.out.println(data+" "+hs.add("ravinew"));
			}*/
		}
		
		System.out.println("after modification: "+hs);
		
	}
	
}

import java.util.*;
public class Test8 {
	public static void main(String[] args) {
		
		Vector<String> ar=new Vector<>();//Legacy class
		ar.add("ram");
		ar.add("ram2");
		ar.add(null);
		ar.add("ram3");
		ar.add("ram3");
		ar.add("ram3");
		
		/*for(String str:ar) {
			System.out.println(str);
		}*/
		Iterator<String> itr=ar.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	}
	
}

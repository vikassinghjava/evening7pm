import java.util.*;
public class Test5 {

	public static void main(String[] args) {
		List<String> v=new ArrayList<>();
		v.add("ram");
		v.add("ram2");
		v.add("ram3");
		//System.out.println(v);
		Iterator<String> itr=v.iterator();
		//for( ;itr.hasNext(); )
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
}

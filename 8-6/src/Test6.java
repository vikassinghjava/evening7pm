import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		//List<String> ar=new ArrayList<>();
		List<String> ar=new Vector<>();
		ar.add("ram");
		ar.add("ram2");
		ar.add("ram3");
		Iterator<String> itr=ar.iterator();//iterator
		while(itr.hasNext())
		{
			String data=itr.next();//read
			System.out.println(data);//read
			if(data.equals("ram")) 
			{
				//System.out.println(data+" "+ar.remove(data));//modify
				System.out.println(data+" "+ar.add("ramnew"));
				//ConcurrentModificationException
				//Fail-Fast
			}
			
		}
		
		
	}
	
}

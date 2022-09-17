import java.util.*;
public class Test7 {

	public static void main(String[] args) {
		Vector<String> ar=new Vector<>();//Legacy class
		ar.add("ram");
		ar.add("ram2");
		ar.add("ram3");
		
		/*Enumeration<String> enm=ar.elements();//jdk 1.0
		while(enm.hasMoreElements()) 
		{
			String data=enm.nextElement();//read
			System.out.println(data);//read
			if(data.equals("ram")) 
			{
				//System.out.println(data+" "+ar.remove(data));//modify
				System.out.println(data+" "+ar.add("ramnew"));//true
				//Fail-Safe Collection class
			}
		}*/
				
		//Iterator<String> itr=ar.iterator();//iterator jdk 1.2
		ListIterator<String> itr=ar.listIterator();//iterator jdk 1.2
		while(itr.hasNext())
		{
			String data=itr.next();//read
			System.out.println(data);//read
			if(data.equals("ram")) 
			{
				//System.out.println(data+" "+ar.remove(data));//modify
				System.out.println(data+" "+ar.add("ramnew"));
				//ConcurrentModificationException
				//Fail-Fast Collection class
			}
			
		}
		
		
	}
	
}

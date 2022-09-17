import java.util.ArrayList;
import java.util.Iterator;

public class TestConcurrent {
	public static void main(String[] args) {
	ArrayList<String> ar=new ArrayList<>();
	ar.add("java1");
	ar.add("java2");
	ar.add("java3");
	ar.add("java4");
	ar.add("java5");
	Iterator<String> itr=ar.iterator();
	while(itr.hasNext()) 
	{
		String value=itr.next();
		System.out.println(value);
		if(value.equals("java2")) 
		{
			ar.remove("java2");
		}
	}
	
}
}

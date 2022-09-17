import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestConcurrent2 {
	public static void main(String[] args) {
	//Vector<String> ar=new Vector<>();
	//List ar=new LinkedList<>();
	Stack<String> ar=new Stack<>();	
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

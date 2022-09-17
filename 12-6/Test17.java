import java.util.*;
//Original collection start
public class Test17 {
	public static void main(String[] args) {
		
		
		TreeSet<StringBuffer> hashSet=new TreeSet<>();
		hashSet.add(new StringBuffer("ravi"));
		hashSet.add(new StringBuffer("kavi"));
		
		for (StringBuffer stringBuffer : hashSet) {
		  System.out.println(stringBuffer);	
		}
	}
	
}





package threading;
import java.util.function.Function;
public class Test12 
{
		public static void main(String[] args) 
		{
			Function<String, String> f1,f2,f3;
			f1=(str)-> str.equals("vikas")? "vikas":" incorrect name ";	
			f2=(str)-> str.length()==5? "vikas" : "incorrect length" ;
			f3=(str)-> str.startsWith("v")? " Your name starts with  v" : " stratring correcter should be v";
			
			System.out.println(f1.andThen(f2).andThen(f3).apply("vikas"));
			
		}
}

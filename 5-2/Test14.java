package threading;
import java.util.function.BiFunction;
public class Test14 
{
		public static void main(String[] args) 
		{
			     
			BiFunction<String, String, Integer> bif;
				
	    	bif=(str1,str2)-> str1.length()+str2.length();
			System.out.println(bif.apply("vikas", "vikas"));
		}
}

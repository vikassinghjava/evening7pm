package threading;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
public class Test13 
{
		public static void main(String[] args) 
		{
			     
				BiPredicate<String, String> pr;
				
				pr=(str1,str2)->     str1.equals(str2);
				
				System.out.println(pr.test("vikas", "Vikas"));
			
		}
}

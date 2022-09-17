package threading;
import java.util.Scanner;
import java.util.function.Predicate;
public class Test8 
{
	
		public static void main(String[] args) 
		{
			
			Predicate<String> p ; 
			 p=(str)-> 
			 	{ 
				  return str.equals("vikas");
				};
			 
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter Your name!!");
			 String name=sc.next();
			 
			 if(p.test(name)==true) 
			 {
				 System.out.println("Your name is: "+name);
				 
			 }else
			 {
				 System.out.println("Enter your correct name!");
			 }
			
		}
}

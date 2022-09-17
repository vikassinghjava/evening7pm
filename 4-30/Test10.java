package threading;
import java.util.Scanner;
import java.util.function.Predicate;
public class Test10 
{
		public static void main(String[] args) 
		{
			Predicate<String> p ; 
			 p=(str)-> 
			 	{ 
				  return str.length()>=5;
				};
			 
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter Your password!!");
			 String password=sc.next();
			 if(p.test(password)==true) 
			 {
				 System.out.println("Your password is: "+password);
				 
			 }else
			 {
				 System.out.println("password is too short!!");
			 }
			
		}
}

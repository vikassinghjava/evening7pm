package threading;

import java.util.function.Predicate;

public class Test7 
{
	
		public static void main(String[] args) 
		{
			Employee e1=new Employee(1000,"ravi");
			
			Predicate<Employee> p = (e11)-> e11.sal==1000;
			
			if(p.test(e1)==true) {
				System.out.println(e1.sal+" "+e1.name);
			}
			
		}
}

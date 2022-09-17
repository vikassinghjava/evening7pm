package threading;
import java.util.function.Consumer;

public class Test17 
{
	
		 static Employee[]  getEmployee() 
		  {	 Employee[] e1=new Employee[5];
			  e1[0]=new Employee(10, "ravi1");
			  e1[1]=new Employee(20, "ravi2");
			  e1[2]=new Employee(39, "ravi3");
			  e1[3]=new Employee(49, "ravi4");
			  e1[4]=new Employee(59, "ravi5");
			  return e1;
		  }
	  
		public static void main(String[] args) 
		{
			Consumer<Employee> con=(emp)->
			{
				System.out.println(emp.getName().toUpperCase()+" "+(emp.getSal()+10));
			};
			
			  for(Employee e:getEmployee())
			  {
				  con.accept(e);
			  }
		  	  
		}
}

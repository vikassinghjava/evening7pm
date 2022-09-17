package threading;
import java.util.function.Consumer;

public class Test16 
{
		public static void main(String[] args) 
		{
		  Consumer<String> con;
		  con=(str)->
		  {
			  System.out.println(str.toUpperCase());
		  };
		  
		  con.accept("vikas");
		  con.accept("ravi");
		  con.accept("kavi");
		  	  
		}
}

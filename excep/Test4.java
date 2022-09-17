import java.io.*;
class Test4
{
public  static void main(String args[])
	{	try
		{
		   System.out.println("hello");
		   int x=10/0;
		   System.out.println(x);
		   //System.exit(0);
		   System.out.println("hello2");
		}
		catch(Exception ex){
		  System.out.println(ex);
		}
		finally{
		   System.out.println("hello2 finally");
		}				
			
	}

}
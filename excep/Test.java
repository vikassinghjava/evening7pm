import java.io.*;
class Test
{
public  static void main(String args[])throws Exception
	{
		FileWriter fw=null;
		try
		{
		
		fw=new FileWriter("abc.txt");
		fw.write("hello");

		}catch(Exception ex)
		{System.out.println(ex);
		}
		finally
		{
		 System.out.println("finally block is executed..");
		 fw.close();
		}			
			
	}

}
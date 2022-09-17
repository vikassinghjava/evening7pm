import java.io.*;
class Test2
{
public  static void main(String args[])
	{
		
		try(FileWriter fw=new FileWriter("abc.txt"))
		{
				
		fw.write("hello");
		
		}catch(Exception ex)
		{System.out.println(ex);
		}
		
				
			
	}

}
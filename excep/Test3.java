import java.io.*;
class Test3
{
public  static void main(String args[])
	{
		
		try(FileWriter fw=new FileWriter("abc.txt"))
		{
				
		fw.write("hello");
		
		}
		//java-8-9
				
			
	}

}
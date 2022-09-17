package io.questions;
import java.io.File;
import java.io.FileInputStream;
public class Test10  
{
	public static void main(String[] args)  
	{
		
		File f=new File("d:\\apnafolder\\javaclass");
		File fileList[]=f.listFiles();
		
		
		for (File file : fileList) {
			try(FileInputStream fin=new FileInputStream(file))
			{
				int data=0;
				System.out.println(file.getName());
				while((data=fin.read())!=-1) {
					System.out.print(""+(char)data);
				}
				System.out.println();
			}catch(Exception ex) 
			{
				ex.printStackTrace();
			}
		}
	}
}

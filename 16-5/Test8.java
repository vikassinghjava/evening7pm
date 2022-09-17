package io.questions;
import java.io.File;
public class Test8  
{
	public static void main(String[] args)  
	{
		//folder creation
		File f=new File("d:\\apnafolder\\javaclass\\abc.txt");
		//System.out.println(f.isFile()==true?"yes its file":"not a valid file");
		System.out.println(f.isFile()==true?"file name="+f.getName()+",\nfile path="+f.getPath():"not a valid file");
		
	}
}

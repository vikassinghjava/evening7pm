package io.questions;
import java.io.File;
import java.io.FileInputStream;
public class Test11  
{
	public static void main(String[] args)  
	{
		
		File f=new File("c:\\");
		System.out.println(""+f.getTotalSpace()+" bytes  and GB ?");
		System.out.println(""+f.getFreeSpace()+" bytes  and GB ?");
		System.out.println(""+f.getUsableSpace()+" bytes  and GB ?");
	
	}
}

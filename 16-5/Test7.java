package io.questions;
import java.io.File;
public class Test7  
{
	
	public static void main(String[] args)  
	{
		//folder creation
		File f=new File("d:\\apnafolder\\javaclass");
		//if(f.mkdir()==true) {// is used for single directory creation
		if(f.mkdirs()==true) {
			System.out.println("Sucessfully folder created!!");
		}else {
			System.out.println("folder not created!!");
		}
				
	}
}

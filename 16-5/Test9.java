package io.questions;
import java.io.File;
import java.io.FileInputStream;
import java.util.StringTokenizer;
public class Test9  
{
	public static void main(String[] args)  
	{
		//String str="hello how are you";
		//StringTokenizer tokenizer=new StringTokenizer(str);//default space as deliemeter
		
		String str="hello@ how @ are @you";
		StringTokenizer tokenizer=new StringTokenizer(str,"@");//default space as deliemeter
		
		while(tokenizer.hasMoreElements()==true) {
			System.out.println(tokenizer.nextToken());
		}
	}
}

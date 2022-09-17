package io.questions;
import java.io.FileInputStream;
import java.util.StringTokenizer;
public class Test12  
{
	public static void main(String[] args)  
	{
		
		String str="hello@ how @ are @you";
		
		String s[]=str.split("@");
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}

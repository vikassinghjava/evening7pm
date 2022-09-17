package generics;

import java.util.ArrayList;

public class TestCol {
	public static void main(String[] args) {
		
		Integer inobj=new Integer(10);//convert int to Integer objject
		System.out.println(inobj+" : "+inobj.compareTo(100));
		//converting object to primitiev type
		
		int in=inobj.intValue();
		System.out.println(in);
		
		//int x=40,y=40;
		//System.out.println((x < y) ? -1 : ((x == y) ? 0 : 1));
	}
}

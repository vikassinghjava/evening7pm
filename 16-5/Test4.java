package io.questions;
import java.io.FileReader;

class MyAutocloseAbleX  implements AutoCloseable
{
	public void close() throws Exception {
			System.out.println("automatically  AutoCloseable x close() invoked!!");
	}
}

class MyAutocloseAbleY  implements AutoCloseable
{
	public void close() throws Exception {
			System.out.println("automatically  AutoCloseable y close() invoked!!");
	}
}

public class Test4 {
	public static void main(String[] args)  {
		try(MyAutocloseAbleX ableX=new MyAutocloseAbleX();MyAutocloseAbleY ableY=new MyAutocloseAbleY())
		{
			System.out.println("hello");
		}catch(Exception ex) {}
				
	}
}

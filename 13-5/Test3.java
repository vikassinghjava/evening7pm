import java.io.FileReader;

class MyAutocloseAble1 
{
	
	public void close() throws Exception {
			System.out.println("automatically  AutoCloseable close() invoked!!");
	}
}

public class Test3 {
	public static void main(String[] args)  {
		try(MyAutocloseAble1 m=new MyAutocloseAble1())
		{
			//error: The resource type MyAutocloseAble1 does not implement java.lang.AutoCloseable
			System.out.println("hello");
		}catch(Exception ex) {}
				
	}
}

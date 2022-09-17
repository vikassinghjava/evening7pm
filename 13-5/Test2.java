import java.io.FileReader;

class MyAutocloseAble implements AutoCloseable 
{
	@Override
	public void close() throws Exception {
			System.out.println("automatically  AutoCloseable close() invoked!!");
	}
}

public class Test2 {
	public static void main(String[] args)  {
		try(MyAutocloseAble m=new MyAutocloseAble())
		{
			System.out.println("hello");
		}catch(Exception ex) {}
				
	}
}

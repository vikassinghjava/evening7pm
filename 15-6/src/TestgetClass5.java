import java.lang.reflect.Method;
class Demo1{
	
	/*public Demo1() {
	}*/
	
	public Demo1(int x) {
	}
	
	public void show() {System.out.println("hello private show() method");}
	
}
public class TestgetClass5 {
	public static void main(String[] args) throws Exception {
			
				Class c=Class.forName("Demo1");                                       
				//new classname() using reflection
				Demo1 d=(Demo1)c.newInstance();
				d.show();				
	}		
}

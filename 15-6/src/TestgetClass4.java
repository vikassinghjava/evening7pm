import java.lang.reflect.Method;
class Demo{
	private void show() {System.out.println("hello private show() method");}
	private void add(int x,int y) {System.out.println(x+y);}
}
public class TestgetClass4 {
	public static void main(String[] args) throws Exception {
			
				Class c=Class.forName("Demo");                                       
				//new classname() using reflection
				Demo d=(Demo)c.newInstance();
				
				Method m=c.getDeclaredMethod("show");
				m.setAccessible(true);//public
				m.invoke(d);//call
				
				Method m2=c.getDeclaredMethod("add", new Class[]{int.class,int.class});
				m2.setAccessible(true);//public
				m2.invoke(d,10,20);//call
	}		
}

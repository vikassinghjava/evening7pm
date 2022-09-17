import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
class A{}

public class TestgetClass2 {
 public static void main(String[] args) {
	    //Class c=A.class;
	    Class c=int.class;
	    System.out.println(c.getName());
	    System.out.println(c.isPrimitive());
	    
}
}

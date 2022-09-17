import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
class X{}
class Y extends X{}
class Z extends Y{}
*/

public class TestgetClass3 {
 public static void main(String[] args) throws Exception {
	    
	// Class currentClass=Class.forName("java.awt.Frame");
	// Class currentClass=Class.forName("Z");
	 Class currentClass=Class.forName("pack1.Z");
	 Class superClass=currentClass.getSuperclass();
	 //System.out.println(superClass.getName());
	 while(superClass!=null) {
		 System.out.println(superClass.getName());
		 superClass=superClass.getSuperclass();
	 }
	 
}
}

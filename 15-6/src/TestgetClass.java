import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestgetClass {
 public static void main(String[] args) {
	 //public Class getClass();
	 int arr[]=new int[10];
	 Class detailsRef=arr.getClass();
	 System.out.println(detailsRef.getName());  
	 
	 Constructor con[]=detailsRef.getDeclaredConstructors();
		for (Constructor constructor : con) 
		{
			System.out.println(constructor);
		}
		System.out.println("-----------------------------------");
		Method method[]=detailsRef.getDeclaredMethods();
		for (Method m : method) 
		{
			System.out.println(m);
		}
		
		System.out.println("-----------------------------------");
		Field field[]=detailsRef.getDeclaredFields();
		for (Field f : field) 
		{
			System.out.println(f);
		}
}
}

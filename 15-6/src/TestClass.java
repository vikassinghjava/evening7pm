import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Qualified class name!");//with package name
		Class detailsRef=Class.forName(sc.next());
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

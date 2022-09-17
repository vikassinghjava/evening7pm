import java.lang.reflect.*;
class User{
	
	public static void main(String args[])throws Exception {
	
	 CustomClassLOader  cl=new CustomClassLOader();
				Class cref=cl.findClass("Test");
				Object ob = cref.newInstance();
				Method md = cref.getMethod("show");
				md.invoke(ob);
	 
	}
}
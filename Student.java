public class Student extends Object
{
	
	protected void finalize() throws Throwable 
	{
	  System.out.println("Connection has been closed : Object destroyed");
	}
	
	public static void main(String[] args) 
   {   
	  Student s1=new Student();
	  s1=null;
  	Student s2=new Student();
	  s2=null;

	  Student s3=new Student();
	  s3=null;	
	  //How to call the garbage collector
	  System.gc();// calling to GC
   }
}















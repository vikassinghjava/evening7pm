import java.io.Serializable;

public class Student implements Serializable{
   String name="student";
   void display() {
	   System.out.println("display");
   }
   static int s=10;
   static void display2() {
	   System.out.println(s);
   }
}

 class WiproEmployee implements Serializable{
	 String name="Wipro";
}
 
 class TCSEmployee implements Serializable{
	 String name="TCS";
}

 
 
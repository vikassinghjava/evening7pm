
public class RunMyThread {
  
	public static void main(String[] args) {
		Mythread m1=new Mythread(10);
		m1.setPriority(7);
		
		Mythread m2=new Mythread(20);
		m1.start(); m2.start();
   }
}


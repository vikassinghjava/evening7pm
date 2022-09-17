
public class RunShared {
	public static void main(String[] args) {
			
			Shared s1=new Shared();
			Thread th1=new Thread(s1,"thread0");
			Thread th2=new Thread(s1,"thread1");
			Thread th3=new Thread(s1,"thread2");
			th1.start(); th2.start(); th3.start();
	}
}

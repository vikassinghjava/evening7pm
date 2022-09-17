
public class User {
	public static void main(String[] args) {
		
		Train t1=new Train(1);
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t1);
		Thread th3=new Thread(t1);
		th1.start(); th2.start(); th3.start();
	}
}

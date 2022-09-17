
public class RunThread2{
	
	public static void main(String[] args) {
			Thread1 th1=new Thread1();
			Thread2 th2=new Thread2();
			Thread t1=new Thread(th1, "thread1");
			Thread t2=new Thread(th2, "thread2");
			t1.start(); t2.start();
			for(int i=1;i<=5;i++) {
				try {
					System.out.println("bye : "+Thread.currentThread().getName());
					Thread.sleep(1000);
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
	}
	
}


public class RunThread2 {

		public static void main(String[] args) {
			Thread1 th1=new Thread1();
			Thread2 th2=new Thread2();
			
			Thread t1=new Thread(th1, "custom-name-thread1");
			Thread t2=new Thread(th2, "custom-name-thread2");
			t1.start(); t2.start();
			
			for(int i=1;i<=5;i++) {
				System.out.println("main : "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception ex) {}
			}
		}
}

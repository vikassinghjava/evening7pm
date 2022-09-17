
public class Thread1 implements Runnable{

		public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("hello : "+Thread.currentThread().getName()+"priority : "+Thread.currentThread().getPriority());
					try {Thread.sleep(1000);}catch(Exception ex) {}
				}
		}
}

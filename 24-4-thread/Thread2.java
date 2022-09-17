
public class Thread2 implements Runnable{

		public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("hi : "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
					try {Thread.sleep(1000);}catch(Exception ex) {}
				}
		}
}

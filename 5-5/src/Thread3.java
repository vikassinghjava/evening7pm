
public class Thread3 implements Runnable{
	int x;
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
			System.out.println("hi :" + Thread.currentThread().getName()+ x );
			if(Thread.currentThread().getName().equalsIgnoreCase("t1 thread")) 
			{
				this.x=2000;
			}
			Thread.sleep(1000);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
}

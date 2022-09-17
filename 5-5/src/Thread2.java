
public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
			System.out.println("hi :" + Thread.currentThread().getName());
			Thread.sleep(1000);
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
}

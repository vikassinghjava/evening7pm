
public class RunThread3 {
	
	public static void main(String[] args) {
		
		Thread3 t1=new Thread3();
		t1.x=50;
		
		Thread3 t2=new Thread3();
		t2.x=150;
		
		Thread3 t3=new Thread3();
		t3.x=250;
		
		Thread th1=new Thread(t1,"t1 thread");
		Thread th2=new Thread(t2,"t2 thread");
		Thread th3=new Thread(t3,"t3 thread");
		
		th1.start();
		th2.start();
		th3.start();
		for(int i=1;i<=5;i++) {
			try {
			
				System.out.println("bye : "+Thread.currentThread().getName());
			   Thread.sleep(1000);
			}catch(Exception ex) 
			{
				ex.printStackTrace();
			}
		}
		
	}
	
}

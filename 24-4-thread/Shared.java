
public class Shared implements Runnable {
		int x=10;
		public void run() {
			  Thread th=Thread.currentThread();
			  System.out.println("Hello: "+th.getName()+" "+th.getPriority()+" : "+x);
			  x=x+100;
			  try {Thread.sleep(5000);}catch(Exception ex) {ex.printStackTrace();}
		  }
		
}

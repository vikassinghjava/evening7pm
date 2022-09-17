
public class Mythread2 extends Thread {
	int x;
	public Mythread2(int x) {
		this.x=x;
    }
	
  public void run() {
	  Thread th=Thread.currentThread();
	  System.out.println("Hi: "+th.getName()+" "+th.getPriority()+" : "+x);
	  try {Thread.sleep(1000);}catch(Exception ex) {ex.printStackTrace();}
  }
}


public class Mythread extends Thread {
    
	int x;
	public Mythread(int x) {
		this.x=x;
    }
	
	public void run() {
	  Thread th=Thread.currentThread();
	  System.out.println("Hello: "+th.getName()+" "+th.getPriority()+" : "+x);
	  try {Thread.sleep(1000);}catch(Exception ex) {ex.printStackTrace();}
  }
  
}

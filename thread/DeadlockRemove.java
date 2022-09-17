

public class DeadlockRemove {
	public static void main(String[] args) {
		
		String resource1="resource1";
		String resource2="resource2";
		
		Thread th1=new Thread()
		{
			public void run() 
			{
				synchronized (resource1) 
				{
				    System.out.println("resource1 locked and waiting to lock for resource2"+Thread.currentThread().getName());	
				    synchronized (resource2) 
					{
				    	System.out.println("resource2 sucessfully locked..");
					}
				}
			}
		};
		th1.setName("Thread-One");
		th1.start();
		
		Thread th2=new Thread()
		{
			public void run() 
			{
				synchronized (resource1) 
				{
					System.out.println("resource1 locked and waiting to lock for resource2"+Thread.currentThread().getName());	
				    synchronized (resource2) 
					{
				    	System.out.println("resource2 sucessfully locked..");
					}
				}
			}
		};
		th2.setName("Thread-Two");
		th2.start();
		
	}

}

public class DeadLock {
	public static void main(String[] args) {
		
		 String resource1="resource1";
		 String resource2="resource2";
		
		Thread th1=new Thread()
		{
			public void run() 
			{
				synchronized (resource1) 
				{
				  System.out.println("resource1 locked and waiting to lock for resource2");	
				    synchronized (resource2) 
					{
				    	System.out.println("resource2 sucessfully locked..");
					}
				}
			}
		};
		th1.start();
		
		Thread th2=new Thread()
		{
			public void run() 
			{
				synchronized (resource2) 
				{
					System.out.println("resource2 locked and waiting to lock for resource1");	
				    synchronized (resource1) 
					{
				    	System.out.println("resource1 sucessfully locked..");
					}
				}
			}
		};
		th2.start();
		
	}

}

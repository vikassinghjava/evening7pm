public class Customer 
{ 	
	@Override
	protected void finalize() throws Throwable 
	{
	  System.out.println("Finalised is called!!!: object is destroyed");
	}
	
	static void get() {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
	}
	
	public static void main(String[] args) {
		get();

		for(int i=1;i<=10000;i++) {
			Runtime.getRuntime().gc();
		}
		//Runtime r=Runtime.getRuntime();
		//r.gc();
	} 
}















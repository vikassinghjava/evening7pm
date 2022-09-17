class Test2
{

   	public static void main(String args[])
	{
	System.out.println("Hello");
	try{
		int x=10/0;
		System.out.println(x);	

	}catch(ArithmeticException ex){
		System.out.println("Denominator should not be zero : "+ex);	
	}
	
	System.out.println("Hello Javahub");
	
                 }
}
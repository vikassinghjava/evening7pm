//Single catch block:-
class  TestMulti
{	public static void main(String args[])
	{
	     System.out.println("hello");
	     	try{
		    int x=10/0;
		    System.out.println(x);//5
		    int arr[]=new int[]{1,2,3,4};//0 1 2 3
                                        System.out.println(arr[1]);
		}
		catch(ArithmeticException ex){
		  System.out.println("Something going wrong!!!"+ex);
		}
		catch(Exception ex){
		  System.out.println("Something going wrong!!!"+ex);
		}
		
		 System.out.println("Hello Javahub");		  		
	}

}
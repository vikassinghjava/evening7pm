///multiple catch block
public class Temp14 
{ 

	public static void main(String[] args) 
   {   	
			System.out.println("Hello");
			try {
			
				int x=10/1;
				System.out.println(x);
				
				int arr[]=new int[5];//0 1 2 3 4  
				System.out.println(arr[10]);
				
			    }catch(ArithmeticException ex) 
				{
				  System.out.println("Deniminator should not be zero"+ex);  
			    }
				catch(ArrayIndexOutOfBoundsException ex) 
				{
				  System.out.println("Wroong index : "+ex);  
			    }
			
			System.out.println("Hello javahub");
			
   }
}















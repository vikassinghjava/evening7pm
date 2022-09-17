public class Test17 {
	
	public static void main(String[] args) {
		int j=1;
		for(int i=1; i<=5; i++)
		{
				for( j=1;j<=5;j++)
				{
				 	 System.out.print(j);
				}
				System.out.println();
				for(int k=5;k>=i;k--) 
				{
					System.out.print(k);
				}
		}
		
	}
	
}

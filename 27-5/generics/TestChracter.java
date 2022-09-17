package generics;

public class TestChracter {
	public static void main(String[] args) {
		
		char ch[]= {'a','F','c','#'};
		for(char c : ch)
		{
			if(Character.isLowerCase(c) ) 
			{
				System.out.println(c);
				
			}
			else if(Character.isUpperCase(c) ) 
			{
				System.out.println(c);
			}	
			
		} 
	}
}

import java.util.*;

public class TestSwitch4 {
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
	    
		String str=sc.next();
	    
		System.out.println("Enter first no");
	    int n1=sc.nextInt();
	    
	    System.out.println("Enter second no");
	    int n2=sc.nextInt();
	    
	    switch(str) 
	    {
	        case "add":
	        	System.out.println(n1+n2);
	        	
	        	break;
	        case "subtract":
	        	System.out.println(n1-n2);
	        	break;
	        case "multiply":
	        	System.out.println("case2");
	        	break;
	        case "divide":
	        	System.out.println("case2");
	        	break;	
	        default :
	        	System.out.println("Wrong choice!!");
	    }
	    
	}
}

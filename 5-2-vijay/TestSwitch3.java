import java.util.*;

public class TestSwitch3 {
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
	    
		String str=sc.next();
	    
	    
	    switch(str) 
	    {
	        case "vikas":
	        	System.out.println("case1");
	        	break;
	        case "ravi":
	        	System.out.println("case2");
	        	break;
	        default :
	        	System.out.println("Wrong choice!!");
	    }
	    
	}
}

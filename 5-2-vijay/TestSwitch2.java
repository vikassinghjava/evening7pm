import java.util.*;

public class TestSwitch2 {
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
	    
		String str=sc.next();
	    char ch=str.charAt(0);
	    
	    switch(ch) 
	    {
	        case 'a':
	        	System.out.println("case1");
	        	break;
	        case 'b':
	        	System.out.println("case2");
	        	break;
	        default :
	        	System.out.println("Wrong choice!!");
	    }
	    
	}
}

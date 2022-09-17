import java.util.*;

public class TestSwitch {
	
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
	    int option=sc.nextInt();
	    
	    switch(option) 
	    {
	        case 1:
	        	System.out.println("case1");
	        	break;
	        case 2:
	        	System.out.println("case2");
	        	break;
	        default :
	        	System.out.println("Wrong choice!!");
	    }
	    
	}
}

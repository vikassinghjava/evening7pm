package test2;
public class Test7 {
	
	   public static void reverse(String str) 
	   {
		     if(str==null || str.length()<=1) 
		     {
		    	 System.out.println(str);;
		     }
		     else 
		     {
		    	 System.out.println(str.substring(0, str.length()-1));
		    	reverse(str.substring(0, str.length()-1)); 
		     }
		     
	   }
		public static void main(String[] args) {
			reverse("hello");
		}
}

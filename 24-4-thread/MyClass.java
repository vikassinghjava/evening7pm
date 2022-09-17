class MyClass {
	
     
    
     
     
     static void mash(int[] b) {
         System.out.println(b[0]);
     }
     
     static void crunch(int[] a) {
         mash(a);
     }
     
     public static void main(String[] args) {
         crunch(null);
     }
 }

public class TestLambda {
		public static void main(String[] args) {
			
			Runnable r=()->System.out.println("hello run");
			
			Thread th=new Thread(r);
			th.start();
			
		}
}

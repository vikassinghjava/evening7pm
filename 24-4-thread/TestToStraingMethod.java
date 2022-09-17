
public class TestToStraingMethod{
	
	
	public String toString() {
		return "hello";
	}

	public int hashCode() {
		return 12345;
	}
	
	public static void main(String[] args) {
		
		
			TestToStraingMethod t=new TestToStraingMethod();
			System.out.println(t.hashCode());
			
			System.out.println(t);//t automatically call the toString() method of Object class
			System.out.println(t.toString());
			
			Thread th=Thread.currentThread();
			System.out.println(th);
			
			String s=new String("hello");
			System.out.println(s);
	}

}

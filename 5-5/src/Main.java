class B {
	int a=10;
	static {
		System.out.println("static block");
	}
	{
		System.out.println("instamce block");
	}
	public void m1()throws RuntimeException {
		
	}
	public void m2()throws Exception {
		
	}
}

class A extends B {

	public void m1() throws RuntimeException {
		
	}
	public void m2() throws Exception {
		
	}
}

public class Main {
	
	public static void main(String[] args) {
	 B aobj=new A();
	 System.out.println(aobj.a);
	}

}

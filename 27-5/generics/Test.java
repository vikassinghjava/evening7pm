package generics;

public class Test {
	Object obj;

	Test(Object obj) {
		this.obj = obj;
	}

	Object getValue() {
		return obj;
	}

	public static void main(String[] args) {
		
		//Test t = new Test("Hello");
		Test t = new Test(true);//not type safe
		String str=(String)t.getValue();//explicit type cpnversion
		System.out.println(str);
		
		
	}
	
	
}

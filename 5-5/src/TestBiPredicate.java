import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestBiPredicate {
	
	public static void main(String[] args) {
			
		BiPredicate<Integer, Integer> bp=(in1,in2)->(in1+in2)%2==0;
		System.out.println(bp.test(10, 20));		
		System.out.println(bp.test(10, 21));
	}

}

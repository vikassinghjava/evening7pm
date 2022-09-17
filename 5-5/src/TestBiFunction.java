import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestBiFunction {
	
	public static void main(String[] args) {
			
		BiFunction<Integer, Integer, Integer> bif=(a,b)->a*b;
		System.out.println(bif.apply(10, 20));
		System.out.println(bif.apply(11, 22));
	}

}

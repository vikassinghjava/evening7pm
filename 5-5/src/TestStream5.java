import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestStream5 {
 public static void main(String[] args) {
	 	
	Stream<Integer> s=Stream.of(1,2,3,4,5,6);
	s.forEach(System.out::println);
	
	Stream<Double> s2=Stream.of(1.0,2.0,3.0,4.0,5.0,6.8);
	s2.forEach(System.out::println);
	
	
	/*s.forEach(new Consumer<Integer>() {
		@Override
		public void accept(Integer t) {
		System.out.println(t);	
		}
	});*/
	
	
 }

}

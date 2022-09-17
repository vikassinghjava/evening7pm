import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestConsumer {
 public static void main(String[] args) {
	Consumer<String> c=cc->{
		System.out.println(cc);
	};
	
	c.accept("hello");
	c.accept("hello java");
	c.accept("hello java hub");
}
}

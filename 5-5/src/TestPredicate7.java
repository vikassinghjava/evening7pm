import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate7 {
 public static void main(String[] args) {
	Predicate<User> p=user->user.name.equals("vikas") && user.password.equals("vikas");
	User u=new User("vikas", "vikas");
	check(p, u);
 }
 
public static void check(Predicate<User> p,User user) {
	if(p.test(user)) {
		System.out.println("Valid user :"+user.getName()+", "+user.getPassword());
	}
}
}

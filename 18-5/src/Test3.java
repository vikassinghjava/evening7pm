import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
	public static void main(String[] args) {
		
			//Pattern p=Pattern.compile("[a-d]");
		    //Pattern p=Pattern.compile("[^a-d]");
		    //Pattern p=Pattern.compile("[0-9]");
		//Pattern p=Pattern.compile("[0123456789]");
		//Pattern p=Pattern.compile("[a-zA-Z0-9]");
		Pattern p=Pattern.compile("[^a-zA-Z0-9]");
			Matcher matcher=p.matcher("@x4z tu");//space and @
			System.out.println(matcher.find());
	}
}

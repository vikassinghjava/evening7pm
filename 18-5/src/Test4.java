import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
	public static void main(String[] args) {

		//Pattern p = Pattern.compile("\\s");
		//Pattern p = Pattern.compile("\\D");
		//Pattern p = Pattern.compile("\\w");
		Pattern p = Pattern.compile("\\W");
		Matcher matcher = p.matcher("avcdjg");// space and @
		System.out.println(matcher.find());
	}
}

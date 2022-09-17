import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
			
		Pattern p=Pattern.compile("xy");
		Matcher match=p.matcher("xyxyxxxy");
		
		//System.out.println(match.find());
		while(match.find()==true) {
			System.out.println(match.group()+""+match.start()+""+match.end());
		}
		
	}
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
			
		Pattern p=Pattern.compile("xy");
		Matcher match=p.matcher("xyxyxxxy");
		
		//System.out.println(match.find());
		int count=0;
		while(match.find()==true) {
			count++;
			System.out.println(match.group()+""+match.start()+""+match.end());
		}
		System.out.println("xy: "+count);
		
	}
}

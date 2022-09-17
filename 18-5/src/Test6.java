import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
	public static void main(String[] args) {
		
		//Pattern p=Pattern.compile("[6789][0-9][0-9][0-9][ 0-9][ 0-9][ 0-9][ 0-9][ 0-9][ 0-9]");
		//Pattern p=Pattern.compile("(0/91)?[7-9][0-9]{9}");
		//^\\d{10}$
		Pattern p=Pattern.compile("^\\d{10}$");
		Matcher m=p.matcher("8094108838");
		System.out.println(m.find() && m.group().equals("7094108838")?"Valid ":"Not valid");
		
	}
}

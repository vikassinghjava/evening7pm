import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {
	public static void main(String[] args) {
		String str="javahubcare@javahubindia.com";
		String splt[]=str.split("[@.]");//regex
		//System.out.println(splt[0]+" "+splt[1]);
		for(String s:splt) 
		{
			System.out.println(s);
		}
	}
}

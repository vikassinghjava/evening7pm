import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test4 {
	public static void main(String[] args) throws Exception{
		System.out.print("hello");
		//out is already coonected to os default outout device(console).
		//int x1=10;
		//int x2=20;
		//x1=x2;
		PrintStream myout=new PrintStream("d:\\myoutput.txt");
		System.setOut(myout);//out=myout
		System.out.print("hello myoutput log");
		System.out.print("hello myoutput log");
		System.out.print("hello myoutput log");
		System.out.print("hello myoutput log");
		System.out.print("hello myoutput log");
		
	}
}

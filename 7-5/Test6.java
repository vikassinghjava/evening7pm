import java.io.*;

public class Test6 {
	public static void main(String[] args) throws Exception{
		
		long stime=System.currentTimeMillis();
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream("d:\\abc.txt"));
		
		BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("d:\\abc2.txt"));
		//logic write to copy the content of file into another file
		
		
		long etime=System.currentTimeMillis();
		
		System.out.println(etime-stime);//ms
	}
}

import java.io.*;

public class Test6 {
	public static void main(String[] args) throws Exception{
		
		long stime=System.currentTimeMillis();
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream("d:\\abc.wmv"));
		
		BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("d:\\abc2.wmv"));
		//logic write to copy the content of file into another file
		
		int i=0;
		while((i=bin.read())!=-1) {
			bout.write(i);
		}
		
		long etime=System.currentTimeMillis();
		
		System.out.println(etime-stime);//ms
	}
}

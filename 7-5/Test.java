import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("d:\\abc.txt");//ab
		//int i=fin.read();
		//int j=fin.read();
		//int k=fin.read();
		//System.out.println((char)i+" "+(char)j+" "+k);
		int i=0;
		while(((i=fin.read())!=-1)==true) {
			System.out.print((char)i);
		}
		
	}
}

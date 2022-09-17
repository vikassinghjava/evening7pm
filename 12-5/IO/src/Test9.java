import java.io.*;

public class Test9 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin1=new FileInputStream("d:\\abc2.txt");
		FileInputStream fin2=new FileInputStream("d:\\abc3.txt");
		
		SequenceInputStream seq=new SequenceInputStream(fin1, fin2);
		int i=0;
		while((i=seq.read())!=-1) {
			System.out.println((char)i);
		}
		System.out.println("Done");
		
		
	}
}

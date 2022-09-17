import java.io.*;

public class Test7 {
	public static void main(String[] args) throws Exception{
		
		DataInputStream din=new DataInputStream(new FileInputStream("d:\\abc.txt"));
		int count=0;
		String strLine;
		while((strLine=din.readLine())!=null) {
			System.out.println(strLine);
			
			 count+=1;		
			//count=count+1;
		}
		System.out.println(count);
	}
}

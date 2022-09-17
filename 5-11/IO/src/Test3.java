import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception{
		//FileInputStream fin=new FileInputStream("d:\\abc2.txt");
		//FileOutputStream fout=new FileOutputStream("d:\\abc3.txt");
		
		FileInputStream fin=new FileInputStream("d:\\abc.wmv");
		FileOutputStream fout=new FileOutputStream("d:\\abc3.wmv");
		
		int i=0;
		while((i=fin.read())!=-1) {
			fout.write(i);
		}
		fin.close();
		fout.close();
		System.out.println("succsfuly done!!");
		
	}
}

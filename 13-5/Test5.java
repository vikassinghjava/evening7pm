import java.io.FileReader;
import java.io.FileWriter;
public class Test5 {
	public static void main(String[] args)  {
		
		try(FileReader reader=new FileReader("d:\\abc.txt");FileWriter writer=new FileWriter("d:\\abcout.txt"))
		{
			int  readData=0;
			while((readData=reader.read())!=-1) {
				writer.write(readData);
			}
			System.out.println("Done!!!");
		}catch(Exception ex) 
		{
			System.out.println(ex);
		}
				
	}
}

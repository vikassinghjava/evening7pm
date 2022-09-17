import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception{
		//FileOutputStream fout=new FileOutputStream("d:\\abc2.txt");
		FileOutputStream fout=new FileOutputStream("d:\\abc2.txt",true);
		//data to write into file
		String str="Rahul gandhi nowdays enjoing in nepal with chinese deplomates!";
		byte data[]=str.getBytes();
		//		
		fout.write(data);
		fout.close();
		System.out.println("succsfuly done!!");
		
	}
}

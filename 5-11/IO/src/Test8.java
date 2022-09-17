import java.io.*;

public class Test8 {
	public static void main(String[] args) throws Exception{
		
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("d:\\abc12.txt"));
		String str="hello javahub ";
		dout.writeBytes(str);
		System.out.println("done!");
		
	}
}

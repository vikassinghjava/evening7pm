package networking;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) 
	{
			//Socket socket=new Socket("127.0.0.1", 888);
		    /*Socket socket=new Socket("localhost", 888);
	     	OutputStream outputStream=socket.getOutputStream();
		    PrintStream out=new PrintStream(outputStream); 
		     out.print("hello server how are You!!!");
		     socket.close();
		     outputStream.close();
		     out.close();
			*/
		
			try(Socket socket=new Socket("localhost", 888);	OutputStream outputStream=socket.getOutputStream();PrintStream out=new PrintStream(outputStream))
			{
				out.println("hello server how are You!!!");
				
				
			}catch(Exception ex) 
			{
				System.out.println(ex);
			}
		
	}
}

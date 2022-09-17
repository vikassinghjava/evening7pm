package networking;
import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String[] args) 
	{
			/*ServerSocket ss=new ServerSocket(888);
			Socket s=ss.accept();
		    System.out.println(s!=null?"Connected":"not connected");
		    
		    //InputStream inputStream=s.getInputStream();
		    //BufferedInputStream bufferStream=new BufferedInputStream(inputStream);
		    BufferedInputStream bufferStream=new BufferedInputStream(s.getInputStream());
		    int i;
		    while((i=bufferStream.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		    ss.close();
		    s.close();
		    bufferStream.close();*/
		
		try(ServerSocket ss=new ServerSocket(888);Socket s=ss.accept();BufferedInputStream bufferStream=new BufferedInputStream(s.getInputStream()))
		{
			System.out.println(s!=null?"Connected":"not connected");
			int i;
		    while((i=bufferStream.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
	}
}


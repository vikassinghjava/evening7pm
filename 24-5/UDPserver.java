import java.net.*;

public class UDPserver 
{
	public static void main(String[] args) throws Exception
	{
DatagramSocket ds=new DatagramSocket();
		
String str="india is good country with corrupted leaders";
		
byte b[]=str.getBytes(); 
DatagramPacket dp=new DatagramPacket(b,b.length,InetAddress.getLocalHost(),5555);
		
		
		ds.send(dp);
	}

}

import java.net.InetAddress;

public class TestIP  extends Object{
	
	public static void main(String[] args) throws Exception {
		//InetAddress  address=InetAddress.getByName("localhost");
		//System.out.println(address);
		InetAddress address[]=InetAddress.getAllByName("localhost");
		for(InetAddress address2:address) {
			System.out.println(address2);
		}
	}

}

import java.io.BufferedInputStream;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;

public class CallApi2 {
	public static void main(String[] args) throws Exception {
		String urlString = "https://www.google.com/";//api
		URL url = new URL(urlString);
		
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(connection.getInputStream());
		int a;
		while ((a = bufferedInputStream.read()) != -1) {
			System.out.print((char) a);
		}
		bufferedInputStream.close();
	}
}

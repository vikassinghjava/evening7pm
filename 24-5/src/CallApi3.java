import java.io.BufferedInputStream;
import java.net.*;

import javax.net.ssl.HttpsURLConnection;

public class CallApi3 {
	public static void main(String[] args) throws Exception {
		//String urlString = "http://localhost:8080/hello";//api
		//String urlString = "http://localhost:8080/hello?id=101&name=kanchu";
		//String urlString = "http://localhost:8080/hello1?id=102&name=manchu";
		String urlString = "http://localhost:8080/add?num1=100&num2=200";
		URL url = new URL(urlString);
		
		//HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(connection.getInputStream());
		int a;
		while ((a = bufferedInputStream.read()) != -1) {
			System.out.print((char) a);
		}
		bufferedInputStream.close();
	}
}

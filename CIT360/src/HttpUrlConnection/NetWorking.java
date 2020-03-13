package HttpUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class NetWorking {
	private static Scanner in;
	
	public static void main(String args[]) throws IOException{
		try{
			
		
		in = new Scanner(System.in);
		String email = null;
		String password = null;
		System.out.println("Enter email address here: ");
		email = in.next();
		
		System.out.println("Enter your password here: ");
		password = in.next();
		
		String urlLink = "http://localhost/java/java.php?email="+email+"&password="+password;
		URL url = new URL(urlLink);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		int statusCode = conn.getResponseCode();
		System.out.println(statusCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		StringBuffer sb = new StringBuffer();
		String line;
		while((line = in.readLine()) !=null) {
			sb.append(line);
		}
		System.out.println("close connection");
		in.close();
		System.out.println(sb.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
}
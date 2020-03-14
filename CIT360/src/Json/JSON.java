package Json;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;



class JSON {



   public static void main(String[] args){
	   makeJSON();
	   readJSON();
   }
   
   public static void makeJSON() {

	   Scanner input = new Scanner(System.in);

	   JSONObject obj1 = new JSONObject();

	   JSONObject obj2 = new JSONObject();

	   

	   System.out.println("First Name: ");

	   String firstname = input.nextLine();

	   System.out.println("Last Name: ");

	   String lastname = input.nextLine();

	   System.out.println("Email: ");

	   String email = input.nextLine();

	   System.out.println("Phone: ");

	   String phone = input.nextLine();

	   

	  obj1.put("Last Name: ", lastname);

	  obj1.put("First Name: ", firstname);

	  obj1.put("Email: ", email);

	  obj1.put("Phone: ", phone);

	  

	  obj2.put("Last Name: ", "Mark");

	  obj2.put("First Name: ", "Johnson");

	  obj2.put("Email: ", "M.Johnson@gmail.com");

	  obj2.put("Phone: ", "9725422146");

	  

      System.out.print(obj1);

      System.out.println();

      System.out.print(obj2);
      
      System.out.println();
      
      
   }
   
   public static void readJSON() {
      
      
      try {
      
    	String urlLink = "https://jsonplaceholder.typicode.com/todos/1";
    	
		URL url = new URL(urlLink);
		
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("GET");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		StringBuffer sb = new StringBuffer();
		
		String line;
		
		while((line = in.readLine()) !=null) {
			
			sb.append(line);
			
		}
      
      
      JSONParser parser = new JSONParser();
      
      JSONObject result = (JSONObject) parser.parse(sb.toString());
      
      System.out.println(result);
      
      System.out.println();
    		  
      } catch (Exception e) {
    	  
    	  System.out.println(e.getMessage());
    	  
      }

   }

}
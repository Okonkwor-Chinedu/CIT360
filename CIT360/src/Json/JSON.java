package Json;
import java.util.Scanner;

import org.json.simple.JSONObject;



class JSON {



   public static void main(String[] args){

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

   }

}
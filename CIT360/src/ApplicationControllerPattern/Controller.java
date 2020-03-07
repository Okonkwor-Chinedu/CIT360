package ApplicationControllerPattern;

import java.util.HashMap;

public class Controller {

public static HashMap<String, solve> key = new HashMap <String, solve>();

	

	public  Controller(){

		

	}

	public static void handleOperator(String operator, Integer input1, Integer input2){

		key.put("+", new add());

		key.put("-", new Subtraction());

		solve handler = key.get(operator);

		handler.execute(input1, input2);

	}

}
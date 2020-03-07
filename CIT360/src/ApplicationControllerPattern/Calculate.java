package ApplicationControllerPattern;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {

		try{

			Scanner input = new Scanner(System.in);

			Controller calculate = new Controller();

			Integer input1;

			Integer input2;

		

			String operator;

		

			System.out.println("Ask user for a number");

			input1 = Integer.parseInt(input.nextLine());

		

			System.out.println("Choose an oppression sign you will like to use (+, -,) ");

			operator = input.nextLine();

		

			System.out.println("Ask user for a number");

			input2 = Integer.parseInt(input.nextLine());

		

			System.out.println("Your answer is");

		

			calculate.handleOperator(operator,input1,input2);	

		

		}catch (NumberFormatException ex) {

			System.out.println(" ");

			System.out.println("Please Enter Valid Numbers");

	    	System.out.println(" ");

	    	Scanner input = new Scanner(System.in);

			Controller calculate = new Controller();

			Integer input1;

			Integer input2;

		

			String operator;

		

			System.out.println("Enter a number ");

			input1 = Integer.parseInt(input.nextLine());

		

			System.out.println("Enter the math operation (+, -, *, /) ");

			operator = input.nextLine();

		

			System.out.println("Enter a number ");

			input2 = Integer.parseInt(input.nextLine());

		

			System.out.println("The result is");

		

			calculate.handleOperator(operator,input1,input2);

		}

	}

}
package MVC;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;





public class CalculatorController {

	

	private CalculatorView theView;

	private CalculatorModel theModel;

	

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

		this.theView = theView;

		this.theModel = theModel;

		

		this.theView.addCalculateListener(new CalculateListener());

	}

	

	class CalculateListener implements ActionListener{



		public void actionPerformed(ActionEvent e) {

			

			int firstNumber, secondNumber = 0;

			

			try{

			

				theModel.setFirstNumber(theView.getFirstNumber());

				theModel.setSecondNumber(theView.getSecondNumber());

				

				int solution = theModel.getFirstNumber() + theModel.getSecondNumber();

				

				theView.setCalcSolution(solution);

			

			}



			catch(NumberFormatException ex){

				

				System.out.println(ex);

				

				theView.displayErrorMessage("You Need to Enter 2 Integers");

				

			}

			

		}

		

	}

	

}
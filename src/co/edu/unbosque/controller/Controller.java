/**
 * Package containing the class
 */
package co.edu.unbosque.controller;
import co.edu.unbosque.model.Fibonacci;
import co.edu.unbosque.view.View;

/**
 * 
 * @author Santiago Acevedo Rodríguez and Fabián Camilo Gómez Céspedes
 *
 */
public class Controller {
	
	/**
	 * fibo is the instance of Fibonacci.
	 */
	private Fibonacci fibo;
	
	/**
	 * view is the instance of View.
	 */
	private View view;

	/**
	 * This method verifies that the received String only has numbers. <b>pre</b>The
	 * parameter String must be a number.<br>
	 * <b>post</b> If the method complete correctly is because the String had a
	 * number. In other case the method return a false.<br>
	 * 
	 * @param pNumber is the String number: pNumber need to be != null and != " ".
	 * @return is the boolean value that is returned of the method.
	 */

	public boolean onlyNumbers(String pNumber) {
		for (int i = 0; i < pNumber.length(); i++) {
			char aux = pNumber.charAt(i);
			int digit = aux - '0';
			if (digit > 9 || digit < 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * This constructor define the instances.
	 * <b>pre</b>Must exist declarations of the instances.<br>
	 * <b>post</b>The instances of a class.<br>
	 */
	public Controller() {
		fibo = new Fibonacci();
		view = new View();
		run();

	}

	/**
	 * This method is the execution of the program.
	 * <b>pre</b>The instances in the constructor must be exist.<br>
	 * <b>post</b>The program should show results.<br>
	 */
	public void run() {
		String message = "\n————————————————————————————————————————————————\n"
				+ "         BosqueSW - Divide & Conquer\n" + "————————————————————————————————————————————————\n"
				+ "1. Use Fibonacci sequence\n" + "2. Finish" + "\n";

		view.showMessage(message);
		String option = view.readData();
		switch (option) {
		case "1":
			view.showMessage("Write the position in the fibonnaci sequence");
			String s = view.readData();
			while (!onlyNumbers(s) || s.equals("")) {
				view.showMessage("Error. Rewrite the position in the fibonnaci sequence");
				s = view.readData();
			}
			long n = Long.parseLong(s);
			view.showMessage("The sequence of fibonnaci on the position " + n + " is "
					+ String.valueOf(fibo.fibonacciRecursive(n)));
			run();
			break;
		case "2":
			view.showMessage("See you soon");
			System.exit(0);
			break;
		default:
			view.showMessage("Invalid option, please try again");
			run();
			break;
		}
	}
}

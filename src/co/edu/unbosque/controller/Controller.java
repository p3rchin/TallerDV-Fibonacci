package co.edu.unbosque.controller;

import co.edu.unbosque.model.Fibonacci;
import co.edu.unbosque.view.View;

public class Controller {
	private Fibonacci fibo;
	private View view;

	public Controller() {
		fibo = new Fibonacci();
		view = new View();
		run();

	}

	public void run() {
		String message = "\n————————————————————————————————————————————————\n"
				+ "         BosqueSW - Divide & Conquer\n" + "————————————————————————————————————————————————\n"
				+ "1. Use Fibonacci sequence\n" + "2. Finish" + "\n";

		view.showMessage(message);
		int option = Integer.parseInt(view.readData());
		switch (option) {
		case 1:
			view.showMessage("Write the position in the fibonnaci sequence");
			long n = Long.parseLong(view.readData());
			view.showMessage("the sequence of fibonnaci on the position " + n + " is "
					+ String.valueOf(fibo.fibonacciRecursive(n)));

			run();
			break;
		case 2:
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

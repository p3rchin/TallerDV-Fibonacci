package co.edu.unbosque.model;

public class Fibonacci {

	public Fibonacci() {

	}

	public static long fibonacciRecursive(long n) {
		if (n < 2) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
	
	
	
}

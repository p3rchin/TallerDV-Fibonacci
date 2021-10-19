/**
 * Package containing the class
 */
package co.edu.unbosque.model;

/**
 * 
 * @author Santiago Acevedo Rodr�guez and Fabi�n Camilo G�mez C�spedes
 *
 */
public class Fibonacci {


	/**
	 * This method show the Fibonacci secuence.
	 * <b>pre</b>Must be given a position.<br>
	 * <b>post</b>The secuence must be showed until the position.<br>
	 * @param n is the position. n != null and n >= 0.
	 * @return is the recursive way of the method.
	 */
	public static long fibonacciRecursive(long n) {
		if (n < 2) {
			return n;

		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}
}

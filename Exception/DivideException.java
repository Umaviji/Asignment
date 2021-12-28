
package Exception;

import java.util.Scanner;

public class DivideException {
	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter first number(numerator): ");
		int numerator = inputDevice.nextInt();
		System.out.print("Please enter second number(denominator): ");
		int denominator = inputDevice.nextInt();
		new DivideException().doDivide(numerator, denominator);
	}

	public void doDivide(int a, int b) {
		float result = a / b;
		System.out.println("Division result of: " + a + "/" + b + "= " + result);
	}
}

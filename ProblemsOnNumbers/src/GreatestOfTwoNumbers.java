
/* Greatest of two numbers
 * Problem Statement: Given two numbers. Find the greatest of two numbers.
 * */

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		int number1 = 6;
		int number2 = 13;
		// System.out.println("Greatest of the two numbers " + number1 + " and " +
		// number2 + " is " + Math.max(number1, number2));

		if (number1 > number2) {
			System.out.println(number1 + " is greater than " + number2);
		} else {
			System.out.println(number2 + " is greater than " + number1);
		}
	}

}

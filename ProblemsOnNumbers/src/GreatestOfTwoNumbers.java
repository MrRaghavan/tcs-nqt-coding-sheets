
/* Greatest of two numbers
 * Problem Statement: Given two numbers. Find the greatest of two numbers.
 * */

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
		int number1 = 6;
		int number2 = 13;
		System.out.println("Greatest of the two numbers " + number1 + " and " + number2 + " is " + Math.max(number1, number2));

		double number3 = 1.123;
		double number4 = 1.134;
		
		if (number3 > number4) {
			System.out.println(number3 + " is greater than " + number4);
		} else {
			System.out.println(number4 + " is greater than " + number3);
		}
	}

}

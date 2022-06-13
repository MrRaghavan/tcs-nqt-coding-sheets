/* 
 * Sum Of Digits of A Number
 * Problem Statement: Given an integer, find the sum of digits of that integer.
 * 
 */
public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		int number = 102;
		System.out.println("Sum of digits of the number " + number + " is " + calculateSumOfDigits(number));
	}

	private static int calculateSumOfDigits(int number) {
		int remainder = 0;
		int sum = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum + remainder;
		}
		return sum;
	}

}

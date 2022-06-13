/* Reverse digits of a number
   Problem Statement: Given an integer. Write a program to reverse digits of a number.
*/
public class ReverseDigitsOfNumber {

	public static void main(String[] args) {
		int number = 472;
		System.out.print("Reverse of the number " + number + " is " + calculateReverse(number));
	}

	private static int calculateReverse(int number) {
		int remainder = 0;
		int reverse = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + remainder;
		}
		return reverse;
	}

}

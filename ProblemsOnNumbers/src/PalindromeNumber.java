/*
 * Check if a number is Palindrome or Not
 * Problem Statement:  Given a number check if it is a palindrome.
 * An integer is considered a palindrome when it reads the same backward as forward.
 * 
 */
public class PalindromeNumber {

	public static void main(String[] args) {
		int number = 515;
		System.out.println("The reverse of the number " + number + " is " + calculateReverse(number));
		if (number == calculateReverse(number)) {
			System.out.println("The number " + number + " is a palindrome.");
		} else {
			System.out.println("The number " + number + " is not a palindrome.");
		}
	}

	private static int calculateReverse(int number) {
		int reverse = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + remainder;
		}
		return reverse;
	}

}

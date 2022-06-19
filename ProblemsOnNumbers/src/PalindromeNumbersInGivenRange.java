/*
 *
 * Find all Palindrome Numbers in a given range
 * Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.
 * Note: A palindromic number is a number that remains the same when its digits are reversed.
 * OR a palindrome is a number that reads the same forward and backward Eg: 121,1221, 2552
 * 
 */
public class PalindromeNumbersInGivenRange {

	public static void main(String[] args) {
		int min = 100;
		int max = 150;
		getNumbers(min, max);
	}

	private static void getNumbers(int min, int max) {
		for (int number = min; number <= max; number++) {
			// System.out.println(i);
			int remainder = 0;
			int reverse = 0;
			int temp = number;
			while (temp > 0) {
				remainder = temp % 10;
				temp = temp / 10;
				reverse = reverse * 10 + remainder;
			}
			if (number == reverse) {
				System.out.println("Number " + number + " is a Palindrome.");
			} else {
				System.out.println("Number " + number + " is not a Palindrome.");
			}
		}
	}

}

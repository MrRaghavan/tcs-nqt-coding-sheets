/*
 * Check if the given number is Harshad(Or Niven) Number
 *Problem Statement: Check if the number is a Harshad(or Niven) number or not.
 *
 */
public class HarshadNumber {

	public static void main(String[] args) {
		int number = 379;
		int temp = number;
		int sum = 0;
		int remainder = 0;
		while (number != 0) {
			remainder = number % 10;
			number = number / 10;
			sum = sum + remainder;
		}
		if (temp % sum == 0) {
			System.out.println("The number " + temp + " is a Harshad(Or Niven) number");
		} else {
			System.out.println("The number " + temp + " is not a Harshad(Or Niven) number");
		}
	}

}

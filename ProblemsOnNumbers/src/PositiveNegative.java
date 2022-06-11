/* Check whether a number is positive or negative
 * Problem statement: Given a number n check whether it’s positive or negative.
*/
public class PositiveNegative {

	public static void main(String[] args) {
		int number = -20;
		check(number);
		number = 45;
		check(number);
	}

	private static void check(int number) {
		if (number > 0) {
			System.out.println("Number " + number + " is postive");
		} else {
			System.out.println("Number " + number + " is negative");
		}
	}

}

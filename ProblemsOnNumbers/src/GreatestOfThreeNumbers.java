/* Greatest of three numbers
 * Problem Statement: Given three numbers. Find the greatest of three numbers.
*/
public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		double number1 = 1.187;
		double number2 = 1.165;
		double number3 = 1.125;
		System.out.println("Greatest of the three numbers " + number1 + ", " + number2 + " and " + number3 + " is "
				+ Math.max(number1, Math.max(number2, number3)));

		int number4 = 321;
		int number5 = 167;
		int number6 = 1235;
		if ((number4 > number5) && (number4 > number6)) {
			System.out.println(
					"Greatest of the three numbers " + number4 + ", " + number5 + " and " + number6 + " is " + number4);
		} else if ((number5 > number4) && (number5 > number6)) {
			System.out.println(
					"Greatest of the three numbers " + number4 + ", " + number5 + " and " + number6 + " is " + number5);
		} else {
			System.out.println(
					"Greatest of the three numbers " + number4 + ", " + number5 + " and " + number6 + " is " + number6);
		}
	}

}

/*
 *  Check if given year is a leap year or not
 *  Problem Statement: Check if the given year is a leap year or not.
 *  A year is a leap year only if it satisfies the following condition.
 *  	The year is divisible by 4 but not by 100
 *  	The year is divisible by 400
 *  Check if the year is divisible by 4 or 400 but not by 100 then it is a leap year.
 */
public class LeapYear {

	public static void main(String[] args) {
		int year = 2022;
		checkIfLeapYear(year);
	}

	private static void checkIfLeapYear(int year) {
		if (((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

}

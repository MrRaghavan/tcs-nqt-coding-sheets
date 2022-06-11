/* Check whether a given number is even or odd 
 * Problem Statement: Given a number n, check whether a given number is even or odd. * 
 */


public class EvenOdd {

	public static void main(String[] args) {
		int number = 52;
		if(remainder(number) == 0)
		{
			System.out.println("Number " + number + " is even");
		}
		else
		{
			System.out.println("Number" + number + " is odd");
		}
	}

	private static int remainder(int number) {
		return (number % 2);		
	}	

}

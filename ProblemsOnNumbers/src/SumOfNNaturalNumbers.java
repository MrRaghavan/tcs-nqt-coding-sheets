/*
 * Sum of first N Natural Numbers
 * Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.
 * 
 * Using Formula
 * Intuition: We can use the formula for the sum of N numbers, i.e N(N+1)/2.
 * 
 */
public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		int n = 6;
		calculateSum(n);
		n = 5;
		calculateSumUsingFormula(n);
	}

	private static void calculateSum(int n) {
		int sum = 0;
		for (int i = n; i > 0; i--) {
			sum = sum + i;
		}
		System.out.println("Sum of first " + n + " natural numbers is " + sum);
	}

	private static void calculateSumUsingFormula(int n) {
		int sum = 0;
		sum = n * (n + 1) / 2;
		System.out.println("Sum of first " + n + " natural numbers is " + sum);
	}

}

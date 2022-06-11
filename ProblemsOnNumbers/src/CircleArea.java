/*
 * Calculate the Area of the Circle
 * Problem Statement: Given the radius of the circle, calculate the area of the circle.
 * Area of circle = πr2
 */
public class CircleArea {

	public static void main(String[] args) {
		int radius = 4;
		calculateAreaOfCircle(radius);
	}

	private static void calculateAreaOfCircle(int radius) {
		System.out.println("Area of the circle having radius " + radius + " is " + (3.14 * radius * radius));
	}

}

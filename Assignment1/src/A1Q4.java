
//	Write a Java program that accepts two integers from the user and then prints the sum,
//	the difference, the product, the average, the distance (assuming the two entered 
//	numbers are x,y cartesian coordinate ) from the origin, the maximum (the larger of the two integers),
//	the minimum (smaller of the two integers).
import java.util.*;

public class A1Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;

		System.out.println("Enter the first integer: ");
		num1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		num2 = input.nextInt();

		System.out.println("Sum of two integers: " + (num1 + num2));
		System.out.println("Difference of two integers: " + (num1 - num2));
		System.out.println("Absolute difference = " + Math.abs(num1 - num2));
		System.out.println("Product of two integers: " + (num1 * num2));
		System.out.println("Average of two integers: " + ((num1 + num2) / 2));
		System.out.println("Distance from x coords to origin = " + Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2))));

		if (num1 > num2) {
			System.out.println("Max integer: " + num1);
			System.out.println("Min integer: " + num2);

		} else {
			System.out.println("Max integer: " + num2);
			System.out.println("Min integer: " + num1);
		}

	}
}

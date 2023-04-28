package rectangle;

/**
 * @author Ziad Alawak
 **/
import java.util.Scanner;

public class rectangleCalc {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the length of Rectangle:");
		double a = scanner.nextDouble();
		System.out.println("Please Enter the width of Rectangle:");
		double b = scanner.nextDouble();
		double r = RectangleArea(a, b);
		double m = RectanglePerimeter(a, b);
		System.out.printf("The Rectangle's area is: %.2f", r);
		System.out.println();
		System.out.printf("The Rectangle's Perimeter is: %.2f", m);
		scanner.close();
	}

	public static double RectangleArea(double a, double b) {
		double r = a * b;
		return r;
	}

	public static double RectanglePerimeter(double a, double b) {
		double z = a + b;
		return z;
	}
}

package GCDCal;
/**
 *@author Ziad Alawak
 * **/
import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the First Number:");
				int a = scanner.nextInt();
				System.out.println("Enter the Second Number:");
				int b = scanner.nextInt();

				if (b == 0) {
					System.out.println("The GCD of the first and second is:" + a + " :)");
				} else if ((a % b) == 0) {
					System.out.println("The GCD of the first and second is:" + b + " :)");
				} else {
					int r = a % b;
					while (r != 0) {
						a = b;
						b = r;
						r = a % b;
					}
					System.out.println("The GCD of the first and second is:" + b + " :)");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}

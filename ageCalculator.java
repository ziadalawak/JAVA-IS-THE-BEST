package oldCalcu;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCa {

	public static void main(String[] args) {
		while (true) {
			boolean validInput = false;

			while (!validInput) {
				System.out.println("please enter your birthday:");
				System.out.println("Year: ");
				int a = new Scanner(System.in).nextInt();
				System.out.println("Month: ");
				int b = new Scanner(System.in).nextInt();
				System.out.println("Day: ");
				int c = new Scanner(System.in).nextInt();
				if (b < 1 || b > 12) {
					System.out.println("Invalid input for month. Please enter a value between 1 and 12.");
				} else if (c < 1 || c > 31) {
					System.out.println("Invalid input for day. Please enter a value between 1 and 31.");
				} else {
					validInput = true;

					LocalDate birthDate = LocalDate.of(a, b, c);
					LocalDate currentDate = LocalDate.now();
					Period age = Period.between(birthDate, currentDate);

					System.out.printf("Your birthday is: %s%n", birthDate);
					System.out.printf("Your age is: %d years & %d months & %d days%n", age.getYears(), age.getMonths(),
							age.getDays());
				}
			}
		}
	}

}

/*
 * other way ;) System.out.println("please enter your birthday:");
 * System.out.println("Year: "); int a = new Scanner(System.in).nextInt();
 * System.out.println("Mounth: "); int b = new Scanner(System.in).nextInt();
 * System.out.println("Day: "); int c = new Scanner(System.in).nextInt();
 * LocalDate localDate1 = LocalDate.of(a, b, c); LocalDate localDate =
 * LocalDate.now().minusDays(c).minusMonths(b).minusYears(a);
 * System.out.println("Your birthday is: " + localDate1);
 * System.out.println("Your age is: " + localDate);
 */

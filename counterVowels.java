/*This program prompts the user to enter a string, counts the number of vowels (both uppercase and lowercase), and prints the result.*/
/**
 * @author Ziad Alawak
 **/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'i' || ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u'
                    || ch == 'I' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U') {
                counter++;

            }

        }
        System.out.println(counter);
    }
}
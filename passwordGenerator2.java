package passwordGenerator;

/**
 * @author Ziad Alawak
 **/
import java.util.Random;

public class generator {
	public static void main(String[] args) {
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
				"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		String[] specialChars = { "!", "%", "&", "=", "*", "-", "_", ";", ":", ">", "+", "^", ",", "~", "(", ")", "{",
				"}", "#", "<", "?","@","€" };

		Random random = new Random();

		int numLetters = 4; // 33% of 12
		int numNumbers = 4; // 33% of 12
		int numSpecialChars = 4; // 33% of 12

		String[] password = new String[numLetters + numNumbers + numSpecialChars];

		// randomly select letters
		for (int i = 0; i < numLetters; i++) {
			int randomIndex = random.nextInt(letters.length);
			password[i] = letters[randomIndex];
		}

		// randomly select numbers
		for (int i = 0; i < numNumbers; i++) {
			int randomIndex = random.nextInt(numbers.length);
			password[i + numLetters] = numbers[randomIndex];
		}

		// randomly select special characters
		for (int i = 0; i < numSpecialChars; i++) {
			int randomIndex = random.nextInt(specialChars.length);
			password[i + numLetters + numNumbers] = specialChars[randomIndex];
		}

		// shuffle the password array
		for (int i = password.length - 1; i > 0; i--) {
			int randomIndex = random.nextInt(i + 1);
			String temp = password[i];
			password[i] = password[randomIndex];
			password[randomIndex] = temp;
		}

		System.out.println("The password is: " + String.join("", password));
	}
}

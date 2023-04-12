package passwordGenerator;

/**
 * @author Ziad Alawak
 **/
import java.util.Random;

public class generator {
	public static void main(String[] args) {
		/*
		 * here we write all letters in English and the number and some special
		 * Character
		 */
		String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
				"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"0", "!", "%", "&", "=", "*", "-", "_", ";", ">", "<" };

		Random random = new Random(); // to select random String from the a List
		int numStringsToSelect = 10; // the length of password
		String[] selectedStrings = new String[numStringsToSelect];

		for (int i = 0; i < numStringsToSelect; i++) {
			int randomIndex = random.nextInt(a.length);
			selectedStrings[i] = a[randomIndex];
		}

		System.out.println("Selected strings:");
		System.out.println("The password is: ");
		for (String str : selectedStrings) {
			System.out.print(str);
		}
	}
}

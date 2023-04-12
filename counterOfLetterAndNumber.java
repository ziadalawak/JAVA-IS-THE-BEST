package Letter;

/**
 *@author Ziad Alawak
 * **/
import java.util.List;
import java.util.Scanner;

public class Conter {

	public static void main(String[] args) {
		while (true) {
			// code for counting the number of letters and words in sentence
			System.out.println("please write a sentece to count the number of words");
			String word = new Scanner(System.in).nextLine();
			String sentenceWithoutSpaces = word.replaceAll(" ", "");
			int l = sentenceWithoutSpaces.length();
			System.out.println("the Number of letter is in sentence :" + l);
			String[] words = word.split(" ");
			int counter = words.length;
			System.out.println("the number of word in sentence " + counter);
		}
	}
}

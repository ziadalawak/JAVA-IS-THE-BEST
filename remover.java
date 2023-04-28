package removVowels;

/**
 *@author Ziad Alawak
 * **/
import java.util.Iterator;
import java.util.Scanner;

public class remover {
	/*
	 * Write a program that prompts the user to enter a sentence, and then displays
	 * the sentence with all the vowels (a, e, i, o, u) removed. The program should
	 * be case-insensitive, meaning it should remove both uppercase and lowercase
	 * vowels.
	 * 
	 * For example, if the user enters the sentence "Hello World", the program
	 * should display "Hll Wrld".
	 * 
	 * As an additional challenge, you could also display the number of vowels
	 * removed from the original sentence.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("please write a sentence :");
		String a = scanner.nextLine();
		String re = a.replaceAll("a", "").replaceAll("e", "").replaceAll("i", "").replaceAll("o", "")
				.replaceAll("u", "").replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "")
				.replaceAll("U", "");
		System.out.println(re);
		int counter1 = a.length();
		int counter = re.length();
		System.out.println("The number of vowels removed from the original sentence is : " + (counter1 - counter));
	}

}

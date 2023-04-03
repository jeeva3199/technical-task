package technicalquestions;
// reverse a string

import java.util.Scanner;

public class reverseword {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the word");		
		String word = s.nextLine();
		String reversedStr = "";

		for (int i = 0; i < word.length(); i++) {
			reversedStr = word.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);}


}

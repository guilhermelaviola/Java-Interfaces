package example.NestedInterface2;

import java.util.Scanner;

// This class implements the Palindrome interface, which is inside another class called Word
class WordPalindromeDemo implements Word.Palindrome {

	// Scanner object instantiation
	Scanner s = new Scanner(System.in);

	// I declared the input variable here because all the methods in this class must access it
	String input;

	public static void main(String[] args) {
		// Instantiating the Nested Interface
		Word.Palindrome wop = new WordPalindromeDemo();

		// Invoking methods 
		wop.storeOriginal();
		wop.storeReverse();
		wop.isPalindrome();
	}

	@Override
	public void storeOriginal() {
		// Receiving input from the user on the console
		System.out.println("Enter your word: ");
		input = s.nextLine();

		// Printing the user input
		System.out.println("The original word is: " + input);
	}
	
	// Nested methods
	@Override
	public void storeReverse() {

		// getBytes() is a method to convert String into Bytes
		byte [] strAsByte = input.getBytes();

		byte [] res = new byte [strAsByte.length];

		// Storing results in the reverse order into the result Byte
		for(int i = 0; i < strAsByte.length; i++) {
			res[i] = strAsByte[strAsByte.length-i-1];

			// Printing the result
			System.out.println("The reverse word is: " + new String(res));
		}
	}

	@Override
	public void isPalindrome() {
		// Assigning the user input to the original variable. It means the user input is the word in its original form
		String original = input;

		// Declaring the reverse variable (where the inverted word (original) will be stored)
		String reverse = "";

		// Going through the original word, from the end to the beginning and printing the inverted word
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}

		// Going through the original word again, this time comparing both words (original and reverse) and checking if they are equal or not
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		if(palindrome) {
			System.out.println("It's a palindrome!");
		}else {
			System.out.println("It's NOT a palindrome!");
		}
	}
}

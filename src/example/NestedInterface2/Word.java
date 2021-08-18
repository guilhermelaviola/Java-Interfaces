package example.NestedInterface2;

//Nesting Interface within a class
public class Word {
	interface Palindrome {
		// Declaring its methods
		void storeOriginal();
		void storeReverse();
		void isPalindrome();
	}
}

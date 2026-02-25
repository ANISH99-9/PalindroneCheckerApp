/*
 * UC2: Print a Hardcoded Palindrome Result
 * Palindrome Checker Application
 */

public class PalindromeCheckerApp{

    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if palindrome using if-else
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}

void main() {
}
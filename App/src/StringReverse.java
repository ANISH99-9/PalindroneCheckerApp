/*
 * UC3: Palindrome Check Using String Reverse
 * Palindrome Checker Application
 */

public class StringReverse{

    public static void main(String[] args) {

        // Original string
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}
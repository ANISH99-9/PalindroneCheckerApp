/*
 * UC5: Stack-Based Palindrome Checker
 * Palindrome Checker Application
 */

import java.util.Stack;

public class StackBasedPalindrome  {

    public static void main(String[] args) {

        // Original string
        String original = "noon";

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < original.length(); i++) {

            char poppedChar = stack.pop();

            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}
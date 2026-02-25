/*
 * UC7: Deque-Based Optimized Palindrome Checker
 * Palindrome Checker Application
 */

import java.util.Deque;
import java.util.LinkedList;

public class DequeBasedOptimized {

    public static void main(String[] args) {

        // Original string
        String original = "refer";

        // Create Deque (Double Ended Queue)
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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
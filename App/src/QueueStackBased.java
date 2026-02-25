/*
 * UC6: Queue + Stack Based Palindrome Check
 * Palindrome Checker Application
 */

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class QueueStackBased  {

    public static void main(String[] args) {

        // Original string
        String original = "civic";

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Enqueue and Push characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO (Enqueue)
        }

        boolean isPalindrome = true;

        // Compare Dequeue (FIFO) with Pop (LIFO)
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      // LIFO
            char fromQueue = queue.remove();  // FIFO (Dequeue)

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        // Print Result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program execution completed.");
    }
}
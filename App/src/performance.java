/**
 * MAIN CLASS UseCase13PalindromePerformanceApp
 *
 * Use Case 13: Performance Benchmarking
 *
 * Description:
 * This class measures and compares the performance
 * of a palindrome validation algorithm.
 *
 * It captures execution start and end time,
 * calculates total execution duration,
 * and displays benchmarking results.
 *
 * The goal is to introduce benchmarking concepts
 * in software development.
 *
 * @author Developer
 * @version 13.1
 */

public class performance {

    /**
     * Application entry point for UC13
     */
    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Capture start time
        long startTime = System.nanoTime();

        // Run palindrome check
        boolean result = checkPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long duration = endTime - startTime;

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time (nanoseconds): " + duration);
    }

    /**
     * Simple palindrome validation method
     */
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
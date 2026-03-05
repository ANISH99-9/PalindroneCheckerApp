/**
 * MAIN CLASS UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Checker
 *
 * Description:
 * This class demonstrates Object-Oriented design
 * where palindrome checking logic is encapsulated
 * inside a PalindromeService class.
 *
 * Separation of concerns is followed:
 * - Main class handles execution
 * - Service class handles palindrome logic
 *
 * @author Developer
 * @version 11.0
 */

public class object  {

    /**
     * Application entry point for UC11
     */
    public static void main(String[] args) {

        // Input string
        String input = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call service method
        boolean result = service.checkPalindrome(input);

        // Print result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}

/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */

    public boolean checkPalindrome(String input) {

        // Pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters
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
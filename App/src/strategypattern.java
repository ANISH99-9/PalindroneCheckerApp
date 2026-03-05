/**
 * MAIN CLASS UseCase12PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern Palindrome Checker
 *
 * Description:
 * This class demonstrates the Strategy Pattern for
 * palindrome validation.
 *
 * A strategy interface defines the algorithm contract,
 * and concrete strategy classes implement different
 * palindrome checking techniques.
 *
 * The main class simply executes the selected algorithm.
 *
 * @author Developer
 * @version 12.0
 */

public class  strategypattern {

    /**
     * Application entry point for UC12
     */
    public static void main(String[] args) {

        String input = "level";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute algorithm
        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}

/**
 * Strategy Interface
 * Defines contract for palindrome checking
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * StackStrategy Class
 *
 * This class implements the PalindromeStrategy interface.
 * It uses LIFO behavior of Stack to reverse characters.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack
     *
     * @param input String to validate
     * @return true if palindrome, otherwise false
     */

    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
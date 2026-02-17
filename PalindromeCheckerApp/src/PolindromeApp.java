import java.util.Stack;
import java.util.Scanner;

class PalindromeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for accurate validation
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanInput)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();

        // 1. Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // 2. Pop and compare
        StringBuilder reversedText = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedText.append(stack.pop());
        }

        // 3. Reversal Logic Comparison
        return text.equals(reversedText.toString());
    }
}
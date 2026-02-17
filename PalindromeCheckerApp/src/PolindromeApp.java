public class PolindromeApp {


    public static void main(String[] args) {
        // String Literal - Text enclosed within double quotes
        String word = "madam";

        // String - Built-in class used to store and manipulate textual data
        String reversed = "";

        // Logic to reverse the string manually
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Conditional Statement (if-else) - Evaluates the palindrome condition
        if (word.equals(reversed)) {
            // Console Output - Displays the positive result
            System.out.println(word + " is a palindrome.");
        } else {
            // Console Output - Displays the negative result
            System.out.println(word + " is not a palindrome.");
        }
    }}

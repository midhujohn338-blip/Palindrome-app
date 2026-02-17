public class PolindromeApp {


        public static void main(String[] args) {
            // String Literal - Text to be checked
            String input = "madam";

            // Character Array (char[]) - Converting string to primitive array for index-based access
            char[] charArray = input.toCharArray();

            // Two-Pointer Technique - Initialize pointers at start and end
            int left = 0;
            int right = charArray.length - 1;
            boolean isPalindrome = true;

            // Loop until pointers meet in the middle
            while (left < right) {
                // Compare characters at current index positions
                if (charArray[left] != charArray[right]) {
                    isPalindrome = false;
                    break; // Exit early if a mismatch is found
                }
                left++;  // Move start pointer forward
                right--; // Move end pointer backward
            }

            // Console Output - Display the result
            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }
        }
    }

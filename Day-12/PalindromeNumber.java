// Java program to check whether a number is a palindrome or not

public class PalindromeNumber {

    // Function to check palindrome
    static boolean isPalindrome(int num) {
        int originalNum = num; // Store original number
        int reverse = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;      // Get last digit
            reverse = reverse * 10 + digit; // Build reversed number
            num = num / 10;            // Remove last digit
        }

        // Check if original number and reversed number are same
        return originalNum == reverse;
    }

    public static void main(String[] args) {
        int number = 121;

        // Call function and display result
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }
    }
}

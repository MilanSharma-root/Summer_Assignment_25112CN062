// Java program to check whether a number is an Armstrong number or not

public class ArmstrongNumber {

    // Function to check Armstrong number
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Count digits

        // Calculate sum of digits raised to the power of number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check if sum is equal to original number
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int number = 153;

        // Call function and display result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }
}

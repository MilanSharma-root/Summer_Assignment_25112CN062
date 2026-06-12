// Java program to check whether a number is a Perfect Number or not

public class PerfectNumber {

    // Function to check Perfect Number
    static boolean isPerfect(int num) {
        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if sum of divisors equals the number
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;

        // Function call
        if (isPerfect(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }
    }
}

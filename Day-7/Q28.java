import java.util.Scanner;

public class Q28 {

    static int reverse = 0;

    // Recursive method to reverse a number
    static void reverseNumber(int n) {
        if (n == 0) { // Base case
            return;
        }

        reverse = reverse * 10 + (n % 10);
        reverseNumber(n / 10); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        reverseNumber(n);

        System.out.println("Reversed number = " + reverse);
    }
}
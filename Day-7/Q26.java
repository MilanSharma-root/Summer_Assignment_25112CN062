import java.util.Scanner;

public class Q26 {

    // Recursive method to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) { // Base case
            return 0;
        }
        if (n == 1) { // Base case
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci number = " + fibonacci(n));
    }
}
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of terms to generate
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second;

            // Shift values forward
            first = second;
            second = next;
        }

        sc.close();
    }
}
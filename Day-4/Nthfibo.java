import java.util.Scanner;

public class Nthfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position (n): ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        // Special cases
        if (n == 0) {
            System.out.println("Nth Fibonacci Term: 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci Term: 1");
        } else {
            int current = 0;

            for (int i = 2; i <= n; i++) {
                current = first + second;
                first = second;
                second = current;
            }

            System.out.println("Nth Fibonacci Term: " + current);
        }

        sc.close();
    }
}
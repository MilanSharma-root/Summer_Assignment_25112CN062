import java.util.*;

public class Q113_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 5) break;
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (ch == 1) System.out.println("Result: " + (a + b));
            else if (ch == 2) System.out.println("Result: " + (a - b));
            else if (ch == 3) System.out.println("Result: " + (a * b));
            else if (ch == 4) System.out.println(b == 0 ? "Cannot divide by zero" : "Result: " + (a / b));
            else System.out.println("Invalid option.");
        }
    }
}

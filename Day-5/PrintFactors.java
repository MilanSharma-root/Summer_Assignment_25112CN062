import java.util.Scanner;

public class PrintFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factors of " + number + " are:");

        for (int factor = 1; factor <= number; factor++) {
            if (number % factor == 0) {
                System.out.print(factor + " ");
            }
        }

        sc.close();
    }
}
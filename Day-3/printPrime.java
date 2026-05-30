import java.util.Scanner;

public class printPrime{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //Enter start number 
        System.out.print("Enter start: ");
        int start = s.nextInt();
        //Enter the end number
        System.out.print("Enter end: ");
        int end = s.nextInt();

        System.out.println("Prime Numbers:");
        //printing process
        for (int num = start; num <= end; num++) {
            if (num < 2)
                continue;

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }

        s.close();
    }
}
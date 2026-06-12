// Java program to print reverse number triangle

public class Q34 {
    public static void main(String[] args) {

        // Outer loop controls the rows
        for (int i = 5; i >= 1; i--) {

            // Inner loop prints numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

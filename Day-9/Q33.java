// Java program to print reverse star pattern

public class Q33 {
    public static void main(String[] args) {

        // Outer loop controls the number of rows
        for (int i = 5; i >= 1; i--) {

            // Inner loop prints stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

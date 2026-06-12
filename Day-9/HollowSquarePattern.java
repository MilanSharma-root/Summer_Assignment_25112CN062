// Java program to print a hollow square pattern

public class HollowSquarePattern {
    public static void main(String[] args) {

        int n = 5; // Size of the square

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= n; j++) {

                // Print * on borders, otherwise print space
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

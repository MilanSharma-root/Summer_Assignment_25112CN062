// Java program to print a character pyramid

public class CharacterPyramid {
    public static void main(String[] args) {

        int n = 5; // Number of rows

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print ascending characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Print descending characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            // Move to the next line
            System.out.println();
        }
    }
}

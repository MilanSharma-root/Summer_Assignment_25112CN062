// Java program to print repeated character pattern

public class RepeatedCharacterPattern {
    public static void main(String[] args) {

        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {

            // Calculate the character for the current row
            char ch = (char) ('A' + i - 1);

            // Inner loop to print the character i times
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }

            // Move to the next line
            System.out.println();
        }
    }
}

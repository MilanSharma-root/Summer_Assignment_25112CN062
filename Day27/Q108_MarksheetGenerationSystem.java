import java.util.*;

public class Q108_MarksheetGenerationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        int total = 0;
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double percent = total / 5.0;
        String grade = percent >= 90 ? "A" : percent >= 75 ? "B" : percent >= 60 ? "C" : percent >= 40 ? "D" : "Fail";
        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total + "/500");
        System.out.println("Percentage: " + percent);
        System.out.println("Grade: " + grade);
    }
}

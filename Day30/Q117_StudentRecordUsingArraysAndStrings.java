import java.util.*;

public class Q117_StudentRecordUsingArraysAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt(); sc.nextLine();
        String[] names = new String[n];
        int[] roll = new int[n];
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Roll No: "); roll[i] = sc.nextInt(); sc.nextLine();
            System.out.print("Name: "); names[i] = sc.nextLine();
            System.out.print("Marks: "); marks[i] = sc.nextInt(); sc.nextLine();
        }
        System.out.println("\nStudent Records:");
        for (int i = 0; i < n; i++) System.out.println(roll[i] + " " + names[i] + " " + marks[i]);
    }
}

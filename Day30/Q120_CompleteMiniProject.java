import java.util.*;

class MiniStudent {
    int rollNo, marks;
    String name;
    MiniStudent(int rollNo, String name, int marks) {
        this.rollNo = rollNo; this.name = name; this.marks = marks;
    }
}

public class Q120_CompleteMiniProject {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<MiniStudent> students = new ArrayList<>();

    static void addStudent() {
        System.out.print("Roll No: ");
        int roll = sc.nextInt(); sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();
        students.add(new MiniStudent(roll, name, marks));
        System.out.println("Student added.");
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (MiniStudent s : students) System.out.println(s.rollNo + " " + s.name + " " + s.marks);
    }

    static void searchStudent() {
        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();
        for (MiniStudent s : students) {
            if (s.rollNo == roll) {
                System.out.println(s.rollNo + " " + s.name + " " + s.marks);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter roll no: ");
        int roll = sc.nextInt();
        boolean removed = students.removeIf(s -> s.rollNo == roll);
        System.out.println(removed ? "Deleted." : "Student not found.");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Mini Project ---");
            System.out.println("1. Add Student\n2. Display Students\n3. Search Student\n4. Delete Student\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) addStudent();
            else if (ch == 2) displayStudents();
            else if (ch == 3) searchStudent();
            else if (ch == 4) deleteStudent();
            else if (ch == 5) break;
            else System.out.println("Invalid option.");
        }
    }
}

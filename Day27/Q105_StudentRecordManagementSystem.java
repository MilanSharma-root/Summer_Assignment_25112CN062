import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class Q105_StudentRecordManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search Student\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Roll No: ");
                int roll = sc.nextInt(); sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                int marks = sc.nextInt();
                students.add(new Student(roll, name, marks));
            } else if (choice == 2) {
                for (Student s : students) System.out.println(s.rollNo + " " + s.name + " " + s.marks);
            } else if (choice == 3) {
                System.out.print("Enter roll no: ");
                int roll = sc.nextInt();
                boolean found = false;
                for (Student s : students) if (s.rollNo == roll) { System.out.println(s.rollNo + " " + s.name + " " + s.marks); found = true; }
                if (!found) System.out.println("Student not found.");
            } else if (choice == 4) break;
        }
    }
}

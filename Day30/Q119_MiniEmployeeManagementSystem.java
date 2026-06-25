import java.util.*;

class Employee {
    int id;
    String name, department;
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

public class Q119_MiniEmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Employee\n2. Display Employees\n3. Delete Employee\n4. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 1) {
                System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Department: "); String dept = sc.nextLine();
                employees.add(new Employee(id, name, dept));
            } else if (choice == 2) {
                for (Employee e : employees) System.out.println(e.id + " " + e.name + " " + e.department);
            } else if (choice == 3) {
                System.out.print("Enter ID to delete: "); int id = sc.nextInt();
                employees.removeIf(e -> e.id == id);
                System.out.println("Deleted if ID existed.");
            } else if (choice == 4) break;
        }
    }
}

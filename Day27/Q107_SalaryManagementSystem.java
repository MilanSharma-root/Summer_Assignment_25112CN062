import java.util.*;

class SalaryEmployee {
    int id;
    String name;
    double basic;
    SalaryEmployee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }
    double grossSalary() {
        double hra = basic * 0.20;
        double da = basic * 0.10;
        return basic + hra + da;
    }
}

public class Q107_SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SalaryEmployee> list = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Employee\n2. Show Salary Slip\n3. Exit");
            int choice = sc.nextInt(); sc.nextLine();
            if (choice == 1) {
                System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Basic Salary: "); double basic = sc.nextDouble();
                list.add(new SalaryEmployee(id, name, basic));
            } else if (choice == 2) {
                for (SalaryEmployee e : list) System.out.println(e.id + " " + e.name + " Gross Salary: " + e.grossSalary());
            } else if (choice == 3) break;
        }
    }
}

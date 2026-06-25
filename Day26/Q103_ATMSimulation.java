import java.util.*;

public class Q103_ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        while (true) {
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            if (choice == 1) System.out.println("Balance: " + balance);
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                balance += sc.nextDouble();
                System.out.println("Deposited successfully.");
            } else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn successfully.");
                } else System.out.println("Insufficient balance.");
            } else if (choice == 4) break;
            else System.out.println("Invalid option.");
        }
    }
}

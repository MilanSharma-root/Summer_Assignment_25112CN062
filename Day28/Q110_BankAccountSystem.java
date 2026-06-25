import java.util.*;

class BankAccount {
    int accountNo;
    String holderName;
    double balance;
    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo; this.holderName = holderName; this.balance = balance;
    }
}

public class Q110_BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Create Account\n2. Display Accounts\n3. Deposit\n4. Withdraw\n5. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Account No: "); int no = sc.nextInt(); sc.nextLine();
                System.out.print("Holder Name: "); String name = sc.nextLine();
                System.out.print("Opening Balance: "); double bal = sc.nextDouble();
                accounts.add(new BankAccount(no, name, bal));
            } else if (ch == 2) {
                for (BankAccount a : accounts) System.out.println(a.accountNo + " " + a.holderName + " Balance: " + a.balance);
            } else if (ch == 3 || ch == 4) {
                System.out.print("Account No: "); int no = sc.nextInt();
                System.out.print("Amount: "); double amt = sc.nextDouble();
                for (BankAccount a : accounts) if (a.accountNo == no) {
                    if (ch == 3) a.balance += amt;
                    else if (amt <= a.balance) a.balance -= amt;
                    else System.out.println("Insufficient balance.");
                }
            } else if (ch == 5) break;
        }
    }
}

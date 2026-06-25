import java.util.*;

public class Q102_VotingEligibilitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18) System.out.println(name + " is eligible to vote.");
        else System.out.println(name + " is not eligible to vote.");
    }
}

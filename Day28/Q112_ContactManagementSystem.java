import java.util.*;

class Contact {
    String name, phone;
    Contact(String name, String phone) { this.name = name; this.phone = phone; }
}

public class Q112_ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Contact\n2. Display Contacts\n3. Search Contact\n4. Exit");
            int ch = Integer.parseInt(sc.nextLine());
            if (ch == 1) {
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Phone: "); String phone = sc.nextLine();
                contacts.add(new Contact(name, phone));
            } else if (ch == 2) {
                for (Contact c : contacts) System.out.println(c.name + " - " + c.phone);
            } else if (ch == 3) {
                System.out.print("Enter name: "); String key = sc.nextLine().toLowerCase();
                for (Contact c : contacts) if (c.name.toLowerCase().contains(key)) System.out.println(c.name + " - " + c.phone);
            } else if (ch == 4) break;
        }
    }
}

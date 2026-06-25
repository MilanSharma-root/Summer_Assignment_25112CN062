import java.util.*;

class Product {
    int id, quantity;
    String name;
    double price;
    Product(int id, String name, int quantity, double price) {
        this.id = id; this.name = name; this.quantity = quantity; this.price = price;
    }
}

public class Q116_InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Product\n2. Display Products\n3. Update Quantity\n4. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Name: "); String name = sc.nextLine();
                System.out.print("Quantity: "); int qty = sc.nextInt();
                System.out.print("Price: "); double price = sc.nextDouble();
                products.add(new Product(id, name, qty, price));
            } else if (ch == 2) {
                for (Product p : products) System.out.println(p.id + " " + p.name + " Qty: " + p.quantity + " Price: " + p.price);
            } else if (ch == 3) {
                System.out.print("Product ID: "); int id = sc.nextInt();
                System.out.print("New Quantity: "); int qty = sc.nextInt();
                for (Product p : products) if (p.id == id) p.quantity = qty;
            } else if (ch == 4) break;
        }
    }
}

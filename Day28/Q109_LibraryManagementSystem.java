import java.util.*;

class Book {
    int id;
    String title, author;
    boolean issued;
    Book(int id, String title, String author) {
        this.id = id; this.title = title; this.author = author;
    }
}

public class Q109_LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add Book\n2. Display Books\n3. Issue Book\n4. Return Book\n5. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Book ID: "); int id = sc.nextInt(); sc.nextLine();
                System.out.print("Title: "); String title = sc.nextLine();
                System.out.print("Author: "); String author = sc.nextLine();
                books.add(new Book(id, title, author));
            } else if (ch == 2) {
                for (Book b : books) System.out.println(b.id + " " + b.title + " by " + b.author + " | " + (b.issued ? "Issued" : "Available"));
            } else if (ch == 3 || ch == 4) {
                System.out.print("Book ID: "); int id = sc.nextInt();
                for (Book b : books) if (b.id == id) b.issued = (ch == 3);
            } else if (ch == 5) break;
        }
    }
}

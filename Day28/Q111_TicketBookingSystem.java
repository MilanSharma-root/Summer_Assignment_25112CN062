import java.util.*;

public class Q111_TicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        while (true) {
            System.out.println("\n1. Show Seats\n2. Book Ticket\n3. Cancel Ticket\n4. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                for (int i = 0; i < seats.length; i++) System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
            } else if (ch == 2) {
                System.out.print("Enter seat number: "); int seat = sc.nextInt();
                if (seat >= 1 && seat <= 10 && !seats[seat - 1]) { seats[seat - 1] = true; System.out.println("Ticket booked."); }
                else System.out.println("Seat not available.");
            } else if (ch == 3) {
                System.out.print("Enter seat number: "); int seat = sc.nextInt();
                if (seat >= 1 && seat <= 10 && seats[seat - 1]) { seats[seat - 1] = false; System.out.println("Ticket cancelled."); }
                else System.out.println("Invalid seat.");
            } else if (ch == 4) break;
        }
    }
}

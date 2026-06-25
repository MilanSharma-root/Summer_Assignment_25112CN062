import java.util.*;

public class Q115_MenuDrivenStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        while (true) {
            System.out.println("\n1. Length\n2. Reverse\n3. Uppercase\n4. Count Vowels\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) System.out.println("Length: " + s.length());
            else if (ch == 2) System.out.println("Reverse: " + new StringBuilder(s).reverse());
            else if (ch == 3) System.out.println("Uppercase: " + s.toUpperCase());
            else if (ch == 4) {
                int count = 0;
                for (char c : s.toLowerCase().toCharArray()) if ("aeiou".indexOf(c) != -1) count++;
                System.out.println("Vowels: " + count);
            } else if (ch == 5) break;
        }
    }
}

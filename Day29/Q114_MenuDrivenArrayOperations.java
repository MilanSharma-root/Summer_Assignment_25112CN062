import java.util.*;

public class Q114_MenuDrivenArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        while (true) {
            System.out.println("\n1. Insert\n2. Display\n3. Search\n4. Delete\n5. Exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter value: "); arr[n++] = sc.nextInt();
            } else if (ch == 2) {
                for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
                System.out.println();
            } else if (ch == 3) {
                System.out.print("Enter value to search: "); int key = sc.nextInt();
                int index = -1;
                for (int i = 0; i < n; i++) if (arr[i] == key) index = i;
                System.out.println(index == -1 ? "Not found" : "Found at index " + index);
            } else if (ch == 4) {
                System.out.print("Enter index to delete: "); int idx = sc.nextInt();
                if (idx >= 0 && idx < n) { for (int i = idx; i < n - 1; i++) arr[i] = arr[i + 1]; n--; }
            } else if (ch == 5) break;
        }
    }
}

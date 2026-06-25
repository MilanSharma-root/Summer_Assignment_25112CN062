import java.util.*;

public class Q99_SortNamesAlphabetically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        for (int i = 0; i < n; i++) names[i] = sc.nextLine();
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted names:");
        for (String name : names) System.out.println(name);
    }
}

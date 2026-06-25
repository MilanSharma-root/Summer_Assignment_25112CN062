import java.util.*;

public class Q100_SortWordsByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String[] words = sc.nextLine().trim().split("\\s+");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println("Words sorted by length: " + Arrays.toString(words));
    }
}

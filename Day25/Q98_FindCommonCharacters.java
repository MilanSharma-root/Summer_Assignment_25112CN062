import java.util.*;

public class Q98_FindCommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : a.toCharArray()) {
            if (b.indexOf(ch) != -1) set.add(ch);
        }
        System.out.println("Common characters: " + set);
    }
}

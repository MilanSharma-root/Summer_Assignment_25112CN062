import java.util.*;

public class Q96_RemoveDuplicateCharacters {
    public static String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("After removing duplicates: " + removeDuplicates(s));
    }
}

import java.util.*;

public class Q94_CompressString {
    public static String compress(String s) {
        if (s.isEmpty()) return s;
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) count++;
            else {
                ans.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        ans.append(s.charAt(s.length() - 1)).append(count);
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Compressed: " + compress(s));
    }
}

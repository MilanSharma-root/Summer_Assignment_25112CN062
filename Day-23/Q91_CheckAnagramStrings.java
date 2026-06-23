import java.util.*;

public class Q91_CheckAnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        char[] arr1 = str1.replaceAll("\s+", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\s+", "").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Strings are anagrams.");
        else
            System.out.println("Strings are not anagrams.");
    }
}
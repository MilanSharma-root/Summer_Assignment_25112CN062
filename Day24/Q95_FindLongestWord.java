import java.util.*;

public class Q95_FindLongestWord {
    public static String longestWord(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Longest word: " + longestWord(sentence));
    }
}

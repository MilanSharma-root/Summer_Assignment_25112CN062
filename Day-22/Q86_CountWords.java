public class Q86_CountWords {
    public static void main(String[] args) {
        String sentence = "Java is easy to learn";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Word Count = " + words.length);
    }
}
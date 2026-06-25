import java.util.*;

public class Q104_QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Q1. Java is developed by?\n1. Microsoft\n2. Sun Microsystems\n3. Google");
        if (sc.nextInt() == 2) score++;
        System.out.println("Q2. Which keyword is used to inherit a class?\n1. implements\n2. extends\n3. import");
        if (sc.nextInt() == 2) score++;
        System.out.println("Q3. Size of int in Java?\n1. 2 bytes\n2. 4 bytes\n3. 8 bytes");
        if (sc.nextInt() == 2) score++;
        System.out.println("Your score: " + score + "/3");
    }
}

import java.util.*;

class pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        long answer = 1;

        // Multiply x exactly n times
        for (int i = 1; i <= n; i++) {
            answer *= x;
        }

        System.out.println(answer);
    }
}
import java.util.*;

class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder binary = new StringBuilder();

        // Divide number by 2 and store remainders
        while (num > 0) {
            int rem = num % 2;
            binary.append(rem);
            num = num / 2;
        }

        // Reverse because remainders come in opposite order
        System.out.println(binary.reverse().toString());
    }
}
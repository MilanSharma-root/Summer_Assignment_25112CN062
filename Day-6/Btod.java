import java.util.*;

class Btod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();
        int decimal = 0;
        int power = 1; // 2^0

        while (binary > 0) {
            int lastDigit = binary % 10;

            decimal += lastDigit * power;

            power *= 2;
            binary /= 10;
        }

        System.out.println(decimal);
    }
}
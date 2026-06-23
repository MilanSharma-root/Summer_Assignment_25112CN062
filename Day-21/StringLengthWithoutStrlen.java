// Program to find string length without using length() or strlen()

import java.util.Scanner;

public class StringLengthWithoutStrlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of string = " + count);

        sc.close();
    }
}

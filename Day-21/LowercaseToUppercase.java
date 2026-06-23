// Program to convert lowercase characters to uppercase

import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upperCaseString = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            upperCaseString += ch;
        }

        System.out.println("Uppercase String: " + upperCaseString);

        sc.close();
    }
}

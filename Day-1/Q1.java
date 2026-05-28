import java.util.*;
public class Q1{
    public static void main(String[] args) {
        int n;
        Scanner k=new Scanner(System.in);
        n=k.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
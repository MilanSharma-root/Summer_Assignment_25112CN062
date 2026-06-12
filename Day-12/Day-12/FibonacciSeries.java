// Java program to print Fibonacci series using a function

public class FibonacciSeries {

    // Function to print Fibonacci series
    static void fibonacci(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms

        fibonacci(terms); // Function call
    }
}

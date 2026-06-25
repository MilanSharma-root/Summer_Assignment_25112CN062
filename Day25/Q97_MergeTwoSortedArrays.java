import java.util.*;

public class Q97_MergeTwoSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) ans[k++] = a[i++];
            else ans[k++] = b[j++];
        }
        while (i < a.length) ans[k++] = a[i++];
        while (j < b.length) ans[k++] = b[j++];
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter sorted first array:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.println("Enter sorted second array:");
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        System.out.println("Merged array: " + Arrays.toString(merge(a, b)));
    }
}

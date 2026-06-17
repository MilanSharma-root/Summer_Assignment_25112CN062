import java.util.*;

public class Q68_FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : arr1) set1.add(num);

        for (int num : arr2) {
            if (set1.contains(num)) set2.add(num);
        }

        System.out.print("Common Elements: ");

        for (int num : arr3) {
            if (set2.contains(num)) System.out.print(num + " ");
        }
    }
}

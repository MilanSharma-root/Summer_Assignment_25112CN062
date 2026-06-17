import java.util.*;

public class Q66_UnionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);

        System.out.println("Union: " + set);
    }
}

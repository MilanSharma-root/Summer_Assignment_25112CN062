import java.util.*;

public class Q67_IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr1) set.add(num);

        for (int num : arr2) {
            if (set.contains(num)) result.add(num);
        }

        System.out.println("Intersection: " + result);
    }
}

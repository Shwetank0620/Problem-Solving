import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check for intersection with nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert resultSet to array
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}

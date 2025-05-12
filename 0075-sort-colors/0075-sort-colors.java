public class Solution {
    public void sortColors(int[] nums) {
        int low = 0;       // pointer for 0s
        int mid = 0;       // pointer for current element
        int high = nums.length - 1;  // pointer for 2s

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], move both pointers forward
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // Move mid forward
                mid++;
            } else {
                // nums[mid] == 2, swap with high and move high backward
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    // For testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

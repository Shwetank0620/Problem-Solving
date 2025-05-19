public class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Finding the intersection point of the two runners.
        int slow = nums[0];
        int fast = nums[0];

        // Move slow by one step and fast by two steps
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate Number: " + sol.findDuplicate(nums)); // Output: 2
    }
}

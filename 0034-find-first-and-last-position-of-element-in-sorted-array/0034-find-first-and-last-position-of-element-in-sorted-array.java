class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }
    
    private int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1, first = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;  // Possible first occurrence
                right = mid - 1; // Search left for earlier occurrences
            } else if (nums[mid] < target) {
                left = mid + 1;  // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        
        return first;
    }
    
    private int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1, last = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;  // Possible last occurrence
                left = mid + 1; // Search right for later occurrences
            } else if (nums[mid] < target) {
                left = mid + 1;  // Move right
            } else {
                right = mid - 1; // Move left
            }
        }
        
        return last;
    }
}

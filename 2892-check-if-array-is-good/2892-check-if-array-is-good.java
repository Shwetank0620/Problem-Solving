class Solution {
    public boolean isGood(int[] nums) {    
        Arrays.sort(nums);
        int max = nums.length - 1;

        int[] arr = new int[max + 1];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        arr[n - 1] = max;
        
        return Arrays.equals(nums, arr);
    }
}
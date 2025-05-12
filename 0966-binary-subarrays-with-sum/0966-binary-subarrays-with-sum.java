import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); 
        
        int sum = 0, result = 0;

        for (int num : nums) {
            sum += num;
            
            if (prefixSumCount.containsKey(sum - goal)) {
                result += prefixSumCount.get(sum - goal);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}

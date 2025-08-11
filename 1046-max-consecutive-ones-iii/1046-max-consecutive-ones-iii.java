class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_length=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int zeroes=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zeroes++;
                }
                if(zeroes<=k){
                    int len=j-i+1;
                    max_length=Math.max(max_length,len);
                }
                else{
                    break;
                }
            }
        }
        return max_length;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_length=0, l=0, zeros=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                    zeros--;   
                }
                l++;
            }
            int len=r-l+1;
            max_length=Math.max(max_length,len);
        }
        return max_length;
    }
}












/* BRUTE FORCE
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
        */
        
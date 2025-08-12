class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    
    public int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int l = 0, sum = 0, count = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum > goal) {
                sum -= nums[l];
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}

/*class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        if(goal<0){
            return 0;
        }
        int l=0, r=0, sum=0, cnt=0;
        while(r<=nums.length){
            sum += nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l=l+1;
            }
            cnt=cnt+(r-l+1);
            r=r+1;
        }
        return cnt;
    }
}*/
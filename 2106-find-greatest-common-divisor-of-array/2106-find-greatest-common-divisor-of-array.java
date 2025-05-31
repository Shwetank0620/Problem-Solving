class Solution {
    public int findGCD(int[] nums) {
     Arrays.sort(nums);
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     int gcd=1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]<min){
            min=nums[i];
        }
        else{
            max=nums[i];
        }
     }
     for(int i=1;i<=min && i<=max;i++){
        if(min%i==0 && max%i==0){
            gcd=i;
        }
     }
     return gcd;
    }
}
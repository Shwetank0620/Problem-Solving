class Solution {
    public int sumOfUnique(int[] nums) 
    {
        int count=0;
        int[] arr=new int[101];
        for(int i:nums)
        {
            arr[i]++;
        }
        for(int i:nums)
        {
            if(arr[i]==1)
            {
                count+=i;
            }
        }
        return count;
    }
}
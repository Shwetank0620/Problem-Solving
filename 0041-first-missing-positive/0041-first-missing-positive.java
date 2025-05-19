class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>=1&&arr[i]<=n&&arr[i]!=arr[arr[i]-1]){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
        }

        for(int i=1;i<=n;i++){
            if(arr[i-1]!=i){
                return i;
            }
        }
        return  n+1;
    }
}
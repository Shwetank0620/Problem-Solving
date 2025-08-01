class Solution {
    public int maxBuilding(int n, int[][] restrictions) 
    {
        int[][] arr = new int[restrictions.length + 2][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[arr.length - 1][0] = n;
        arr[arr.length - 1][1] = n - 1;
        for (int i = 1; i < arr.length - 1; i++)
        {
            arr[i][0] = restrictions[i - 1][0];
            arr[i][1] = restrictions[i - 1][1];
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < arr.length; i++)
        {
            arr[i][1] = Math.min(arr[i][1], arr[i - 1][1] + arr[i][0] - arr[i - 1][0]);
        }
        for (int i = arr.length - 2; i >= 0; i--)
        {
            arr[i][1] = Math.min(arr[i][1], arr[i + 1][1] + arr[i + 1][0] - arr[i][0]);
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++)
        {
            max = Math.max(max, (arr[i][1] + arr[i - 1][1] + arr[i][0] - arr[i - 1][0]) / 2);
        }
        return max;       
    }
}
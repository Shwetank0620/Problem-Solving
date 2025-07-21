class Solution {
    public int minPathSum(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        

        for(int i=0;i<n;i++){
            int d1 = Integer.MAX_VALUE,d2 = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                if(i-1 >= 0)
                    d2 = dp[i-1][j];
                if(j-1 >= 0)
                    d1 = dp[i][j-1];

                dp[i][j] = grid[i][j] + Math.min(d1,d2);       
            }
        }

        return dp[n-1][m-1];

    }
}
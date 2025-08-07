class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int ans =0;

        for(int i=0;i<fruits.length;i++){
            ans+=fruits[i][i];
            fruits[i][i]=0;
        }

        // now we have to do 2 sfs calls 
        int dp1[][] = new int[fruits.length+1][fruits.length+1];
        int dp2[][] = new int[fruits.length+1][fruits.length+1];


        for(int arr[]:dp1){
            Arrays.fill(arr,-1);
        }

        
        for(int arr[]:dp2){
            Arrays.fill(arr,-1);
        }
        ans+= dfs1(0,fruits.length-1,fruits,fruits.length-1,dp1);
        ans+= dfs2(fruits.length-1,0,fruits,fruits.length-1,dp2);

        return ans;

    }

    public int dfs1(int row , int col  , int fruits[][] , int steps , int dp[][]){

        if(steps<0){
            return 0;
        }
        if(row<0 || col<0 || row>=fruits.length ||col>=fruits.length ){
            return 0;
        }
        if (row >= col) return 0;
        int res =0;
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        if(row==col){
           // res = Math.max(res,dfs1(row+1,col+1,fruits,steps-1,dp));
           return 0;
        }
        else if(row==col-1){
            res =Math.max(res, Math.max(dfs1(row+1,col+1, fruits, steps-1,dp),dfs1(row+1,col, fruits, steps-1,dp)));
        }else{
            res =Math.max(res, Math.max(dfs1(row+1,col-1,fruits,steps-1,dp),Math.max(dfs1(row+1,col+1, fruits, steps-1,dp),dfs1(row+1,col, fruits, steps-1,dp))));
        }

        return dp[row][col]=res+fruits[row][col];

        
    }





    public int dfs2(int row , int col  , int fruits[][] , int steps,int dp[][] ){

        if(steps<0){
            return 0;
        }
        if(row<0 || col<0 || row>=fruits.length ||col>=fruits.length ){
            return 0;
        }
        if (row <= col) return 0;
       int res =0;
        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        if(row==col){
            return 0;
        }
        else if(col==row-1){
            res =Math.max(res, Math.max(dfs2(row+1,col+1, fruits, steps-1,dp),dfs2(row,col+1, fruits, steps-1,dp)));
        }else{
            res =Math.max(res, Math.max(dfs2(row+1,col+1,fruits,steps-1,dp),Math.max(dfs2(row,col+1, fruits, steps-1,dp),dfs2(row-1,col+1, fruits, steps-1,dp))));
        }

        return dp[row][col]=res+fruits[row][col];

        
    }
}
class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            else{
                if(s.charAt(i-1)=='('){
                    st.push(cnt);
                }
                cnt--;
            }
        }
        int res=0;
        while(!st.isEmpty()){
           res=res+(int)Math.pow(2,st.pop()-1); 
        }
        return res;


    }
}
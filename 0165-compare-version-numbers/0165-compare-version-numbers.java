public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");  
        String[] v2 = version2.split("\\.");

        int length = Math.max(v1.length, v2.length);

        for (int i = 0; i < length; i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;
        }
        return 0;  
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.compareVersion("1.2", "1.10"));      
        System.out.println(sol.compareVersion("1.01", "1.001"));    
        System.out.println(sol.compareVersion("1.0", "1.0.0.0"));   
    }
}

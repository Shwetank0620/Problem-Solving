public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        // Place each character at its target index
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}

public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 1-based indexing
            int remainder = columnNumber % 26;
            sb.append((char)('A' + remainder));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}

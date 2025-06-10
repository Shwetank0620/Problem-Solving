class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces and split words
        String[] words = s.trim().split("\\s+");

        // Step 2: Reverse the words using StringBuilder
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        // Step 3: Remove the trailing space and return the result
        return result.toString().trim();
    }

    // Test Cases
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.reverseWords("the sky is blue")); // Output: "blue is sky the"
        System.out.println(sol.reverseWords("  hello world  ")); // Output: "world hello"
        System.out.println(sol.reverseWords("a good   example")); // Output: "example good a"
    }
}

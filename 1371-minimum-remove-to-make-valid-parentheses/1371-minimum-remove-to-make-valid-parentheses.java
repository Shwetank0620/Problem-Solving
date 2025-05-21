public class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        // First pass: mark unmatched ')'
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*'); // Mark for removal
                }
            }
        }

        // Second pass: mark unmatched '('
        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*'); // Mark for removal
        }

        // Build the result, skipping all marked characters
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }
        return result.toString();
    }
}

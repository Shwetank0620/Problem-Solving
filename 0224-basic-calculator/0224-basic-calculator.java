public class Solution {
    public int calculate(String s) {
        int result = 0;
        int number = 0;
        int sign = 1; // 1 for '+', -1 for '-'
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (ch == '(') {
                // Push current result and sign
                stack.push(result);
                stack.push(sign);
                // Reset for new sub-expression
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * number;
                number = 0;
                // Pop sign and previous result
                result *= stack.pop(); // sign
                result += stack.pop(); // previous result
            }
            // Ignore spaces
        }
        // Add any number left at the end
        result += sign * number;
        return result;
    }
}

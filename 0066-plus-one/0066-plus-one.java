class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the end (least significant digit)
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set to 0 and continue to carry over
            digits[i] = 0;
        }

        // If all digits were 9, we need an extra digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;  // All others are already 0 by default
        return result;
    }
}

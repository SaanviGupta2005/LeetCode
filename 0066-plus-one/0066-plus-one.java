class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // Set 9 to 0 and continue
        }

        // If all digits were 9, we need a new array (e.g., 999 → 1000)
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

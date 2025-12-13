class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        
        // Sort the digits
        java.util.Arrays.sort(digits);
        
        // Form two numbers as described
        return 10 * (digits[0] + digits[1]) + digits[2] + digits[3];
    }
}
class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2; // even positions
        long odd = n / 2;       // odd positions

        long pow5 = power(5, even);
        long pow4 = power(4, odd);

        long ans = (pow5 * pow4) % MOD;

        return (int) ans;
    }

    // Recursive fast power
    public long power(long base, long exp) {

        // Base case
        if (exp == 0) return 1;

        long half = power(base, exp / 2);

        long result = (half * half) % MOD;

        // If odd power
        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}

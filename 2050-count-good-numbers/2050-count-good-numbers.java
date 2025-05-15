public class Solution {
    static final int MOD = 1_000_000_007;

    // Modular exponentiation: (base^exp) % mod
    public long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }

        return result;
    }

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // even indices
        long oddCount = n / 2;        // odd indices

        long evenPow = modPow(5, evenCount, MOD);
        long oddPow = modPow(4, oddCount, MOD);

        return (int)((evenPow * oddPow) % MOD);
    }
}

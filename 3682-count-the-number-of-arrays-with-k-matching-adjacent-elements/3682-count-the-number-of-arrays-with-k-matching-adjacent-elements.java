class Solution {

    static final int MOD = 1_000_000_007;
    static final int MAX = 100000;
    static long[] factorial = new long[MAX];
    static long[] invFactorial = new long[MAX];

    static long power(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    static {
        factorial[0] = 1;
        for (int i = 1; i < MAX; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }

        invFactorial[MAX - 1] = power(factorial[MAX - 1], MOD - 2);
        for (int i = MAX - 1; i > 0; i--) {
            invFactorial[i - 1] = (invFactorial[i] * i) % MOD;
        }
    }

    long nCr(int n, int r) {
        if (r > n || r < 0) return 0;
        return (((factorial[n] * invFactorial[r]) % MOD) * invFactorial[n - r]) % MOD;
    }

    public int countGoodArrays(int n, int m, int k) {
        if (k >= n) return 0;

        long chooseK = nCr(n - 1, k);              
        long startValue = m;                       
        long restValues = power(m - 1, n - k - 1); 
        long total = (chooseK * startValue) % MOD;
        total = (total * restValues) % MOD;

        return (int) total;
    }
}

public class Code01 {
    private static int[] table = new int[32];

    public static void main(String[] args) {
        int n = 4;
        System.out.println("#1. " + n + "까지의 합 :" + func(n));
        System.out.println("#2. " + n + "! = " + factorial(n));
        System.out.println("#3. " + n + "의 3제곱" + power(4, 3));
        System.out.println("#4. fibonacci(4) 값 : " + fibonacci(4));
        System.out.println("#5. memofibo(4) 값 : " + memoFibo(4));
        System.out.println("#6. " + "9와 3의 최대공약수 : " + gcd(9, 3));
        System.out.println("#7. " + "7과 14의 최대공약수 : " + gcd2(7, 14));
    }

    private static int func(int n) {
        if (n == 0)
            return 0;
        else
            return n + func(n - 1);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    private static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    private static int memoFibo(int n) {
        if (n <= 1) {
            return n;
        }
        if (table[n] > 0) {
            return table[n];
        }
        table[n] = memoFibo(n - 1) + memoFibo(n - 2);
        System.out.println(table[n]);
        return table[n];
    }

    /**
     * 최대공약수
     * Euclid Method
     *
     * @param m
     * @param n
     * @return
     */
    private static int gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

    private static int gcd2(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcd2(q, p % q);
    }
}

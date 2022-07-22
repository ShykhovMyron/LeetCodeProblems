package easy;

public class FibonacciNumber {
    public int fib(int n) {
        int prev = 0;
        int curr = 1;
        if (n == 0) return prev;

        for (int i = 1; i < n; i++) {
            curr = curr + prev;
            prev = curr - prev;
        }

        return curr;
    }
}

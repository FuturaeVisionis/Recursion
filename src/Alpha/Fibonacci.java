package Alpha;

/**
 * Created by ronald on 23/11/16.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(11));
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2) + fib(n -3);

    }
}

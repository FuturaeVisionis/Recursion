package Alpha;

/**
 * Created by ronald on 20/11/16.
 */
public class Factorial {

    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return (n * fact(n - 1)); // <-- <-- This guy is what we call recursion!!

    }
}
/*

The interactive way (without recursion);

public static int fact(int num) {

        int tmp = 1;

        for (int i = 1; i <= num; i++) {
            tmp *= i;
        }
        return tmp;
    }
}
*/



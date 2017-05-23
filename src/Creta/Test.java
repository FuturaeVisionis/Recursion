package Creta;

/**
 * Created by ronald on 23/11/16.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(4));
    }

    public static int xMethod(int n) {

        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
}

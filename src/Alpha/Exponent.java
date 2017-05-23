package Alpha;

/**
 * Created by ronald on 26/11/16.
 */
public class Exponent {
    public static void main(String[] args) {

        Exponent a = new Exponent();
        System.out.println(a.exp(120, 2));

    }

    public int exp(int x, int m) {

        if (m == 0) {
            return 1; // anything with exponent 0 = 1, right?
        }
        if (m == 1)
            return (x); // anything with exponent 1  = x, right?

        return (x * exp(x, m - 1)); // this is everything else.
    }
}


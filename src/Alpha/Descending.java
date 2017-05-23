package Alpha;

/**
 * Created by ronald on 26/11/16.
 */
public class Descending {
    public static void main(String[] args) {
        descending(5);
    }

    public static void descending(int value) {
        System.out.println(value);
        if (value == 1) {
            return;
        }
        descending(value - 1);
    }
}

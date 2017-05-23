package Alpha;

/**
 * Created by ronald on 20/11/16.
 */
public class Ascending {

    static int count = 0;

    static void planet() {
        count++;

        if (count <= 5) {
            System.out.println("Star" + count);
            planet();// <-- <-- <-- This is the recursive moment.
        }
    }

    public static void main(String[] args) {
        planet();
    }
}

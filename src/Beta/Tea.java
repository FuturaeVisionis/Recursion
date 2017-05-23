package Beta;

import java.util.Scanner;

/**
 * Created by ronald on 22/11/16.
 */
public class Tea {

    static int time;

    public static void leaves(int number) {
        if (number ==15) {
            System.out.println("It's always time for a cup of tea after 3?");
        } else {
            System.out.println(number + " o clock");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            leaves(number + 1);
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time: ");
        int cup = scanner.nextInt();

        leaves(cup);
    }
}

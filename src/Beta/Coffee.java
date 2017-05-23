package Beta;

import java.util.Scanner;

/**
 * Created by ronald on 22/11/16.
 */
public class Coffee {

    static String bean;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        bean = scanner.nextLine();


        Brands(bean);

    }

    public static void Brands(String name) {


        if (name.length() > 0) {
            System.out.println(name);
            Brands(name.substring(0, name.length() - 1));

        }
    }
}


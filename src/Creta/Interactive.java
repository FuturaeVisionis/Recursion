package Creta;

import java.util.Scanner;

/**
 * Created by ronald on 26/11/16.
 */
public class Interactive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str, another = "y";
        int left, right, count = 0, remain;

        while (another.equalsIgnoreCase("y")) {
            System.out.println("Enter a string to test if it is a palindrome and press enter: ");

            str = scan.nextLine();

            left = 0;
            right = str.length() - 1;

            while ((str.charAt(left) == str.charAt(right) && (left < right))) {
                left++;
                right--;

                // start adding to the left en subtracting to the right until left and right have te same char, but remember
                // the left must always be smaller than the right!

            }

            System.out.println();

            if (left < right) {
                System.out.println("That's not a palindrome.");
                System.out.println("However there were " + count + " common characters on both sides.");
                remain = (str.length() - (2 * count));
                System.out.println("There are " + remain + " characters incorrectly matched");
            } else {
                System.out.println("Yes! That's a palindrome");
            }

            System.out.println();

            System.out.println("Would you like to try another palindrome (y/n)");
            another = scan.nextLine();
        }
    }
}


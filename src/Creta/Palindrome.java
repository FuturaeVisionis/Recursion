package Creta;

/**
 * Created by ronald on 23/11/16.
 */
public class Palindrome {


    /*
    There are two base cases:

    (1) the string size is 0 or 1
    (2) the two end characters are not the same.

     */

    public static boolean isPalindrome(String s) {

        if (s.length() <= 1) // base 1
            return true;

        else if (s.charAt(0) != s.charAt(s.length() - 1)) // base 2 (the first is not same as the word minus last char)
            return false; // therefore: first char (at 0) IS NOT THE SAME as the one before last, then return false

        else
            return isPalindrome(s.substring(1, s.length() - 1)); // if the second char (at 1) is equal to the one
        // before last, then return true.

    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("abba"));
        //System.out.println(isPalindrome("moon"));
        //System.out.println(isPalindrome("dodod"));
        System.out.println(isPalindrome("cassac"));

    }

}

/*
The substring method in line 16 creates a new string that is the same as the original string except without the first
and last characters. Checking whether a string is a palindrome is equivalent to checking whether the substring is a
palindrome if the two end characters in the original string are the same.
 */

/*
Given a string, detect if it is a palindrome.
        * Palindrome is a sequence of chars which reads the same backward or forward.

        Format
        Input
        {string}

        Output
        {is palindrome | isn't palindrome}

        Example
        Input
        madam

        Output
        is palindrome
*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        if (words.equals(new StringBuilder(words).reverse().toString())) {
            System.out.println(words + " is palindorme!");
        } else {
            System.out.println(words + " is not palindome!");
        }
    }
}

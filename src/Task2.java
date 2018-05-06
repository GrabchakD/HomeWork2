/*
Given an array of characters char[] length of N.
        Please, reverse part of the array, from i to j indexes. Try to make it in-place (without additional memory).
        0 <= i <= j < N.

        Example
        Input
        2 4 - i, j indexes. abcdefg

        Output
        abedcfg - substring "cde" was reversed to "edc".
*/


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 7;
        int indexStart = 2;
        int indexEnd = 4;
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 0; i < ch.length; i++) {
            if (i > indexStart - 1 && i - 1 <= indexEnd +1) {
                System.out.print(ch[indexEnd]);
                indexEnd--;
            } else {
                System.out.print(ch[i]);
            }

        }
    }
}


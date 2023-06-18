package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題8
 * 
 * 2つの整数m,nを入力し、最大公約数を求めて表示せよ。
 */
public class Task8 {

    public static final String OUTPUT_FORMAT = "%sと%sの最大公約数は: %s";
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int firstInput = scanner.nextInt();
            int secondInput = scanner.nextInt();

            int m = firstInput;
            int n = secondInput;

            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            
            System.out.println(String.format(OUTPUT_FORMAT,firstInput,secondInput,m));
        }
    }
}


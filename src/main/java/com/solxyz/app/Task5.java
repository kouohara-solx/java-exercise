package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題5
 * 
 * 1～9までの整数を1つ入力し、入力された数の段の九九を表示せよ。
 * 1～9以外の数字が入力された場合は「エラー」と表示せよ。
 */
public class Task5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("エラー");
            } else {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(n + " * " + i + " = " + n * i);
                }
            }
        }
    }
}

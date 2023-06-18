package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題2
 * 
 * 変数x,yに整数を入力し、加算、減算、乗算、除算を行い結果を表示せよ。
 */
public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("加算: " + (x + y));
            System.out.println("減算: " + (x - y));
            System.out.println("乗算: " + (x * y));
            System.out.println("除算: " + ((double) x / y));
        }
    }
}


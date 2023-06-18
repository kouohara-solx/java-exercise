package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題6
 * 
 * 2つの整数を入力し、小さい数から大きい数までの総和を求めて表示せよ。
 */
public class Task6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);
            int sum = 0;

            for (int i = min; i <= max; i++) {
                sum += i;
            }

            System.out.println("Sum: " + sum);
        }
    }
}


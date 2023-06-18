package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題3
 * 
 * 整数を入力し、その値が100以下なら「小さい」と、100を越えていれば「大きい」と表示せよ。
 */
public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            if (n <= 100) {
                System.out.println("小さい");
            } else {
                System.out.println("大きい");
            }
        }
    }
}


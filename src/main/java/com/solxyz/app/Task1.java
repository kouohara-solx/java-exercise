package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題1
 * 
 * 変数x,yに1文字ずつ入力し、その変数を交換後、結果を表示せよ。
 */
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char x = scanner.next().charAt(0);
            char y = scanner.next().charAt(0);

            char temp = x;
            x = y;
            y = temp;

            System.out.println("x: " + x + ", y: " + y);
        }
    }
}

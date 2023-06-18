package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題4
 * 
 * １文字入力し、大文字('A'～'Z')ならば「大文字」と、
 * 小文字('a'～'z')ならば「小文字」と表示せよ。それ以外は「エラー」と表示せよ。
 */
public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            char c = scanner.next().charAt(0);

            if (Character.isUpperCase(c)) {
                System.out.println("大文字");
            } else if (Character.isLowerCase(c)) {
                System.out.println("小文字");
            } else {
                System.out.println("エラー");
            }
        }
    }
}

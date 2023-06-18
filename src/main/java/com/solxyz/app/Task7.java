package com.solxyz.app;

/**
 * 課題7
 * 
 * 1から100までの偶数の合計を求めて表示せよ。
 */
public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1から100までの偶数の合計: " + sum);
    }
}


package com.solxyz.app;

import java.util.Scanner;

/**
 * 課題9
 * 
 * 50円切手と、80円切手を買いに、郵便局に行った。
 * 所持金はキーボードから入力された額とする。
 * お釣りをもらうのは面倒なので、所持金ぴったりの額で買いたいが、
 * 何枚ずつ買えば良いか？買える全てのケースを表示せよ。
 * 
 * 所持金ぴったり買えない場合は「ぴったりは買えません」と表示せよ。
 */
public class Task9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int money = scanner.nextInt();

            boolean canBuyExact = false;
            for (int i = 0; i <= money / 50; i++) {
                for (int j = 0; j <= money / 80; j++) {
                    if (50 * i + 80 * j == money) {
                        System.out.println("50円切手: " + i + "枚, 80円切手: " + j + "枚");
                        canBuyExact = true;
                    }
                }
            }
            if (!canBuyExact) {
                System.out.println("ぴったりは買えません");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("数字を入力してください");
        }
    }
}

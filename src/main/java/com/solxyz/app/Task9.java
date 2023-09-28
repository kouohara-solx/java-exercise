package com.solxyz.app;

import java.util.ArrayList;
import java.util.List;

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
    

    /**
     * 50円切手と80円切手をピッタリ買うことができるか判定する
     * 買える場合は、何枚ずつ買えば良いかを表示する
     * 
     * @param money　所持金
     * @return　ピッタリ買える場合はtrue、買えない場合はfalse
     */
    public boolean canBuyExact(int money) {
        List<String> messages = new ArrayList<>();
        for (int i = 0; i <= money / 50; i++) {
            for (int j = 0; j <= money / 80; j++) {
                if (50 * i + 80 * j == money) {
                    messages.add("50円切手: " + i + "枚, 80円切手: " + j + "枚");
                }
            }
        }
        if (messages.size() == 0) {
            return false;
        }
        for (String message : messages) {
            System.out.println(message);
        }
        return true;
    }
}

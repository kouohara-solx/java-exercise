package com.solxyz.app;

/**
 * 課題8
 * 
 * 2つの整数m,nを入力し、最大公約数を求めて表示せよ。
 */
public class Task8 {


    /**
     * 最大公約数を求める
     * 
     * @param firstInput
     * @param secondInput
     * @return 最大公約数
     */
    public int findGreatestCommonDivisor(int firstInput, int secondInput) {
        int m = firstInput;
        int n = secondInput;

        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}


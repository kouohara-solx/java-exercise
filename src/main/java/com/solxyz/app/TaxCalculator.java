package com.solxyz.app;
/**
 * 消費税を計算するクラス
 * 
 * このクラスは、日本の消費税を計算するクラスです。
 * 一般税率と軽減税率の計算を行います。
 * 
 */
public class TaxCalculator {

    // 日本の一般消費税率
    private static final double STANDARD_TAX_RATE = 0.10;
    
    // 日本の軽減消費税率
    private static final double REDUCED_TAX_RATE = 0.08;

    /**
     * 一般税率で消費税を計算するメソッド
     * @param amount 税抜き価格
     * @return 消費税額
     */
    public double calculateStandardTax(double amount) {
        return amount * STANDARD_TAX_RATE;
    }

    /**
     * 軽減税率で消費税を計算するメソッド
     * @param amount 税抜き価格
     * @return 消費税額
     */
    public double calculateReducedTax(double amount) {
        return amount * REDUCED_TAX_RATE;
    }

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        double amount = 1000;  // 例: 1000円の商品
        
        // 一般税率での消費税額を計算
        double standardTax = calculator.calculateStandardTax(amount);
        System.out.println("Standard Tax: " + standardTax + " yen");
        
        // 軽減税率での消費税額を計算
        double reducedTax = calculator.calculateReducedTax(amount);
        System.out.println("Reduced Tax: " + reducedTax + " yen");
    }
}

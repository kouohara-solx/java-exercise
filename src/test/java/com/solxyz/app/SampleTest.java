package com.solxyz.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import org.junit.Test;

public class SampleTest {
    /**
     * TaxCalculatorのテストモックなし
     */
    @Test
    public void testTaxCalculatorWithoutMock() {
        TaxCalculator taxCalculator = new TaxCalculator();
        double actualStandardTax = taxCalculator.calculateStandardTax(100);
        assertEquals(10, actualStandardTax, 0.001);
        double actualReducedTax = taxCalculator.calculateReducedTax(100);
        assertEquals(8, actualReducedTax, 0.001);
    }
    /**
     * TaxCalculatorのテストモックあり
     */
    @Test
    public void testTaxCalculatorWithMock() {
 
        // Mockitoを使って、TaxCalculatorをモックする
        TaxCalculator taxCalculator = org.mockito.Mockito.mock(TaxCalculator.class);
        // Mockitoを使って、calculateStandardTaxメソッドの戻り値を100にする
        when(taxCalculator.calculateStandardTax(anyDouble())).thenReturn(100.0);
        double actualStandardTax = taxCalculator.calculateStandardTax(100);
        // モックしているので、110ではなくて100になる
        assertEquals(100, actualStandardTax, 0.001);
        // 引数が100であること、一回呼ばれていることを検証
        verify(taxCalculator, times(1)).calculateStandardTax(100);

        // Mockitoを使って、calculateReducedTaxメソッドの戻り値を100にする
        // 次の行をコメントするとactualReducedTaxが0.0となりエラー。モックを使うと実際のロジックは呼ばれない。
        when(taxCalculator.calculateReducedTax(anyDouble())).thenReturn(100.0);

        double actualReducedTax = taxCalculator.calculateReducedTax(100);
        // モックした値が返却される
        assertEquals(100, actualReducedTax, 0.001);
        // 引数が100であること、一回呼ばれていることを検証
        verify(taxCalculator, times(1)).calculateReducedTax(100);


    }

        /**
     * TaxCalculatorのスパイあり
     */
    @Test
    public void testTaxCalculatorWithSpy() {
 
        // Mockitoを使って、TaxCalculatorをモックする
        TaxCalculator taxCalculator = org.mockito.Mockito.spy(TaxCalculator.class);
        // Mockitoを使って、calculateStandardTaxメソッドの戻り値を100にする
        when(taxCalculator.calculateStandardTax(anyDouble())).thenReturn(100.0);
        double actualStandardTax = taxCalculator.calculateStandardTax(100);
        // モックしているので、110ではなくて100になる
        assertEquals(100, actualStandardTax, 0.001);
        // 引数が100であること、一回呼ばれていることを検証
        verify(taxCalculator, times(1)).calculateStandardTax(100);

        // Mockitoを使って、calculateReducedTaxメソッドの戻り値を100にする
        // コメントしている。Spyの場合は、モックしなくても、実際のメソッドが呼ばれるのでコメントを解除するとエラーになる
        // when(taxCalculator.calculateReducedTax(anyDouble())).thenReturn(100.0);

        double actualReducedTax = taxCalculator.calculateReducedTax(100);
        // 実際のメソッドが呼ばれるので、8になる
        assertEquals(8, actualReducedTax, 0.001);
        // 引数が100であること、一回呼ばれていることを検証
        verify(taxCalculator, times(1)).calculateReducedTax(100);


    }
}

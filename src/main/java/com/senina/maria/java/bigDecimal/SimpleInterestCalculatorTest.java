package com.mycompany.java.BigDecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculatorTest {

    public static void main(String[] args) {

        SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","7.5");

        BigDecimal totalValue = calculator.calculateTotalValue(5);

        System.out.println(totalValue);
    }
}

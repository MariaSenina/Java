package com.mycompany.java.BigDecimal;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    private BigDecimal principal;
    private BigDecimal interest;

    //constructor
    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

//    //setters
//    public void setPrincipal(String principal) {
//        this.principal = principal;
//    }
//
//    public void setInterest(String interest) {
//        this.interest = interest;
//    }

    //getters
    public BigDecimal getPrincipal() {
        return principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public BigDecimal calculateTotalValue(int numberOfYears) {
        BigDecimal numberOfYearsBigDecimal = new BigDecimal(numberOfYears);

        BigDecimal totalSum = principal.add(principal.multiply(interest).multiply(numberOfYearsBigDecimal));

        return totalSum;
    }
}

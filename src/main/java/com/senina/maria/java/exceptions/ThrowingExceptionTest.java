package com.senina.maria.java.exceptions;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //whenever you're throwing a checked exception, you need to put it in the method signature
    public void add(Amount that) throws CurrenciesDoNotMatchException {
        if(!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies don't match: " + this.currency + " & " + that.currency);
        }

        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends Exception {
    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}

public class ThrowingExceptionTest {
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}

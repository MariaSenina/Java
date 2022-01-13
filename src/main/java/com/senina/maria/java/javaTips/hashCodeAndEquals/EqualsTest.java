package com.senina.maria.java.javaTips.hashCodeAndEquals;

import java.util.Objects;

class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    //ALWAYS implement 'hashCode' together with 'equals'

    //Default implementation of equals() only compares addresses in memory, not attributes
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (!(that instanceof Client)) return false;
        Client client = (Client) that;
        return id == client.id;
    }

    //if two objects are equal (their IDs are the same), then their hashCodes should also be the same
    //the value of the hashCode should not change, unless the ID changes
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Client c1 = new Client(1);
        Client c2 = new Client(1);

        System.out.println(c1.equals(c2));
    }
}

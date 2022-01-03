package com.senina.maria.java.objectComposition;

public class Address {
    private int streetNumber;
    private String streetName;
    private String city;
    private String postalCode;

    public Address(int streetNumber, String streetName, String city, String postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String toString() {
        return String.format("Street number - %d, Street name - %s, City - %s, Postal code - %s",
                streetNumber, streetName, city, postalCode);
    }
}

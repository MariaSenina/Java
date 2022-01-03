package com.senina.maria.java.objectComposition;

public class CustomerTest {
    public static void main(String[] args) {
        Address homeAddress = new Address(123, "Main street", "Kingston", "K7L3A3");
        Customer customer1 = new Customer("Rexxinho", homeAddress);

        Address workAddress = new Address(12, "Queen street", "Kingston", "K7L7A7");
        customer1.setWorkAddress(workAddress);

        System.out.println(customer1);
    }
}

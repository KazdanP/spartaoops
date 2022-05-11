package com.sparta.oop.retailstore.people;

public class Customer extends Person {

    private final int customerId;

    public Customer(final String firstName, final String lastName, final int customerId) {
        super(firstName, lastName, customerId);
        this.customerId = customerId;
    }

    public int getCustomerId() {return customerId;}

    @Override
    public String toString() {
        return "Customer #" + customerId + ": " + super.toString();
    }
}

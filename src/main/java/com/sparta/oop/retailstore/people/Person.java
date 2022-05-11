package com.sparta.oop.retailstore.people;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected int id;

    protected Person(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public int getId() { return id; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}

package com.sparta.oop.retailstoretest;

import com.sparta.oop.retailstore.people.Customer;
import com.sparta.oop.retailstore.people.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RetailStoreTest {

    @Test
    public void createACustomerTest() {
        Customer customer = new Customer("Bob", "Builder", 1);

        String customerAsString = customer.toString();
        boolean equalEachOther = "Customer #1: Bob Builder".equals(customerAsString);

        Assertions.assertTrue(equalEachOther);
    }

    @Test
    public void createAnEmployee() {
        Employee employee = new Employee("Biggs", "Darklighter", "Space Force", 103000, 1);

        String employeeAsString = employee.toString();
        boolean equalEachOther = "Employee #1: Biggs Darklighter, Space Force".equals(employeeAsString);

        Assertions.assertTrue(equalEachOther);
    }
}

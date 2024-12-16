package com.example.springgreeting1.service;

import com.example.springgreeting1.model.Customer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerServiceImpl  implements CustomerService {
    @Override
    public List<Customer> findAll() {
        return Arrays.asList(
                new Customer(1, "John Doe", "john@example.com", "123 Main St"),
                new Customer(2, "Jane Doe", "jane@example.com", "456 Elm St")
        );
    }
}

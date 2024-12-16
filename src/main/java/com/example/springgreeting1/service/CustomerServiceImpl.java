package com.example.springgreeting1.service;

import com.example.springgreeting1.model.Customer;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class CustomerServiceImpl  implements CustomerService {
    private final List<Customer> customers = new ArrayList<>();
    private int currentId = 3;


    public CustomerServiceImpl() {
        customers.add(new Customer(1, "Hậu", "hau@example.com", "99 Kim Kình"));
        customers.add(new Customer(2, "Kiên", "kien@example.com", "66 Tính Tình"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addCustomer(Customer customer) {
        customer.setId(currentId++);
        customers.add(customer);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {
        Optional<Customer> existingCustomer = customers.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
        existingCustomer.ifPresent(c -> {
            c.setName(customer.getName());
            c.setEmail(customer.getEmail());
            c.setAddress(customer.getAddress());
        });
    }

    @Override
    public void deleteCustomer(int id) {
        customers.removeIf(customer -> customer.getId() == id);
    }
}

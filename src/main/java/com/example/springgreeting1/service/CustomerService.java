package com.example.springgreeting1.service;

import com.example.springgreeting1.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    void addCustomer(Customer customer);
    void updateCustomer(int id, Customer customer);
    void deleteCustomer(int id);
}

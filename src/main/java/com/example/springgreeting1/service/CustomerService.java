package com.example.springgreeting1.service;

import com.example.springgreeting1.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}

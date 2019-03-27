package com.api.rest.demo.service;

import com.api.rest.demo.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
}

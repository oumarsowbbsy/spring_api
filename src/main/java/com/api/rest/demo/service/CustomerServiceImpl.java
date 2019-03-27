package com.api.rest.demo.service;

import com.api.rest.demo.domain.Customer;
import com.api.rest.demo.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private CustomerRepository customerRepository;

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> findAllCustomers()
    {
        return customerRepository.findAll();
    }
}

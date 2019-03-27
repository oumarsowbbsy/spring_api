package com.api.rest.demo.service;

import com.api.rest.demo.domain.Customer;
import com.api.rest.demo.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {


    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;

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

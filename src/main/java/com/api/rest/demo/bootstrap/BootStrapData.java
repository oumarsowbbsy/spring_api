package com.api.rest.demo.bootstrap;

import com.api.rest.demo.domain.Customer;
import com.api.rest.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstname("Oumar Ousmane");
        c1.setLastname("Sow");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Babacar ");
        c2.setLastname("Sylla");
        customerRepository.save(c2);

        System.out.println("Customer Saved: " + customerRepository.count());


    }
}

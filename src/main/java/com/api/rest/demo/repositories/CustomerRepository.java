package com.api.rest.demo.repositories;

import com.api.rest.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

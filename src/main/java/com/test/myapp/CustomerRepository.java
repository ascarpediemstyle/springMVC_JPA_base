package com.test.myapp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.myapp.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    //List<Customer> findByCustomerName(String customerName);
}
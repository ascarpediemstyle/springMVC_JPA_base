package com.test.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.myapp.model.Customer;

@Service
public class CustomerService {
	 
	@Autowired
	 private CustomerRepository customerRepository;
	 
	 public List<Customer> findAll(){
	        return this.customerRepository.findAll();
	    }

}

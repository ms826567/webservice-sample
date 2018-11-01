package com.labs.springboot.service;

import com.labs.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

  private final CustomerRepository customerRepository;

  @Autowired
  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public List<String> getAllCustomers() {
    List<String> customers = customerRepository.loadCustomers();

    // business logic to hide sensitive customers
    return customers.stream()
        .filter(customerName -> customerName.startsWith("A"))
        .collect(Collectors.toList());
  }

}

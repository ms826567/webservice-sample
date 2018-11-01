package com.labs.springboot.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {

  public List<String> loadCustomers() {
    List<String> customers = new ArrayList<>();
    customers.add("Amanda");
    customers.add("Rocky");
    customers.add("John");
    customers.add("kelley");
    customers.add("Arnold");
    customers.add("Ally");

    return customers;
  }

}

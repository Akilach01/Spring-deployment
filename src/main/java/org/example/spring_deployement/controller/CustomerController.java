package org.example.spring_deployement.controller;


import org.example.spring_deployement.entity.Customer;
import org.example.spring_deployement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
     CustomerService customerService;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {

    }

    @GetMapping
    public List<Customer> findAll() {
  return
    }
}

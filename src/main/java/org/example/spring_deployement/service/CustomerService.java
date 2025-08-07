package org.example.spring_deployement.service;

import org.example.spring_deployement.entity.Customer;
import org.example.spring_deployement.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }
    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }
    public Customer update(Customer customer) {
        return customerRepo.save(customer);
    }
}

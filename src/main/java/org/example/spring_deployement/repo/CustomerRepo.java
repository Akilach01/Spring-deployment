package org.example.spring_deployement.repo;

import org.example.spring_deployement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}

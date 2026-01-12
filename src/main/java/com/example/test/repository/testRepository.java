package com.example.test.repository;

import com.example.test.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface testRepository extends JpaRepository<Customer, Long> {
}

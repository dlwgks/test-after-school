package com.example.test.dto;

import com.example.test.entity.Customer;
import lombok.Getter;

@Getter
public class ResponseGetCustomer {
    private Long id;
    private String name;


    public ResponseGetCustomer(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();
    }
}
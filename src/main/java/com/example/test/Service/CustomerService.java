package com.example.test.Service;

import com.example.test.dto.ResponseGetCustomer;
import com.example.test.repository.testRepository;
import com.example.test.repository.testRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerService {
    private final testRepository testRepository;

    public List<ResponseGetCustomer> getCustomers(){
        return testRepository.findAll()
                .stream()
                .map(ResponseGetCustomer::new)
                .toList();
    }
}

package com.natan.hexagonal.adapters.out;

import com.natan.hexagonal.adapters.out.repository.CustomerRepository;
import com.natan.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.natan.hexagonal.application.core.domain.Customer;
import com.natan.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;



    @Override
    public void insert(Customer customer) {
        var costumerEntity = customerEntityMapper.toCostumerEntity(customer);
        customerRepository.save(costumerEntity );
    }
}

package com.natan.hexagonal.adapters.out;

import com.natan.hexagonal.adapters.out.repository.CustomerRepository;
import com.natan.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.natan.hexagonal.application.core.domain.Customer;
import com.natan.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapater implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCostumerEntity(customer);
        customerRepository.save(customerEntity);

    }

}

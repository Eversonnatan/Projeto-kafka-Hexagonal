package com.natan.hexagonal.adapters.out;
import com.natan.hexagonal.adapters.out.repository.CustomerRepository;
import com.natan.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.natan.hexagonal.application.core.domain.Customer;
import com.natan.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component
import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));

    }
}

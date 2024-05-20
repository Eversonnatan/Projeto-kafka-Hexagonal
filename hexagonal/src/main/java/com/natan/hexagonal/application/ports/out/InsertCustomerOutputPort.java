package com.natan.hexagonal.application.ports.out;

import com.natan.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);


}

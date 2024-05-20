package com.natan.hexagonal.application.ports.in;

import com.natan.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}

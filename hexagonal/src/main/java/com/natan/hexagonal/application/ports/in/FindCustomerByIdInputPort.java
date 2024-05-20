package com.natan.hexagonal.application.ports.in;

import com.natan.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}

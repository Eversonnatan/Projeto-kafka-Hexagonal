package com.natan.hexagonal.application.core.usecase;

import com.natan.hexagonal.application.core.domain.Customer;
import com.natan.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.natan.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUserCase implements FindCustomerByIdInputPort {

    private  final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUserCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort){
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return  findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

    }
}

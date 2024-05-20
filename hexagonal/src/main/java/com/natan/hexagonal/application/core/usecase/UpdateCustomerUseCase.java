package com.natan.hexagonal.application.core.usecase;

import com.natan.hexagonal.application.core.domain.Customer;
import com.natan.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.natan.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.natan.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.natan.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase (
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort

    ) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }


    @Override
    public void update(Customer customer, String zipcode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipcode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);



    }
}

package com.natan.hexagonal.application.core.usecase;

import com.natan.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.natan.hexagonal.application.ports.in.DeleteteCustomerByIdInputPort;
import com.natan.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteteCustomerByIdInputPort {

    public final FindCustomerByIdOutputPort findCustomerByIdOutputPort;
    public final DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    public  DeleteCustomerByIdUseCase(FindCustomerByIdUserCase findCustomerByIdOutputPort,
                                      DeleteCustomerByIdAdapter deleteCustomerByIdUseCase)
    {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
        this .deleteCustomerByIdUseCase = deleteCustomerByIdUseCase;

    }

    @Override
    public void  delete(String id){
        findCustomerByIdOutputPort.find(id);
        deleteCustomerByIdUseCase.delete(id);


    }
}

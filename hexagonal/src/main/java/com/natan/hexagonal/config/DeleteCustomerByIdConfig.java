package com.natan.hexagonal.config;

import com.natan.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.natan.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.natan.hexagonal.application.core.usecase.FindCustomerByIdUserCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {


    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUserCase findCustomerByIdUserCase ,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
    return  new DeleteCustomerByIdUseCase(findCustomerByIdUserCase,deleteCustomerByIdAdapter);
    }

}

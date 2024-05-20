package com.natan.hexagonal.config;

import com.natan.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.natan.hexagonal.adapters.out.UpdateCustomerAdapater;
import com.natan.hexagonal.application.core.usecase.FindCustomerByIdUserCase;
import com.natan.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUserCase findCustomerByIdUserCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapater updateCustomerAdapater

    ){
        return  new UpdateCustomerUseCase(findCustomerByIdUserCase, findAddressByZipCodeAdapter,updateCustomerAdapater);
    }


}

package com.natan.hexagonal.config;

import com.natan.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.natan.hexagonal.adapters.out.InsertCustomerAdapter;
import com.natan.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.natan.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ){
return new InsertCustomerUseCase(
    findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);


    }

}

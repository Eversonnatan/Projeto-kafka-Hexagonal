package com.natan.hexagonal.config;

import com.natan.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.natan.hexagonal.application.core.usecase.FindCustomerByIdUserCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {
    @Bean
    public FindCustomerByIdUserCase findCustomerByIdUserCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ){
        return new FindCustomerByIdUserCase(findCustomerByIdAdapter);
    }
}

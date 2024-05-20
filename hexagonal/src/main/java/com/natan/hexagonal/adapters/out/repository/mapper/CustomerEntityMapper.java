package com.natan.hexagonal.adapters.out.repository.mapper;

import com.natan.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.natan.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCostumerEntity(Customer customer);

    Customer  toCustomer (CustomerEntity customerEntity);





}

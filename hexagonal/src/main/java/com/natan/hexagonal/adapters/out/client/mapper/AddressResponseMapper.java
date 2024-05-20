package com.natan.hexagonal.adapters.out.client.mapper;

import com.natan.hexagonal.adapters.out.client.response.AddressResponse;
import com.natan.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}

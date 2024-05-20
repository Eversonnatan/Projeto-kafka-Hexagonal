package com.natan.hexagonal.application.ports.out;

import com.natan.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
